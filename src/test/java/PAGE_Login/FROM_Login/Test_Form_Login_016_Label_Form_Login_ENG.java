package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_016_Label_Form_Login_ENG extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https:/";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().FORM().Label_Form_Login();
        String expected = "Login form".toUpperCase();

        Assert.assertEquals(actual, expected);
    }
}
