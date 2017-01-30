package model.presets;

import org.openqa.selenium.WebElement;
import property.tools.*;

/**
 * Created by Igor on 15.01.2015.
 */
public class Project_Init {
    public Delete_All DELETE() {
        return new Delete_All();
    }

    public Log_In_To_Service LOGIN() {
        return new Log_In_To_Service();
    }

    public Log_Out_From_Service LOGOUT() {
        return new Log_Out_From_Service();
    }

    public Tool_ScreenShot SCREENSHOT() {
        return new Tool_ScreenShot();
    }

    public Select_Language LANGUAGE() {
        return new Select_Language();
    }

    public Form_Carriers_Presets CARRIERS() {
        return new Form_Carriers_Presets();
    }

    public Form_Tariffs_Preset TARIFFS() {
        return new Form_Tariffs_Preset();
    }

    public Form_USSD_Presets USSD() {
        return new Form_USSD_Presets();
    }

    public Form_Color_Presets COLOR() {
        return new Form_Color_Presets();
    }

    public Form_Location_Presets LOCATION() {
        return new Form_Location_Presets();
    }

    public Form_Tariff_Limits_Preset TARIFFS_LIMIT() {
        return new Form_Tariff_Limits_Preset();
    }

    public Tool_HighLights HIGHLIGHT() {
        return new Tool_HighLights();
    }




}
