package property.util;

import com.opera.core.systems.OperaDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Util_WebDriver_Factory {
    /* Browsers constants */
    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    public static final String SAFARI = "safari";
    public static final String OPERA = "opera";
    public static final String IE = "ie";
    public static final String HtmlUnit = "htmlunit";
    public static final String IPHONE = "iphone";

    /* Platform constants */
    public static final String WINDOWS = "windows";
    public static final String ANDROID = "android";
    public static final String XP = "xp";
    public static final String VISTA = "vista";
    public static final String MAC = "mac";
    public static final String LINUX = "linux";
    // windows

    public static String path = "\\src\\main\\java\\property\\drivers\\chromedriver.exe";

    /* Chrome driver path */
    // linux

    public static String webdriverpath = "webdriver.chrome.driver";
    /* IE driver path */
    public static String pathIE = "property\\drivers.ie\\";

    /* Opera driver path WINDOWS */

    public static String webdriverpathIE = "webdriver.ie.driver";
    private static WebDriver webDriver = null;

    public static WebDriver getInstance(String gridHubUrl, Util_Browser browser, String username, String password) {
        WebDriver webDriver = null;

        DesiredCapabilities capability = new DesiredCapabilities();


        String browserName = browser.getName();


        capability.setJavascriptEnabled(true);

        // In case there is no Hub
        if (gridHubUrl == null || gridHubUrl.length() == 0) {
            return getInstance(browserName, username, password);
        }
        if (CHROME.equals(browserName)) {
            capability = DesiredCapabilities.chrome();
        } else if (FIREFOX.equals(browserName)) {

            capability = DesiredCapabilities.firefox();
            FirefoxProfile ffProfile = new FirefoxProfile();

            // Authenication Hack for Firefox
            if (username != null && password != null) {
                ffProfile.setPreference("network.http.phishy-userpass-length", 255);
                capability.setCapability(FirefoxDriver.PROFILE, ffProfile);
            }
            capability.setCapability(CapabilityType.TAKES_SCREENSHOT, true);


        } else if (IE.equals(browserName)) {
            capability = DesiredCapabilities.internetExplorer();
            capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        } else if (SAFARI.equals(browserName)) {
            capability = DesiredCapabilities.safari();
        } else if (OPERA.equals(browserName)) {
            capability = DesiredCapabilities.opera();
        } else if (ANDROID.equals(browserName)) {
            capability = DesiredCapabilities.android();
        } else if (IPHONE.equals(browserName)) {
            capability = DesiredCapabilities.iphone();
        } else {
            capability = DesiredCapabilities.htmlUnit();

            return webDriver;
        }

        capability = setVersionAndPlatform(capability, browser.getVersion(), browser.getPlatform());

        // Create Remote WebDriver
        try {
            webDriver = new RemoteWebDriver(new URL(gridHubUrl), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return webDriver;
    }

    public static WebDriver getInstance(String browser, String username, String password) {
        if (webDriver != null) {
            return webDriver;
        }
        if (CHROME.equals(browser)) {

            System.setProperty(webdriverpath, path);

            webDriver = new ChromeDriver();

        } else if (FIREFOX.equals(browser)) {

            webDriver = new FirefoxDriver();



        } else if (IE.equals(browser)) {
            System.setProperty(webdriverpathIE, pathIE);
            webDriver = new InternetExplorerDriver();

        } else if (OPERA.equals(browser)) {
            webDriver = new OperaDriver();
        } else if (SAFARI.equals(browser)) {
            webDriver = new SafariDriver();
        } else if (IPHONE.equals(browser)) {
            try {	 webDriver = new IPhoneDriver(); } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ANDROID.equals(browser)) {	/* webDriver = new AndroidDriver();	*/ } else {
            // HTMLunit Check
            if (username != null && password != null) {	webDriver = (HtmlUnitDriver) HtmlUnitDriver_Authenticated.create(username, password);	}
            else {	webDriver = new HtmlUnitDriver(true);	}
        }
        return webDriver;
    }

    private static DesiredCapabilities setVersionAndPlatform(DesiredCapabilities capability, String version, String platform) {
        if (MAC.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.MAC);
        } else if (LINUX.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.LINUX);
        } else if (XP.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.XP);
        } else if (VISTA.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.VISTA);
        } else if (WINDOWS.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.WINDOWS);
        } else if (ANDROID.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.ANDROID);
        } else {
            capability.setPlatform(Platform.ANY);
        }
        if (version != null) {
            capability.setVersion(version);
        }
        return capability;
    }
}