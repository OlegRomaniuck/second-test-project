package SMOK_TEST;

import org.testng.Assert;

/**
 * Created by Tester3 on 27.01.2017.
 */
public class Registration extends Initalize {
    @Test(priority = 4)
    public void Tests() throws InterruptedException {
        // Зайти на страницу сайта и нажать SignIN
        //
        PAGE.WEBSITE().Link_SignIn();
        // нажать ссылку Создать новый Аккаунт
        PAGE.LOGIN().ELEMENT().Link_Create_New_Account();

        // Регистрация нового Пользователя

        // имя пользователя
        String nameUser = "SM_User_" + new Tool_RandomName().makeUserName();
        // почта пользователя
        String nameEmail = "SM_Email_" + new Tool_RandomName().makeUserEmail();
        // пароль ( для удобства пользование по умолчанию оставляем пароль 123456 )
        String namePassword = "";

        // заполнение полей формы регистрации
        PAGE.REGISTRATION().FORM().Field_Login_Form_Registration(nameUser);
        PAGE.REGISTRATION().FORM().Field_Email_Form_Registration(nameEmail);
        PAGE.REGISTRATION().FORM().Field_Password_Form_Registration(namePassword);
        PAGE.REGISTRATION().FORM().Field_Password_Confirm_Form_Registration(namePassword);
        PAGE.REGISTRATION().FORM().CheckBox_Agree();
        PAGE.REGISTRATION().FORM().Button_Submit_Form_Registration();
        String actual = PAGE.REGISTRATION().FORM().Get_Name_User();
        PAGE.SERVICE().MENU().Profile().Log_Out();
        Assert.assertEquals(actual, nameUser);
    }

}
