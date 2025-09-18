package com.bdd.stepDefinition;

import com.bdd.step.MobileDemoStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MobileDemoStepDefinition {

    private MobileDemoStep mobileDemoStep;

    @Before
    public  void beforeScenario(){
        mobileDemoStep = new MobileDemoStep();
    }


    @Given("cargar el app de yape")
    public  void cargarElAppDeYape() throws MalformedURLException {
        mobileDemoStep.cargarElAppDeYape();

    }

    @Given("verificar que cargue  el app  yape")
    public void verificarQueCargueElAppYape() {
        mobileDemoStep.verificarQueCargueElAppYape();

    }

    @When("seleccionar el boton ya tengo cuenta")
    public void seleccionarElBotonYaTengoCuenta() {
        mobileDemoStep.seleccionarElBotonYaTengoCuenta();
    }

    @Then("verifcar que se cree la cuenta en yape")
    public void verifcarQueSeCreeLaCuentaEnYape() {
        mobileDemoStep.verifcarQueSeCreeLaCuentaEnYape();
    }
}
