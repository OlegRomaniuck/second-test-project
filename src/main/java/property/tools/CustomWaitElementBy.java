package property.tools;

import logic.init.Initialize;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tester3 on 30.07.2015.
 */
public class CustomWaitElementBy extends Initialize {


    WebDriver driver = getInitWebDriver();
    WebElement custom_element = null;

    public WebElement customWaitBy(String type, String path) {


        if (type.equals("xpath")) {


            custom_element = driver.findElement(By.xpath(path));
            custom_wait_ofvisible(type, custom_element);

        } else if (type.equals("id")) {

            custom_wait_ofvisible(type, custom_element);
        } else if (type.equals("css")) {
            custom_element = driver.findElement(By.cssSelector(path));
            custom_wait_ofvisible(type, custom_element);
        } else if (type.equals("text")) {
            custom_element = driver.findElement(By.partialLinkText(path));
            custom_wait_ofvisible(type, custom_element);
        } else if (type.equals("contain")) {
        } else if (type.equals("name")) {
            custom_element = driver.findElement(By.name(path));
            custom_wait_ofvisible(type, custom_element);
        } else if (type.equals("class")) {
            custom_element = driver.findElement(By.className(path));
            custom_wait_ofvisible(type, custom_element);
        }


        return custom_element;

    }


    public void custom_wait_ofvisible(String path, WebElement custom_el) {
        try {
            WebDriverWait custom_wait = new WebDriverWait(driver, 15);
            custom_wait.until(ExpectedConditions.visibilityOf(custom_el));
        } catch (Exception execpt) {
            WebDriverWait custom_wait_ofpresents = new WebDriverWait(driver, 10);
            custom_wait_ofpresents.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        }

    }

}
