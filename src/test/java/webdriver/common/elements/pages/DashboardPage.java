package webdriver.common.elements.pages;

import org.openqa.selenium.WebElement;
import webdriver.BasePageObject;
import webdriver.common.elements.pages.eks.EksHomePage;

public class DashboardPage extends BasePageObject {

    public EksHomePage openEks() {
        driver.get("https://us-west-2.console.aws.amazon.com/eks/home?region=us-west-2#/clusters");
        return new EksHomePage();
    }
}
