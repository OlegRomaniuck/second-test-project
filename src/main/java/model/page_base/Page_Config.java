package model.page_base;

import model.page_login.Page_Login;
import model.page_pass_remind.Page_Password_Remind;
import model.page_registration.Page_Registration;

public class Page_Config extends Page {
    private Page PAGE = new Page();


    public Page_Registration REGISTRATION() {
        PAGE.WEBSITE().Link_SignIn();
        PAGE.LOGIN().ELEMENT().Link_Create_New_Account();

        return PAGE.REGISTRATION();
    }

    public Page_Login LOGIN() {
        PAGE.WEBSITE().Link_SignIn();

        return PAGE.LOGIN();
    }

    public Page_Password_Remind REMIND_PASSWORD() {
        PAGE.WEBSITE().Link_SignIn();
        PAGE.LOGIN().FORM().Link_Forgot_Your_Password();

        return PAGE.REMIND_PASSWORD();
    }
}
