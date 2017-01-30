package logic.init;

import logic.work.Application;
import model.page_base.Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


import model.presets.Project_Init;




public class Initialize {
    // init Application
    protected Application app = new Application();
    protected Page PAGE = new Page();

    // init Presets
    protected Project_Init PRESET = new Project_Init();


    @BeforeSuite
    public void RunSuite() throws InterruptedException {
        app.getWebDriver().manage().window().maximize();
    }

    @BeforeClass
    public void RunClass() throws InterruptedException {

        app.getNavigator().openMainPage();
    }

    @BeforeTest
    public void RunTest() throws InterruptedException {



    }



@AfterSuite

public void stopSuiteS() {
    app.stop();
}


    public WebDriver getInitWebDriver() {
        return app.getWebDriver();
    }


}
