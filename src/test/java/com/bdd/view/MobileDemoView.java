package com.bdd.view;

import appiumDriver.appiumDriverManager;
import appiumDriver.baseView;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static io.appium.java_client.AppiumDriver.*;

public class MobileDemoView  extends baseView {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ya tengo una cuenta\"]")
    public WebElement btnCuenta;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement txtCorreo;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continuar\"]")
    public WebElement btnContinuar;





    public boolean verificarQueCargueElAppYape() {
        return btnCuenta.isDisplayed();
    }

    public void seleccionarElBotonYaTengoCuenta() {
        btnCuenta.click();
        txtCorreo.sendKeys("mobileDemo@prueba.com");




    }

    public boolean verifcarQueSeCreeLaCuentaEnYape() {
        return btnContinuar.isEnabled();
    }
}
