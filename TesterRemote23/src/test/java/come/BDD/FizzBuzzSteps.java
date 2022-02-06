package come.BDD;


import com.BDD.ex.FizzBuzzGame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class FizzBuzzSteps {
    private FizzBuzzGame fb;
    String result;
    @Given("start a FizzBuzz game play")
    public void startFizzBuzzGame () {
        fb = new FizzBuzzGame();
    }
    @When("I play with number {int}")
    public void play_with_number(int number){
        result = fb.play(number);
    }
    @Then("I see result is {string}")
    public void iSeeResult(String expectedResult){
     Assertions.assertEquals(expectedResult, result);
    }
}
