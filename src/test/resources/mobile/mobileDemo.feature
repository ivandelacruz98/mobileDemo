@mobileDemo
Feature:  Clase demo app mobile
  Background: Cargar el app de yape
    Given cargar el app de yape
  Scenario: Crear cuenta en yape
    Given verificar que cargue  el app  yape
    When seleccionar el boton ya tengo cuenta
    Then verifcar que se cree la cuenta en yape