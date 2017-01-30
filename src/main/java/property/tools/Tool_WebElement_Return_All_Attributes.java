package property.tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class Tool_WebElement_Return_All_Attributes {
    public void getAllAttributes(WebDriver driver, WebElement element) {
        ArrayList parentAttributes = (ArrayList) ((JavascriptExecutor) driver)

                .executeScript
                        (
                                "var s = []; var attrs = arguments[0].attributes; for (var l = 0; l < attrs.length; ++l) { var a = attrs[l]; s.push(a.name + ':' + a.value); } ; return s;"
                                , element
                        );
        for (Object o : parentAttributes) {
            System.out.println(o);
        }
    }
}
