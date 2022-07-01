package webdriver.common.core.driver.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import webdriver.common.core.HVWebDriver;
import webdriver.common.core.driver.BrowserAbstract;
import webdriver.common.core.helper.ExtensionHelper;

import java.io.File;

/**
 * Created by hoaiviet on 5/18/17.
 * ChromeBrowser
 */
public class ChromeBrowser extends BrowserAbstract {
    private final ChromeOptions chromeOptions = new ChromeOptions();

    @Override
    public void setOptions() {
        chromeOptions.addArguments("start-maximized");
    }

    @Override
    public HVWebDriver create() {
        WebDriverManager.chromedriver().setup();
        return new HVWebDriver(new ChromeDriver(chromeOptions));
    }

    @Override
    public void addExtension(String extensionName) {
        chromeOptions.addExtensions(ExtensionHelper.findExtension(extensionName, "crx"));
    }
}
