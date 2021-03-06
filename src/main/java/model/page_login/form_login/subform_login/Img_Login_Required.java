package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Img_Login_Required extends Page_Any {
    @FindBy(id = "")
    @CacheLookup
    private WebElement el_Img_Empty_Login;

    public Img_Login_Required(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Img_Empty_Login() {
        return new Page_Manager(driver).initElements(new Img_Login_Required(pages)).el_Img_Empty_Login;
    }

    public Img_Login_Required Img_Empty_Login() {
        new Tool_HighLights().HighLightElement(driver, el_Img_Empty_Login());

        return this;
    }
}
