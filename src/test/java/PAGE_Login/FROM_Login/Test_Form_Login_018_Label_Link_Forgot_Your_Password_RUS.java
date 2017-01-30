package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_018_Label_Link_Forgot_Your_Password_RUS extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https:";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().FORM().Label_Link_Forgot_Your_Password();
        String expected = "Забыли пароль?";

        Assert.assertEquals(actual, expected);
    }
}
