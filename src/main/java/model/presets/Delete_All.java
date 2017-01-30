package model.presets;

import logic.init.Initialize;


public class Delete_All extends Initialize {
    public void GATEWAY_ALL() {
        try {
            PAGE.SERVICE().WINDOW().Main().Gateway().MENU().Delete_All_Gateways();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void GATEWAY_BY_NAME(String name,String location) {
        try {
            PAGE.SERVICE().WINDOW().Main().Gateway().MENU().Delete_Gateway(name,location);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void LOCATION_ALL() {
        try {
            PAGE.SERVICE().WINDOW().Main().Location().MENU().Location_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void LOCATION_BY_NAME(String name) {
        try {
            PAGE.SERVICE().WINDOW().Main().Location().MENU().Location_Delete_By_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SIM_BANK_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().SIM_Bank_Manager();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SIM_Bank_Manager().MENU().SimBank_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SIM_BANK_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().SIM_Bank_Manager();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SIM_Bank_Manager().MENU().SimBank_Delete_By_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void TARIFFS_LIMIT_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().Tariffs();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Tariffs().Tariffs_Limit().MENU().Tariffs_Limit_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void TARIFFS_LIMIT_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().Tariffs();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Tariffs().Tariffs_Limit().MENU().Delete_By_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void TARIFFS_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().Tariffs();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Tariffs().MENU().Tariffs_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void TARIFFS_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().Tariffs();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Tariffs().MENU().Tariffs_Delete(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void CARRIERS_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().Carriers();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Carriers().MENU().Carriers_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void CARRIERS_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().Carriers();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Carriers().MENU().Carriers_Delete_By_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void COLOR_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().Colors();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Colors().MENU().Delete_All_Colors();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void COLOR_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().Colors();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Colors().MENU().Delete_By_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ROAD_MAP_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().Road_Map();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Road_Map().MENU().Road_Map_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ROAD_MAP_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().Road_Map();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Road_Map().MENU().Road_Map_Delete_By_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void USSD_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().USSD_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().USSD_Editor().MENU().USSD_Editor_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void USSD_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().USSD_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().USSD_Editor().MENU().USSD_Editor_Delete_By_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void BLACK_LIST_BY_NAME(String name) {
        try {
            PAGE.SERVICE().MENU().Config().Black_List();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Black_List().MENU().Black_List_Delete_by_Name(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void BLACK_LIST_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().Black_List();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().Black_List().MENU().Black_List_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SMS_EDITOR_INCOMING_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Incoming_SMS_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Incoming().MENU().SMS_Incoming_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void SMS_EDITOR_INCOMING_ALL_new() {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Incoming_SMS_Editor_dev();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Incoming().MENU().SMS_Incoming_Delete_All_new_dev();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void SMS_INCOMING_BY_REG_PHONE(String phone, String regexp) {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Incoming_SMS_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Incoming().MENU().SMS_Incoming_Delete_By_Reg_Phone(phone, regexp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SMS_EDITOR_SENDING_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Sending_SMS_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Sending().MENU().SMS_Editor_Sending_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SMS_EDITOR_SENDING_ALL_new() {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Sending_SMS_Editor_dev();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Sending().MENU().SMS_Editor_Sending_Delete_All_new();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





    public void SMS_SENDING_BY_TEXT_PHONE(String phone, String text) {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Sending_SMS_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Sending().MENU().SMS_Sending_Delete_By_Text_Phone(phone, text);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void SMS_EDITOR_TEMPLATES_LANGUAGE_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Templates_SMS_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Templates().LANGUAGE().MENU().SMS_Templates_Language_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SMS_EDITOR_TEMPLATES_LANGUAGE_ALL_new() {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Templates_SMS_Editor_dev_new();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Templates().LANGUAGE().MENU().SMS_Templates_Language_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    public void SMS_EDITOR_TEMPLATES_TEXT_ALL() {
        try {
            PAGE.SERVICE().MENU().Config().SMS().Templates_SMS_Editor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            PAGE.SERVICE().WINDOW().SMS_Editor_Templates().TEXT().MENU().SMS_Templates_Text_Delete_All();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void ALL() {
        GATEWAY_ALL();
        LOCATION_ALL();
        SIM_BANK_ALL();
        TARIFFS_ALL();
        TARIFFS_LIMIT_ALL();
        COLOR_ALL();
        CARRIERS_ALL();
        USSD_ALL();
        ROAD_MAP_ALL();
        BLACK_LIST_ALL();
        SMS_EDITOR_INCOMING_ALL();
        SMS_EDITOR_SENDING_ALL();
        SMS_EDITOR_TEMPLATES_LANGUAGE_ALL();
        SMS_EDITOR_TEMPLATES_TEXT_ALL();
    }
}
