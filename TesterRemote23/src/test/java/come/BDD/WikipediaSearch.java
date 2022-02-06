package come.BDD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearch {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fauralin\\Desktop\\BDD Fundamentals\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I am on the Wikipedia search page")
    public void I_visit_wikipedia() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");
        Thread.sleep( 5000);
    }

    @When("I search for {string}")
    public void search_for(String query) throws InterruptedException {
        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys(query);
        element.submit();
        Thread.sleep(  5000);


    }

    @Then("the page title should start with {string}")
    public void checkTitle(String searchResult) {

        WebElement results = driver.findElement(By.id("firstHeading"));
        Assert.assertTrue(results.getText().startsWith(searchResult));
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
