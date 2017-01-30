package model.page_login.form_login.subform_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import property.tools.Tool_HighLights;


public class Label_Wrong_Password extends Page_Any {
    @FindBy(id = "none_err")
    @CacheLookup
    private WebElement el_Label_Wrong_Password;


    public Label_Wrong_Password(Page_Manager pages) {
        super(pages);
    }

    public WebElement el_Label_Wrong_Password() {
        return new Page_Manager(driver).initElements(new Label_Wrong_Password(pages)).el_Label_Wrong_Password;
    }

    public String Label_Wrong_Password() {

        return el_Label_Wrong_Password().getText();


    }
}
