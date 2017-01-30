package property.tools;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tester3 on 14.08.2015.
 */
public class Waiting  {
    WebElement element_personal;
    int count=0;
    WebElement element;
    WebElement element2;
    public WebElement customWaitBy(WebDriver driver, By by){


            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

            FluentWait wait = new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(200,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
            element = (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        return  element;

    }

}
