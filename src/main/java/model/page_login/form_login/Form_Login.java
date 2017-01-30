package model.page_login.form_login;

import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import model.page_login.form_login.subform_login.*;
import model.page_login.form_login.subform_login.Link_Forgot_Your_Password;
import model.presets.Form_Login_Presets;

public class Form_Login extends Page_Any {
    public Form_Login(Page_Manager pages) {
        super(pages);
    }

    // Field_Login
    public Field_Login Field_Login(String login) {
        return new Field_Login(pages).Field_Login(login);
    }

    // Field_Login_Default_Text
    public String Field_Login_Default_Text() {
        return new Field_Login_Default_Text(pages).Field_Login_Default_Test();
    }

    // Field_Password
    public Field_Password Field_Password(String password) {
        return new Field_Password(pages).setPassword(password);
    }

    // Field_Password_Default_Text
    public String Field_Password_Default_Text() {
        return new Field_Password_Default_Text(pages).Field_Password_Default_Text();
    }

    // Button_Submit_From_Login
    public Button_Submit_From_Login Button_Submit_From_Login() {
        return new Button_Submit_From_Login(pages).click();
    }

    // Label_Button_Submit_Form_Login
    public String Label_Button_Submit_Form_Login() {
        return new Label_Button_Submit_Form_Login(pages).Label_Button_Submit_Form_Login();
    }


    // Label_Form_Login
    public String Label_Form_Login() {
        return new Label_Form_Login(pages).Label_Form_Login();
    }

    // Label_Empty_Login
    public String Label_Empty_Login() {
        return new Label_Empty_Login(pages).Label_Empty_Login();
    }

    // Label_Empty_Password
    public String Label_Empty_Password() {
        return new Label_Empty_Password(pages).Label_Empty_Password();
    }



    // Link_Forgot_Password
    public Link_Forgot_Your_Password Link_Forgot_Your_Password() {
        return new Link_Forgot_Your_Password(pages).Link_Forgot_Your_Password();
    }

    // Label_Link_Forgot_Your_Password
    public String Label_Link_Forgot_Your_Password() {
        return new Label_Link_Forgot_Your_Password(pages).Label_Link_Forgot_Your_Password();
    }

    // Label_Please_Enter_Your_Account
    public String Label_Please_Enter_Your_Account() {
        return new Label_Please_Enter_Your_Account(pages).Label_Please_Enter_Your_Account();
    }

    // Label_Wrong_Password
    public String Label_Wrong_Password() {
        return new Label_Wrong_Password(pages).Label_Wrong_Password();
    }

    // Presets
    public Form_Login_Presets PRESETS() {
        return new Form_Login_Presets();
    }

}
