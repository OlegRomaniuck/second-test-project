package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Button_Submit_From_Login extends Page_Any {
    @FindBy(id = "submit_btn")
    @CacheLookup
    private WebElement el_Button_Submit_From_Login;

    public Button_Submit_From_Login(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Button_Submit_From_Login() {
        return new Page_Manager(driver).initElements(new Button_Submit_From_Login(pages)).el_Button_Submit_From_Login;
    }

    public Button_Submit_From_Login click() {
        new Tool_HighLights().HighLightElement(driver, el_Button_Submit_From_Login());

        el_Button_Submit_From_Login().click();

        return this;
    }
}
