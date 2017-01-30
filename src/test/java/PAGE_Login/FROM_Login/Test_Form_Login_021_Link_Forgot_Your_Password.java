package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_021_Link_Forgot_Your_Password extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        PAGE.WEBSITE().Link_SignIn();

        PAGE.LOGIN().FORM().Link_Forgot_Your_Password();

        boolean actual = PAGE.REMIND_PASSWORD().FORM().Img_Captcha();

        Assert.assertTrue(actual);
    }
}
