package PAGE_Login.FROM_Login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Form_Login_009_Field_Password_Wrong_RUS extends logic.init.Initialize {
    @Test
    public void Tests() throws InterruptedException {
        // тестовая среда PRODUCTION
        getInitWebDriver().get("");

        String userName = "";
        String userPassword = "1";

        PAGE.LOGIN().FORM().Field_Login(userName);
        PAGE.LOGIN().FORM().Field_Password(userPassword);

        PAGE.LOGIN().FORM().Button_Submit_From_Login();

        // ПРОВЕРКА : появится предупреждение под полем Пароль
        String actual = PAGE.LOGIN().FORM().Label_Wrong_Password();
        String expected = "Неверный логин или пароль";

        System.out.println(actual);
        System.out.println(actual);

        Assert.assertEquals(actual, expected);
    }
}
