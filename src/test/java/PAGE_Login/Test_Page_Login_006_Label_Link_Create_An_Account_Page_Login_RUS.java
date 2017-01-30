package PAGE_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Page_Login_006_Label_Link_Create_An_Account_Page_Login_RUS extends logic.init.Initialize {
    @Test
    public void Tests() {
        String url = "https://";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().ELEMENT().Label_Link_Create_An_Account_Page_Login();
        String expected = "Create an account";

        Assert.assertEquals(actual, expected);
    }
}
