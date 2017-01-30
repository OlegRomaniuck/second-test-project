package PAGE_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Page_Login_001_Header_ENG extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "";

        getInitWebDriver().get(url);

        PAGE.LOGIN().ELEMENT().Header_Page_Login();

        String actual = getInitWebDriver().getCurrentUrl();
        String expected = "";

        Assert.assertEquals(actual, expected);
    }
}
