package property.tools;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class Tool_ScreenShot {
    public void getScreenShot(WebDriver driver, String name) {
        String FolderForScreenShot = "ScreenShot";

        String time = new SimpleDateFormat("dd.MM.yyyy" + "_" + "HH.mm.SS").format(new java.util.Date());

        File ScreenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //String path = "Title_" + driver.getTitle() + "_Time_" +  time + "_Name_" +  screenshot.getName();

        String path = name + "_Time_" + time + "_.png";

        try {
            FileUtils.copyFile(ScreenShot, new File(FolderForScreenShot, path));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WebDriverException we) {
            System.out.println(" Can't get Screen Shot");
        }
    }

    public void GET(WebDriver driver, String name) {
        String FolderForScreenShot = "ScreenShot";

        String time = new SimpleDateFormat("dd.MM.yyyy" + "_" + "HH.mm.SS").format(new java.util.Date());

        File ScreenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //String path = "Title_" + driver.getTitle() + "_Time_" +  time + "_Name_" +  screenshot.getName();

        String path = name + "_Time_" + time + "_.png";

        try {
            FileUtils.copyFile(ScreenShot, new File(FolderForScreenShot, path));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WebDriverException we) {
            System.out.println(" Can't get Screen Shot");
        }
    }
}
