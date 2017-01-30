package model.page_login.element_page_login.subelement_page_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import model.page_base.Page_Any;
import model.page_base.Page_Manager;
import property.tools.Tool_HighLights;

public class Label_Link_Create_An_Account_Page_Login extends Page_Any {
    @FindBy(xpath = ".//*[@class='footer_links']//a")
    @CacheLookup
    private WebElement el_Label_Link_Create_An_Account_Page_Login;


    public Label_Link_Create_An_Account_Page_Login(Page_Manager pages) {
        super(pages);
    }

    private WebElement el_Label_Link_Create_An_Account_Page_Login() {
        return new Page_Manager(driver).initElements(new Label_Link_Create_An_Account_Page_Login(pages)).el_Label_Link_Create_An_Account_Page_Login;
    }

    public String Label_Link_Create_An_Account_Page_Login() {

        new Tool_HighLights().HighLightElement(driver, el_Label_Link_Create_An_Account_Page_Login());

        return el_Label_Link_Create_An_Account_Page_Login().getText();
    }
}
