
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Acasa/Desktop/chromedriver.exe");
        // am definit calea ctre chrome driver
        WebDriver driver = new ChromeDriver(); // am creat o instanta a driver ului care sa fie incarcata in program

        // variabila "driver" este un obicet al clasei Chromedriver. Variabila driver are  tipul de data "Webdriver"
        // tip de data = proprietate care arata ce fel de informatii pot sa fie stocate intr-o variabila
        // variabila = o adresa de memorie reprezentata de un nume
        driver.get("https://formy-project.herokuapp.com/autocomplete"); // metoda "get"este folosita penmtru a deschide browser ul web
        WebElement autocomplete = driver.findElement(By.id("autocomplete")); // aici am identificat input field.ul pt adresa identificat prin ID.ul"autocomplete"
        autocomplete.sendKeys( "Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        driver.findElement(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")).click();
        // aici am identificat un element pe baza de "cssSelector"
        driver.quit(); // cu instructiunea asta inchidem complet browserul chrome


    }
}
