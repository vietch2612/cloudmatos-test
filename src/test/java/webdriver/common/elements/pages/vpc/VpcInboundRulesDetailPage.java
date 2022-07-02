package webdriver.common.elements.pages.vpc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.BasePageObject;

public class VpcInboundRulesDetailPage extends BasePageObject {

    @FindBy(xpath = "//*[@data-id='protocol-type-0']")
    public WebElement typeDropdown;

    public WebElement protocol;
    public WebElement portRange;
    public WebElement source;
    public WebElement sourceSelect;
    public WebElement description;
    public WebElement deleteButton;
    public WebElement addRuleButton;
    public WebElement cancelButton;
    public WebElement previewChangesButton;
    public WebElement saveRulesButton;

    public String getProtocol() {
        WebElement dropdownValue = typeDropdown.findElement(By.xpath(".//span[@class='awsui-select-trigger-label']"));

        if (dropdownValue != null) {
            return dropdownValue.getText();
        }
        return null;
    }

    public boolean isProtocolHttps() {
        return getProtocol().equals("HTTPS");
    }
}
