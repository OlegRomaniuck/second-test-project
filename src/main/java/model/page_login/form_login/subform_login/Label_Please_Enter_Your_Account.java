package model.page_login.form_login.subform_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;


public class Label_Please_Enter_Your_Account extends Page_Any {
    @FindBy(xpath = ".//*[@id='registration']/div[1]/h2")
    @CacheLookup
    private WebElement el_Label_Please_Enter_Your_Account;

    public Label_Please_Enter_Your_Account(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Label_Please_Enter_Your_Account() {
        return new Page_Manager(driver).initElements(new Label_Please_Enter_Your_Account(pages)).el_Label_Please_Enter_Your_Account;
    }

    public String Label_Please_Enter_Your_Account() {
        new Tool_HighLights().HighLightElement(driver, el_Label_Please_Enter_Your_Account());

        return el_Label_Please_Enter_Your_Account().getText();
    }
}
