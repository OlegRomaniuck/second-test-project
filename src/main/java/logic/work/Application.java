package logic.work;

import org.openqa.selenium.WebDriver;


import property.util.Util_Browser;
import property.util.Util_Navigation;
import property.util.Util_Property_Loader;
import property.util.Util_WebDriver_Factory;


public class Application {
    protected WebDriver driver;
    private Util_Navigation navigator;
    private String baseUrl;
    String username;

    public Application() {

        baseUrl = Util_Property_Loader.loadProperty("site.url");
        String gridHubUrl = Util_Property_Loader.loadProperty("grid2.hub");
        Util_Browser browser = new Util_Browser();
        browser.setName(Util_Property_Loader.loadProperty("browser.name"));
        browser.setVersion(Util_Property_Loader.loadProperty("browser.version"));
        browser.setPlatform(Util_Property_Loader.loadProperty("browser.platform"));
        username = Util_Property_Loader.loadProperty("user.username");
        String password = Util_Property_Loader.loadProperty("user.password");
        driver = Util_WebDriver_Factory.getInstance(gridHubUrl, browser, username, password);
        navigator = new Util_Navigation(this);
    }

    public String getUserName() {
        return username;

    }

    public Util_Navigation getNavigator() {
        return navigator;
    }

    public void stop() {
        if (driver != null) {

            driver.quit();

        }


    }

    public WebDriver getWebDriver() {


        return driver;

    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
