package PAGE_Login.FROM_Login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/
public class Test_Form_Login_001_Button_Submit_From_Login extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        PAGE.WEBSITE().Link_SignIn();

        PAGE.LOGIN().FORM().Button_Submit_From_Login();

        boolean actual = getInitWebDriver().findElement(By.xpath(".//*[@id='registration']/div[1]/h2")).isDisplayed();

        Assert.assertTrue(actual);
    }
}
