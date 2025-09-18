package appiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class appiumDriverManager {

    private static AndroidDriver appiumDriver;

    public static void createAppiumDriver() throws MalformedURLException {

        Logger.getGlobal().log(Level.INFO, "Iniciando el driver......");

        // Usar UiAutomator2Options en vez de DesiredCapabilities
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setPlatformVersion("13.0")
                .setAutomationName("UiAutomator2")
                .setUdid("f69ef50f")
                .setAppPackage("com.bcp.innovacxion.yapeapp")
                .setAppActivity("com.yape.activity.MainActivity");

        Logger.getGlobal().log(Level.INFO, "capabilities --> {0}", options);

        // URL del servidor Appium (sin /wd/hub)
        URL appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub");

        // Crear driver con las opciones declaradas
        appiumDriver = new AndroidDriver(appiumServerUrl, options);

        // Puedes definir timeout implícito así:
        appiumDriver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        Logger.getGlobal().log(Level.INFO, "Driver iniciado correctamente.");
    }

    public static AndroidDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void stopAppiumDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            Logger.getGlobal().log(Level.INFO, "Driver detenido.");
        }
    }
}
