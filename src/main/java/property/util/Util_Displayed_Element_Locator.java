package property.util;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import property.tools.ExplicitWaitCustomOfVisibility;
import property.tools.SpecialClassToWaitElement;
import property.tools.Tool_Thread_Wait;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

public class Util_Displayed_Element_Locator extends AjaxElementLocator {


    public Util_Displayed_Element_Locator(WebDriver driver, Field field, int timeOutInSeconds) {
        super(driver, field, timeOutInSeconds);

    }

    protected boolean isElementUsable(WebElement element) {

        return element.isDisplayed();
    }
}