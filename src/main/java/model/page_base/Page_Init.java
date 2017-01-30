package model.page_base;

import model.page_website.link_WebSite.page_equipment.Equipment_goip16;
import org.openqa.selenium.WebDriver;
import model.page_login.Page_Login;
import model.page_pass_remind.Page_Password_Remind;
import model.page_registration.Page_Registration;
import model.page_service.Page_Service;
import model.page_website.Page_WebSite;

public class Page_Init extends Page_Manager {
    public Page_Init(WebDriver driver) {
        super(driver);
    }

    // init pages in PageFactory

    public Page_Login getPageLogin() {
        return initElements(new Page_Login(this));
    }

    public Page_Service getPageService() {
        return initElements(new Page_Service(this));
    }

    public Page_WebSite getPageWebSite() {
        return initElements(new Page_WebSite(this));
    }

    public Page_Registration getPageReg() {
        return initElements(new Page_Registration(this));
    }

    public Page_Password_Remind getPagePasswordRemind() {
        return initElements(new Page_Password_Remind(this));
    }


}