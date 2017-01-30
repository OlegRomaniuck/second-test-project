package model.page_login;

import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import model.page_login.element_page_login.Element_Page_Login;
import model.page_login.form_login.Form_Login;

public class Page_Login extends Page_Any {
    public Page_Login(Page_Manager pages) {
        super(pages);
    }

    // From Login
    public Form_Login FORM() {
        return new Form_Login(pages);
    }

    // element page login
    public Element_Page_Login ELEMENT() {
        return new Element_Page_Login(pages);
    }
}

