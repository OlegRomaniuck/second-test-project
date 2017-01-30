package property.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Tool_Count_Link_By_XML_Site_Map {

    public void COUNT_By_Site_Map_XML(WebDriver driver, String url) throws InterruptedException {
        driver.get(url);

        List<WebElement> allLinks = driver.findElements(By.cssSelector("div.expanded > div.collapsible-content > div:nth-child(2) > span.text"));

        int countLink = 0;

        for (WebElement el : allLinks) {
            countLink++;
            new Tool_HighLights().HighLightElement(driver, el);
            System.out.println(el.getText());
        }

        System.out.println(countLink);
    }
}

