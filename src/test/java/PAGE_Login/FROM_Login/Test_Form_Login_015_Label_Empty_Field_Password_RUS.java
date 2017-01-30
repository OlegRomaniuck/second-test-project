package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_015_Label_Empty_Field_Password_RUS extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https:";

        getInitWebDriver().get(url);

        PAGE.LOGIN().FORM().Button_Submit_From_Login();

        String actual = PAGE.LOGIN().FORM().Label_Empty_Password();
        String expected = "Пожалуйста, введите пароль";

        Assert.assertEquals(actual, expected);
    }
}
