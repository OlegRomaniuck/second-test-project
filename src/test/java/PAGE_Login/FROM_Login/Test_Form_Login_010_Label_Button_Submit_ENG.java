package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_010_Label_Button_Submit_ENG extends logic.init.Initialize {
    @Test
    public void Tests() {
        String url = "https:";

        getInitWebDriver().get(url);

        String actual = PAGE.LOGIN().FORM().Label_Button_Submit_Form_Login();
        String expected = "LOGIN";

        Assert.assertEquals(actual, expected);
    }
}
