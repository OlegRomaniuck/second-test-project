package PAGE_Login.FROM_Login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_005_Field_Password extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        PAGE.WEBSITE().Link_SignIn();

        String stField = "test";

        PAGE.LOGIN().FORM().Field_Password(stField);

        PAGE.LOGIN().FORM().Button_Submit_From_Login();

        String actual = getInitWebDriver().findElement(By.id("password")).getAttribute("value");
        String expected = stField;

        Assert.assertEquals(actual, expected);
    }
}
