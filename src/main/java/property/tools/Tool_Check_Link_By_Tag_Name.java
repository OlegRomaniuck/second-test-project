package property.tools;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class Tool_Check_Link_By_Tag_Name {
    private String urlTemp1 = "";
    private String urlTemp2 = "";

    public void CHECK_By_Tag_Name_A(final WebDriver driver, String url) {
        driver.manage().window().maximize();

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for (int i=0; i<allLinks.size();i++){
            System.out.println("this is link "+allLinks.get(i).getText());
        }

        final List<String> hrefs = new ArrayList<String>();

        final Actions act = new Actions(driver);

        for (final WebElement anchor : allLinks) {
            new WebDriverWait(driver, 30)
                    .ignoring(TimeoutException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .until(new ExpectedCondition<Boolean>() {
                               public Boolean apply(WebDriver webDriver) {
                                   try {
                                       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", anchor);

                                       //act.moveToElement(anchor).perform();

                                       System.out.println(anchor.getText());
                                       hrefs.add(anchor.getAttribute("href"));
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

        for (String href : hrefs) {
            if (href != null && !href.equals("mailto:")) {
                try {
                    driver.get(href);
                } catch (Exception e) {
                    System.out.println(" HREF : " + href);
                    System.out.println(" URL  : " + driver.getCurrentUrl());
                }

                if (driver.getTitle().equals("«» 404")) {
                    System.out.println(" title : " + driver.getTitle() + ", url :" + driver.getCurrentUrl());

                }

                if(href.equals("mailto:")){
                    System.out.println(" we have mail sender");
                }
            } else {
                if (driver.getCurrentUrl().equals(urlTemp1) || driver.getCurrentUrl().equals(urlTemp2)) {



                } else {
                    System.out.println("                 Link title : " + href);
                    System.out.println("                 Link url   : " + driver.getCurrentUrl());
                }

            }
        }
    }
}

