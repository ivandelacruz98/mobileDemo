package appiumDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.time.Duration;

public class baseView {
    public baseView(){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriverManager.getAppiumDriver(), Duration.ofSeconds(10)),this);
       // PageFactory.initElements(
        //        new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
}
