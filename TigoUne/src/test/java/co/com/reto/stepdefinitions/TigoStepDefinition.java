package co.com.reto.stepdefinitions;

import co.com.reto.steps.HomeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TigoStepDefinition {


    @Steps
    private HomeSteps homeSteps;


    @Given("^an user enters the tigo page and login$")
    public void anUserEntersTheTigoPageAndLogin() {


        homeSteps.openTigoUnePage();

    }


    @When("^look for how much you should pay$")
    public void lookForHowMuchYouShouldPay() {

    }

    @Then("^the user check date of pay$")
    public void theUserCheckDateOfPay() {

    }
}
