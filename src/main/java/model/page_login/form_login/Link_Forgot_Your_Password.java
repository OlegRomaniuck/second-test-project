package model.page_login.form_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Link_Forgot_Your_Password extends Page_Any {
    @FindBy(id = "login")
    @CacheLookup
    private WebElement el_Link_Forgot_Your_Password;

    public Link_Forgot_Your_Password(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Link_Forgot_Your_Password() {
        return new Page_Manager(driver).initElements(new Link_Forgot_Your_Password(pages)).el_Link_Forgot_Your_Password;
    }

    public Link_Forgot_Your_Password click() {
        new Tool_HighLights().HighLightElement(driver, el_Link_Forgot_Your_Password());
        el_Link_Forgot_Your_Password().click();

        return this;
    }
}
