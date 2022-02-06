package come.BDD;

import com.BDD.ex.Bankaccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BankAccSteps {
    private boolean iswithdrawPossible;
    private Bankaccount bankAccount;

    @Given("Bank account with {int} EUR")
    public void bankAccountwithEUR(int accountBalance){
        bankAccount = new Bankaccount(accountBalance); // initializare contului nostru cu suma trimisa ca si parametru in test si preluata in variabila accountBalance
    }
    @When("A user withdraw {int} EUR")
        public void userwithdrawEUR(int amount){
        iswithdrawPossible = bankAccount.withdraw(amount);
    }

        @Then("the withdraw operation should be possible")
    public void withdrawoperationsouldbepossibile (){
            Assert.assertTrue(iswithdrawPossible); //verifica daca iswithdrawPossible este egal cu True
        }

        @And("The account balance should be {int} EUR")
    public void accountbalanceshouldbeEUR (int amount){
        Assert.assertEquals(amount,bankAccount.getAccountBalance()); // compara suma care ma astept sa fie in cont cu suma efectiva din cont
        }

    @Then("the withdraw operation should not be possible")
    public void withdraw_not_possible() {
        Assert.assertFalse(iswithdrawPossible); //verifica daca iswithdrawPossible este egal cu False
    }

    @And("A user transfer {int} EUR")
    public void userTransferEUR (int money){};
}





