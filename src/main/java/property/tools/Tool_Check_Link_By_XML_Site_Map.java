package property.tools;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class Tool_Check_Link_By_XML_Site_Map {
    public void CHECK_By_Site_Map_XML(final WebDriver driver, String url) throws InterruptedException, org.openqa.selenium.StaleElementReferenceException {
        driver.manage().window().maximize();

        driver.get(url);

        List<WebElement> allLinks = driver.findElements(By.cssSelector("div.expanded > div.collapsible-content > div:nth-child(2) > span.text"));

        int countLink = 0;

        for (WebElement el : allLinks) {
            countLink++;
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
            new Tool_HighLights().HighLightElement(driver, el);
        }

        final List<String> hrefs = new ArrayList<String>();

        for (final WebElement anchor : allLinks) {

            new WebDriverWait(driver, 30)
                    .ignoring(TimeoutException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .until(new ExpectedCondition<Boolean>() {
                               public Boolean apply(WebDriver webDriver) {
                                   try {
                                       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", anchor);

                                       hrefs.add(anchor.getText());
                                   } catch (StaleElementReferenceException e) {
                                       return false;
                                   } catch (TimeoutException e) {
                                       System.out.print(" # time out 30 sec ");
                                       return false;
                                   }
                                   return true;
                               }
                           }
                    );

        }

        int countUrl = 0;
        for (String href : hrefs) {
            if (href != null) {
                countUrl++;

                if (driver.getTitle().equals("«» 404")) {
                    System.out.println(" Link 404: " + driver.getTitle() + ", url :" + driver.getCurrentUrl());

                    // new Tool_ScreenShot().getScreenShot(driver, "CHECK_By_Site_Map_XML_" + "«GoAntiFraud» 404");
                }

                if (href.contains("https") || href.contains("https:")) {
                    break;
                } else {
                    driver.get(href);
                }

                //System.out.println(driver.getTitle());
            } else {
                System.out.println(" link NULL : " + href + ", url : " + driver.getCurrentUrl());
            }
        }

        //System.out.println( " countLink : " + countLink);
        //System.out.println( " countUrl  : " + countUrl);
    }
}

