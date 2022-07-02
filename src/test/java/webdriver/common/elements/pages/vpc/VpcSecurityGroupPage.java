package webdriver.common.elements.pages.vpc;

import lombok.SneakyThrows;
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

        inboundRulesTab.click();
        return this;
    }

    public boolean isTypeHttps() {
        return type.getText().equals("HTTPS");
    }

    public boolean isProtocolTcp() {
        return protocol.getText().equals("TCP");
    }

    public boolean isPortRange443() {
        return portRange.getText().equals("443");
    }
}
