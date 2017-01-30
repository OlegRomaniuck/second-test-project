package model.page_base;

import model.page_login.Page_Login;
import model.page_pass_remind.Page_Password_Remind;
import model.page_registration.Page_Registration;
import model.page_service.Page_Service;
import model.page_website.Page_WebSite;
import logic.work.Application;


public class Page extends Application {
    // page project

    public Page_WebSite WEBSITE() {
        return new Page_Init(driver).getPageWebSite();
    }

    public Page_Login LOGIN() {
        return new Page_Init(driver).getPageLogin();
    }

    public Page_Service SERVICE() {
        return new Page_Init(driver).getPageService();
    }

    public Page_Registration REGISTRATION() {
        return new Page_Init(driver).getPageReg();
    }

    public Page_Password_Remind REMIND_PASSWORD() {
        return new Page_Init(driver).getPagePasswordRemind();
    }


}