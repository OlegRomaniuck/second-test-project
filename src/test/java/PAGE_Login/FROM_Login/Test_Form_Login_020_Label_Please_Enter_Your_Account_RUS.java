package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_020_Label_Please_Enter_Your_Account_RUS extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https:";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().FORM().Label_Please_Enter_Your_Account();
        String expected = "Войдите в свой аккаунт:";

        Assert.assertEquals(actual, expected);
    }
}
