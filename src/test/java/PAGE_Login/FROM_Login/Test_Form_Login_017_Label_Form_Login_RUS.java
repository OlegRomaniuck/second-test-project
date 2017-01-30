package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_017_Label_Form_Login_RUS extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https:/";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().FORM().Label_Form_Login();
        String expected = "АВТОРИЗАЦИЯ";

        Assert.assertEquals(actual, expected);
    }
}
