package PAGE_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests_Page_Login_007_Link_Create_An_Account_ENG extends logic.init.Initialize {
    @Test
    public void Tests() {
        String url = "https:";

        getInitWebDriver().get(url);

        PAGE.LOGIN().ELEMENT().Link_Create_New_Account();

        String actual = PAGE.REGISTRATION().FORM().Label_Form_Registration();
        String expected = "registration".toUpperCase();

        Assert.assertEquals(actual, expected);
    }
}
