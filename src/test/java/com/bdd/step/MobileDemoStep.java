package com.bdd.step;

import appiumDriver.appiumDriverManager;
import com.bdd.view.MobileDemoView;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.sql.Driver;

public class MobileDemoStep  {

   // private MobileDemoView mobileDemoView;

    private MobileDemoView mobileDemoView(){
        return new MobileDemoView();
    }
    
    public void cargarElAppDeYape() throws MalformedURLException {
        appiumDriverManager.createAppiumDriver();
    }

    public void verificarQueCargueElAppYape() {
        Assert.assertTrue(mobileDemoView().verificarQueCargueElAppYape());
    }

    public void seleccionarElBotonYaTengoCuenta() {
        mobileDemoView().seleccionarElBotonYaTengoCuenta();
        
    }

    public void verifcarQueSeCreeLaCuentaEnYape() {
        Assert.assertTrue(mobileDemoView().verifcarQueSeCreeLaCuentaEnYape());

    }
}
