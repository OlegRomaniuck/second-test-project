package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Form_Login_013_Label_Empty_Field_Login_RUS extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        String url = "https:/";

        getInitWebDriver().get(url);

        PAGE.LOGIN().FORM().Button_Submit_From_Login();

        String actual = PAGE.LOGIN().FORM().Label_Empty_Login();
        String expected = "Пожалуйста, введите ваш логин";

        Assert.assertEquals(actual, expected);
    }
}
