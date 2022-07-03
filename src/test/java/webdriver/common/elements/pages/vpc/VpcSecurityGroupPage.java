package webdriver.common.elements.pages.vpc;

import lombok.SneakyThrows;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.BasePageObject;

import java.util.ArrayList;
import java.util.List;

public class VpcSecurityGroupPage extends BasePageObject {

    @FindBy(xpath = "//span[text() = 'Inbound rules']")
    public WebElement inboundRulesTab;

    @FindBy(xpath = "//span[text() = 'Edit inbound rules']")
    public WebElement editInboundRulesButton;

    @FindBy(id = "security-groups-react-frame")
    public WebElement securityFrame;

    @FindBy(xpath = "(//*[@class='awsui-table-row awsui-table-row-selected'])[2]/td[5]")
    public WebElement type;

    @FindBy(xpath = "(//*[@class='awsui-table-row awsui-table-row-selected'])[2]/td[6]")
    public WebElement protocol;

    @FindBy(xpath = "(//*[@class='awsui-table-row awsui-table-row-selected'])[2]/td[7]")
    public WebElement portRange;

    @SneakyThrows
    public VpcInboundRulesDetailPage openInboundRulesDetail() {
        inboundRulesTab.click();
        editInboundRulesButton.click();

        return new VpcInboundRulesDetailPage();
    }

    public VpcSecurityGroupPage viewInboundRules() {
        switchToNewWindow();
        driver.switchTo().frame(securityFrame);

        logger.info("Opening the Inbound rules tab");
        inboundRulesTab.click();
        return this;
    }

    public String getType() {
        String typeText = type.getText();
        logger.info("EKS Security Group Type: " + typeText);
        return typeText;
    }

    public String getProtocol() {
        String protocolText = protocol.getText();
        logger.info("EKS Security Group Protocol: " + protocolText);
        return protocolText;
    }

    public String getPortRange() {
        String portRangeText = portRange.getText();
        logger.info("EKS Security Group portRangeText: " + portRangeText);
        return portRangeText;
    }
}
