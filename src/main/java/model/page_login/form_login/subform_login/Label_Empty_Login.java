package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;

public class Label_Empty_Login extends Page_Any {
    @FindBy(id = "login_err")
    @CacheLookup
    private WebElement el_Label_Empty_Login;


    public Label_Empty_Login(Page_Manager pages) {
        super(pages);
    }

    public WebElement el_Label_Empty_Login() {
        return new Page_Manager(driver).initElements(new Label_Empty_Login(pages)).el_Label_Empty_Login;
    }

    public String Label_Empty_Login() {


        return el_Label_Empty_Login().getText();
    }
}
