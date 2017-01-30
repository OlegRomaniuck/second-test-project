package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_019_Label_Please_Enter_Your_Account_ENG extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().FORM().Label_Please_Enter_Your_Account();
        String expected = "Login to your profile:";

        Assert.assertEquals(actual, expected);
    }
}
