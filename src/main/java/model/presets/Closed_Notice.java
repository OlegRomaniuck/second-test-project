package model.presets;

import logic.init.Initialize;
import org.openqa.selenium.*;
import property.tools.Tool_HighLights;
import property.tools.Tool_Thread_Wait;

import java.util.concurrent.TimeUnit;


public class Closed_Notice extends Initialize {
    private WebDriver driver;
    private WebElement notice;

    public void Closed_Notice_License(WebDriver driver) throws InterruptedException {
        new Tool_Thread_Wait().Thread_Wait(1, 2000);
        // try find Add Button
        boolean present;
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            notice = driver.findElement(By.xpath(".//*[starts-with(@id, 'messagebox-')]//img"));
            new Tool_HighLights().HighLightElement(driver, notice);
            notice.isEnabled();

            present = false;
        } catch (TimeoutException e) {
            present = true;
        } catch (NoSuchElementException e) {
            present = true;
        }

        if (present) // if Notice Window not present
        {

        } else {
            notice.click();
        }
    }
}
