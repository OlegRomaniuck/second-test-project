package property.tools;

import java.util.concurrent.TimeUnit;

public class Tool_Wait extends logic.init.Initialize {
    public Tool_Wait() {
        getInitWebDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
}
