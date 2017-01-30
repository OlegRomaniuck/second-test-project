package property.tools;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tester3 on 01.08.2015.
 */
public class MyPersonalisDispalyElement {
WebElement element_personal;
    int count=0;
    WebElement element;
    WebElement element2;
    public WebElement customWaitBy(WebDriver  driver, By by){




        count++;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

            FluentWait  wait = new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(200,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
           element = (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(by));
          //  wait.until(ExpectedConditions.);
           new  Tool_Thread_Wait().Thread_Wait(1, 500);
         if( element.isDisplayed()){
            // new  Tool_Thread_Wait().Thread_Wait(1, 100);
             element_personal=element;
             //return element_personal;
          }
            else{
             driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            WebElement element_vis= driver.findElement(by);
             FluentWait  wait_two = new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(200,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
            wait_two.until(ExpectedConditions.visibilityOf(element_vis));
             element_personal=element_vis;
             return element_personal;
         }

        } catch (StaleElementReferenceException ex){

              new  Tool_Thread_Wait().Thread_Wait(1, 3000);
             if (count<4) {
                 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                 customWaitBy(driver, by);
             }
            else{
                 FluentWait wait_inexcept = new FluentWait(driver);
                 wait_inexcept.withTimeout(5000, TimeUnit.MILLISECONDS);
                 wait_inexcept.pollingEvery(250, TimeUnit.MILLISECONDS);
                 wait_inexcept.ignoring(NoSuchElementException.class);
                element2= (WebElement) wait_inexcept.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
                 element_personal = element2;
                 return element_personal;
             }
//return null;

        }
       return  element_personal;

    }
}
