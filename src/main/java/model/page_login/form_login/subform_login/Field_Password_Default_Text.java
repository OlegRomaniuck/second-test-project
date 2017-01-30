package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Field_Password_Default_Text extends Page_Any {
    @FindBy(id = "password")
    @CacheLookup
    private WebElement el_Field_Password_Default_Text;


    public Field_Password_Default_Text(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Field_Password_Default_Text() {
        return new Page_Manager(driver).initElements(new Field_Password_Default_Text(pages)).el_Field_Password_Default_Text;
    }

    public String Field_Password_Default_Text() {
        new Tool_HighLights().HighLightElement(driver, el_Field_Password_Default_Text());

        return el_Field_Password_Default_Text().getAttribute("placeholder");
    }
}
