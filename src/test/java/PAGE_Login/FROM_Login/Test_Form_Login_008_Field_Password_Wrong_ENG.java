package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import property.tools.Tool_Thread_Wait;


public class Test_Form_Login_008_Field_Password_Wrong_ENG extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        // тестовая среда PRODUCTION
        getInitWebDriver().get("https:/");

        String userName = "";
        String userPassword = "";

        PAGE.LOGIN().FORM().Field_Login(userName);
        PAGE.LOGIN().FORM().Field_Password(userPassword);

        PAGE.LOGIN().FORM().Button_Submit_From_Login();

        new Tool_Thread_Wait().Thread_Wait(1, 2000);

        // ПРОВЕРКА : появится предупреждение под полем Пароль
        String actual = PAGE.LOGIN().FORM().Label_Wrong_Password();
        String expected = "Login or password is incorrect";

        Assert.assertEquals(actual, expected);
    }
}
