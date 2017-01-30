package property.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

public class Util_Displayed_ElementLocatorFactory implements ElementLocatorFactory {
    private final WebDriver driver;
    private final int timeOutInSeconds;

    public Util_Displayed_ElementLocatorFactory(WebDriver driver, int timeOutInSeconds) {
        this.driver = driver;
        this.timeOutInSeconds = timeOutInSeconds;
    }

    public ElementLocator createLocator(Field field) {
        return new Util_Displayed_Element_Locator(driver, field, timeOutInSeconds);
    }
}
