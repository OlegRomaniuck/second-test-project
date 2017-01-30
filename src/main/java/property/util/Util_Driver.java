package property.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import model.page_base.Page_Manager;

public class Util_Driver {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Page_Manager pages;

    public Util_Driver(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        pages = new Page_Manager(driver);
    }
}
