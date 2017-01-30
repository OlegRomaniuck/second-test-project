package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Field_Login extends Page_Any {
    @FindBy(id = "login")
    @CacheLookup
    private WebElement el_Field_Login;

    public Field_Login(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Field_Login() {
        return new Page_Manager(driver).initElements(new Field_Login(pages)).el_Field_Login;
    }

    public Field_Login Field_Login(String login) {
        new Tool_HighLights().HighLightElement(driver, el_Field_Login());

        el_Field_Login().clear();
        el_Field_Login().sendKeys(login);

        return this;
    }
}
