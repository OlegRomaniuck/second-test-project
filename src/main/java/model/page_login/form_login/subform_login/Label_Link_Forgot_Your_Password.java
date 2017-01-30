package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;

/**
 * Created by Igor on 13.11.2014.
 */
public class Label_Link_Forgot_Your_Password extends Page_Any {
    @FindBy(xpath = ".//*[@id='registration']/div[1]/span/a")
    @CacheLookup
    private WebElement el_Label_Link_Forgot_Your_Password;

    public Label_Link_Forgot_Your_Password(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Label_Link_Forgot_Your_Password() {
        return new Page_Manager(driver).initElements(new Label_Link_Forgot_Your_Password(pages)).el_Label_Link_Forgot_Your_Password;
    }

    public String Label_Link_Forgot_Your_Password() {
        new Tool_HighLights().HighLightElement(driver, el_Label_Link_Forgot_Your_Password());

        return el_Label_Link_Forgot_Your_Password().getText();
    }
}
