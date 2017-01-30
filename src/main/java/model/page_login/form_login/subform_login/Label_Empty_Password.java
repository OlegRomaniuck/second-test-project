package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Label_Empty_Password extends Page_Any {
    @FindBy(id = "password_err")
    @CacheLookup
    private WebElement el_Label_Empty_Password;


    public Label_Empty_Password(Page_Manager pages) {
        super(pages);
    }

    public WebElement el_Label_Empty_Password() {
        return new Page_Manager(driver).initElements(new Label_Empty_Password(pages)).el_Label_Empty_Password;
    }

    public String Label_Empty_Password() {


        return el_Label_Empty_Password().getText();
    }
}
