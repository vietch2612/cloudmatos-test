package webdriver.common.elements.pages;

import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.BasePageObject;

public class LoginPage extends BasePageObject {

    @FindBy(id = "username")
    public WebElement usernameTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(id = "signin_button")
    public WebElement signInButton;

    @SneakyThrows
    public DashboardPage login() {
        logger.info("Logging in to WMS Console");
        usernameTextBox.sendKeys("");
        passwordTextBox.sendKeys("");
        signInButton.click();

        logger.info("Login successfully, waiting a few seconds for loading");
        Thread.sleep(2_000);

        return new DashboardPage();
    }
}
