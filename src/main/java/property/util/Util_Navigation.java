package property.util;

import logic.work.Application;

public class Util_Navigation extends Util_Driver {
    private String baseUrl;

    public Util_Navigation(Application app) {
        super(app.getWebDriver());
        this.baseUrl = app.getBaseUrl();
    }

    public void openMainPage() {
        driver.get(baseUrl);
    }
}
