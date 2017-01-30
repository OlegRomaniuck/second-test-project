package model.page_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import property.util.Util_Displayed_ElementLocatorFactory;

public class Page_Manager {
    protected WebDriverWait wait;
    private WebDriver driver;

    public Page_Manager(WebDriver driver) {
        this.driver = driver;
    }

    public <T extends Page_Abstract> T initElements(T page) {
        PageFactory.initElements(new Util_Displayed_ElementLocatorFactory(driver, 100), page);
        return page;
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
