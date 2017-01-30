package model.page_login.element_page_login;

import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import model.page_login.element_page_login.subelement_page_login.Header_Page_Login;
import model.page_login.element_page_login.subelement_page_login.Img_Logo_Page_Login;
import model.page_login.element_page_login.subelement_page_login.Label_Link_Create_An_Account_Page_Login;
import model.page_login.element_page_login.subelement_page_login.Link_Create_An_Account_Page_Login;


public class Element_Page_Login extends Page_Any {
    public Element_Page_Login(Page_Manager pages) {
        super(pages);
    }

    // Link Create new Account
    public Link_Create_An_Account_Page_Login Link_Create_New_Account() {
        return new Link_Create_An_Account_Page_Login(pages).click();
    }

    // Logo Image
    public Img_Logo_Page_Login Img_Logo_Page_Login() {
        return new Img_Logo_Page_Login(pages).click();
    }

    // Label_Link_Create_An_Account_Page_Login
    public String Label_Link_Create_An_Account_Page_Login() {
        return new Label_Link_Create_An_Account_Page_Login(pages).Label_Link_Create_An_Account_Page_Login();
    }

    // Header_Page_Login
    public Header_Page_Login Header_Page_Login() {
        return new Header_Page_Login(pages).click();
    }
}
