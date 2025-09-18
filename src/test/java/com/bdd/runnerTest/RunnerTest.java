package com.bdd.runnerTest;


import appiumDriver.appiumDriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/mobile",
        glue ="com.bdd.stepDefinition",
        stepNotifications = true,
        tags = "@mobileDemo")

public class RunnerTest {
   // @AfterClass
   // public static void afftetExecution(){
 //       appiumDriverManager.stopAppimDriver();

 //   }
}
