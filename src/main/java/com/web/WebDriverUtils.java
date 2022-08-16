package com.web;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import com.utils.ConfigReader;
import com.utils.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class WebDriverUtils {

    public static WebDriver driver;

    public static void setUp() {

        ConfigReader.readProperties(FrameworkConstants.CONFIGURATION_FILEPATH);
        String osName = FrameworkConstants.GET_OS_NAME;
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("chrome")) {
            if (osName.contains("Window")) {
                WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } else if (osName.contains("Mac")) {
                WebDriverManager.chromedriver().operatingSystem(OperatingSystem.MAC).setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (osName.contains("Linux")) {
                WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                options.addArguments("start-maximized");
                options.addArguments("--no-sandbox");
                driver = new ChromeDriver(options);
            }
        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            if (ConfigReader.getPropertyValue("platformName").equalsIgnoreCase("iOS")){
                cap.setCapability("platformName", ConfigReader.getPropertyValue("platformName"));
                cap.setCapability("deviceName", ConfigReader.getPropertyValue("deviceName"));
                cap.setCapability("automationName", "XCUITest");
                cap.setCapability(CapabilityType.BROWSER_NAME, "Safari");
                try {
                    driver = new IOSDriver(new URL("http://127.0.0.1:4723"), cap);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else {
                cap.setCapability("platformName", ConfigReader.getPropertyValue("platformName"));
                cap.setCapability("deviceName", ConfigReader.getPropertyValue("deviceName"));
                cap.setCapability("automationName", "UiAutomator2");
                if (ConfigReader.getPropertyValue("mobileTesting").equalsIgnoreCase("mobileBrowser")) {
                    cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
                }
                if (ConfigReader.getPropertyValue("mobileTesting").equalsIgnoreCase("native")) {
                    cap.setCapability("app",
                            System.getProperty("user.dir") + "/src/test/resources/APK/ApiDemos-debug.apk");
                }
                try {
                    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
        } else {
            throw new RuntimeException("Invalid browser name");
        }

    }

    public static void tearDown() {
        driver.quit();
    }

}
