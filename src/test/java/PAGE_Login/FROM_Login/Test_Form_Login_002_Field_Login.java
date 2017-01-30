package PAGE_Login.FROM_Login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_002_Field_Login extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        PAGE.WEBSITE().Link_SignIn();

        String stField = "";

        PAGE.LOGIN().FORM().Field_Login(stField);

        PAGE.LOGIN().FORM().Button_Submit_From_Login();

        String actual = getInitWebDriver().findElement(By.id("login")).getAttribute("value");
        String expected = stField;

        Assert.assertEquals(actual, expected);
    }
}
