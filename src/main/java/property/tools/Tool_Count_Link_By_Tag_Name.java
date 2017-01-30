package property.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Tool_Count_Link_By_Tag_Name {

    public void COUNT_By_Tag_Name(WebDriver driver, String url) throws InterruptedException {
        driver.get(url);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int countLink = 0;

        for (WebElement el : allLinks) {
            countLink++;
            if (countLink < 10) {
                System.out.println("link [0" + countLink + "] : " + el.getText());
                System.out.println(" url [0" + countLink + "] : " + driver.getCurrentUrl());
            } else {
                System.out.println("link [" + countLink + "] : " + el.getText());
                System.out.println(" url [" + countLink + "] : " + driver.getCurrentUrl());
            }
        }
        new Tool_Thread_Wait().Thread_Wait(1, 1000);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(" TOTAL LINK :" + countLink);
    }
}

