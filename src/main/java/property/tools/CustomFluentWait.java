package property.tools;


import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by Tester3 on 23.11.2015.
 */
public class CustomFluentWait {

   public  WebElement customFindElement(final WebDriver driver,final   By locator,  int timeoutSeconds) throws org.openqa.selenium.TimeoutException {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(timeoutSeconds, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);

        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(locator);
            }
        });
    }

    }


