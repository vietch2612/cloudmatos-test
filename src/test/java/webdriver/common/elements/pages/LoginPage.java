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
        usernameTextBox.sendKeys("cloudmatos");
        passwordTextBox.sendKeys("'E}Q=muy[b--chm");
        signInButton.click();

        Thread.sleep(2_000);

        return new DashboardPage();
    }
}
