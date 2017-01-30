package property.tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tool_HighLights {
    /*
    * if run = 0, class Tool_HighLight switch off
	* if run = 1, class Tool_HighLight switch on
	*
	* */

    private int run = 0;

    public void HighLightElement(WebDriver driver, WebElement element) {
        if (run == 1) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
        }
    }

    public void HE_One(WebDriver driver, WebElement element) {
        run = 1;
        if (run == 1) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
        }
    }
}
