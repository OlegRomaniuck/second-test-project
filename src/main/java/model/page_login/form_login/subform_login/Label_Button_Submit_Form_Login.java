package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Label_Button_Submit_Form_Login extends Page_Any {
    @FindBy(id = "submit_btn")
    @CacheLookup
    private WebElement el_Label_Button_Submit_Form_Login;

    public Label_Button_Submit_Form_Login(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Label_Button_Submit_Form_Login() {
        return new Page_Manager(driver).initElements(new Label_Button_Submit_Form_Login(pages)).el_Label_Button_Submit_Form_Login;
    }

    public String Label_Button_Submit_Form_Login() {
        new Tool_HighLights().HighLightElement(driver, el_Label_Button_Submit_Form_Login());

        return el_Label_Button_Submit_Form_Login().getText();
    }
}
