package StepDefs;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    WebDriver driver;



    @When("^i add an item to the shadow$")
    public void i_add_an_item_to_the_shadow() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/nasimbenbouchta/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(1000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Joehoe");
        searchBox.submit();
    }



}
