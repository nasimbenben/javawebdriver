package StepDefs;


import Pages.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CreteDeviceCasSetSIMSteps {

    //LoginPage loginPage = new LoginPage(driver);
    static WebDriver driver;

    LoginPage loginPage;


    @Before
    public void beforeMethod() {

        System.setProperty("webdriver.chrome.driver", "/Users/nasimbenbouchta/Desktop/automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://enexis.energyict.com/apps/login/index.html");

        //Create object of LoginPage
        loginPage =  PageFactory.initElements(driver, LoginPage.class);

    }


    @After
    public void afterMethod() {

        driver.quit();

    }


    @Given("^That i am on logged in as user \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void that_i_am_on_logged_in_as_user_and_password(String user, String pass) {
        // Write code here that turns the phrase above into concrete actions

        loginPage.setUserName(user);
        loginPage.setUserPassword(pass);
        loginPage.loginButton();


    }

}
