package come.BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.rmi.activation.ActivationGroup_Stub;

public class FirstExampleSteps {
    @Given ("Calculator app is opened")
    public void openCalculator(){

        // write code Java here

    }
   @When("I click 4")
    public void clickNumber(){

        //code Java for click 4
   }

    @Then("I see result is 7")
    public void results(){

        //code Java for result
    }
}
