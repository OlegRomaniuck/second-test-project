package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Field_Password extends Page_Any {
    @FindBy(id = "password")
    @CacheLookup
    private WebElement el_Field_Password;


    public Field_Password(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Field_Password() {
        return new Page_Manager(driver).initElements(new Field_Password(pages)).el_Field_Password;
    }

    public Field_Password setPassword(String password) {
        new Tool_HighLights().HighLightElement(driver, el_Field_Password());

        el_Field_Password().clear();
        el_Field_Password().sendKeys(password);

        return this;
    }
}
