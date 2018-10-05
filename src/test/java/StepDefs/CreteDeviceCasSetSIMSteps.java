package StepDefs;


import Pages.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
    public void that_i_am_on_logged_in_as_user_and_password(String user, String pass) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        loginPage.setUserName(user);
        loginPage.setUserPassword(pass);
        loginPage.loginButton();


    }

    @When("^I  see my \"([^\"]*)\" overview page$")
    public void i_see_my_overview_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


    

    @Then("^I click on \"([^\"]*)\" under the \"([^\"]*)\" main menu$")
    public void i_click_on_under_the_main_menu(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the \"([^\"]*)\" overview page$")
    public void i_should_see_the_overview_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I Select \"([^\"]*)\" under the \"([^\"]*)\" object$")
    public void i_Select_under_the_object(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I click on \"([^\"]*)\" under  \"([^\"]*)\"$")
    public void i_click_on_under(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I select \"([^\"]*)\" in a listoverview$")
    public void i_select_in_a_listoverview(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I change the SIM \"([^\"]*)\" in the dropdown from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_change_the_SIM_in_the_dropdown_from_to(String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I change the SIM \"([^\"]*)\" in the textfield from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_change_the_SIM_in_the_textfield_from_to(String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I verify the \"([^\"]*)\" details and the \"([^\"]*)\" should be \"([^\"]*)\"$")
    public void i_verify_the_details_and_the_should_be(String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
