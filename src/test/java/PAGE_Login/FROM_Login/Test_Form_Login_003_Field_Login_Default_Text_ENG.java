package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_003_Field_Login_Default_Text_ENG extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https:";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().FORM().Field_Login_Default_Text();
        String expected = "Login";

        Assert.assertEquals(actual, expected);
    }
}
