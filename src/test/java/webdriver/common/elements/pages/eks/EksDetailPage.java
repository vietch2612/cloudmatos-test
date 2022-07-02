package webdriver.common.elements.pages.eks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.BasePageObject;
import webdriver.common.elements.pages.vpc.VpcSecurityGroupPage;

public class EksDetailPage extends BasePageObject {

    @FindBy(xpath = "//span[contains(text(), 'Networking')]")
    public WebElement networkingTab;

    @FindBy(xpath = "//a[contains(text(), 'sg-0c71d197b5f097014')]")
    public WebElement clusterSecurityGroup;

    public VpcSecurityGroupPage openSecurityGroupPage() {
        networkingTab.click();
        clusterSecurityGroup.click();
        return new VpcSecurityGroupPage();
    }

}
