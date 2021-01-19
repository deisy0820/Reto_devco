package Stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import manuales.ValidadorDePasos;



public class TravelocityStepdefinitions {
    private Scenario escenario;

    @Before
    public void getScenario(Scenario escenario) {
        this.escenario = escenario;
    }

    @Given("^(.*)$")
    public void ejecutarValidacion(String paso){
        ValidadorDePasos.validar(paso, escenario.getName());
    }



}


