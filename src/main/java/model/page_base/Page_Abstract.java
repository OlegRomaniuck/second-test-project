package model.page_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class Page_Abstract {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Page_Manager pages;

    public Page_Abstract(Page_Manager pages) {
        this.pages = pages;
        driver = pages.getWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    public WebDriver getWebDriver() {
        return driver;
    }



}
