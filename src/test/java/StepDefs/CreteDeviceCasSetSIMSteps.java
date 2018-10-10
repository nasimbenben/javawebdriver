package StepDefs;


import Pages.LoginPage;
import Pages.MultiSensePages.dashBoardPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CreteDeviceCasSetSIMSteps {

    //LoginPage loginPage = new LoginPage(driver);
    static WebDriver driver;

    LoginPage loginPage;
    dashBoardPage dashBoardPage;


    @Before
    public void beforeMethod() {

        System.setProperty("webdriver.chrome.driver", "/Users/nasimbenbouchta/Desktop/automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://enexistst.energyict.com/");

        //Create object of LoginPage
        loginPage =  PageFactory.initElements(driver, LoginPage.class);
        dashBoardPage = new dashBoardPage(driver);

    }


    @Given("^That i am on logged in as user \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void that_i_am_on_logged_in_as_user_and_password(String user, String pass) {

        this.loginPage.loginModule(this.loginPage.userName, user);
        this.loginPage.loginModule(this.loginPage.passWord, pass);
        this.loginPage.loginButton();

    }

    @When("^I  see my \"([^\"]*)\" overview page$")
    public void i_see_my_overview_page(String pageHeader) throws Throwable {

       this.dashBoardPage.visibilityOfElement(this.dashBoardPage.headerPage(pageHeader));

    }

    @Then("^I click on \"([^\"]*)\" under the \"([^\"]*)\" main menu$")
    public void i_click_on_under_the_main_menu(String subMenu, String mainMenu) throws Throwable {

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.openMainMenu());
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.mainMenu(mainMenu));
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.subMenu(subMenu));
    }


    @Then("^I Select \"([^\"]*)\" under the \"([^\"]*)\" object$")
    public void i_Select_under_the_object(String main, String sub) throws Throwable {

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.deviceTasks(main,sub));
    }


    @Then("^I click on \"([^\"]*)\" under Device groups$")
    public void i_click_on_under_Device_groups(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.links(item));
    }

    @Then("^I select \"([^\"]*)\" in a list overview$")
    public void i_select_in_a_listoverview(String Device) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.links(Device));
    }

    @Then("^I click on \"([^\"]*)\"$")
    public void i_click_on(String link) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.links(link));
    }


    @Then("^I click on \"([^\"]*)\" of the object menu$")
    public void i_click_on_of_the_object_menu(String objectItem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.objectMenu(objectItem));
    }

    @Then("^I verify the \"([^\"]*)\" details and the \"([^\"]*)\" should be \"([^\"]*)\"$")
    public void i_verify_the_details_and_the_should_be(String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I verify  if \"([^\"]*)\" has the value \"([^\"]*)\"$")
    public void i_verify_if_has_the_value(String object, String content) throws Throwable {

        this.dashBoardPage.visibilityOfElement(this.dashBoardPage.deviceAttributesSingleElement(object));
        this.dashBoardPage.verifySingleElements(this.dashBoardPage.deviceAttributesSingleElement(object),content);
    }


    @Then("^I verify if the objects has the correct values$")
    public void i_verify_if_the_objects_has_the_correct_values(DataTable verifyElements) throws Throwable {

        for (Map<String, String> data : verifyElements.asMaps(String.class, String.class)) {
            this.dashBoardPage.visibilityOfElement(this.dashBoardPage.deviceAttributesSingleElement(data.get("Object")));
            this.dashBoardPage.verifySingleElements(this.dashBoardPage.deviceAttributesSingleElement(data.get("Object")), data.get("Value"));
        }


    }

    @When("^I want to change the information i click on Edit \"([^\"]*)\" under the \"([^\"]*)\" button$")
    public void i_want_to_change_the_information_i_click_on_Edit_under_the_button(String subButton,String button) throws Throwable {
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.deviceAttributesActionButton(button));
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.deviceAttributesActionSubButton(subButton));
    }

    @Then("^I Change the Values from old value to new value$")
    public void i_Change_the_Values_from_old_value_to_new_value(DataTable content) throws Throwable {


        this.dashBoardPage.visibilityOfElement(this.dashBoardPage.headerPage("Edit"));


        for (Map<String, String> data : content.asMaps(String.class, String.class)) {
            this.dashBoardPage.visibilityOfElement(this.dashBoardPage.detailField(data.get("object")));
            this.dashBoardPage.waitAndTypeInField(this.dashBoardPage.detailField(data.get("object").trim()),data.get("value"));

            //this.dashBoardPage.dropDownList(this.dashBoardPage.detailField(data.get("object").trim()),this.dashBoardPage.listSelection(data.get("value").trim()),data.get("value"));
        }

    }

    @Then("^I want i click on the \"([^\"]*)\" button$")
    public void i_Want_to_save_my_information_i_click_on_the_button(String buttonName) throws Throwable {
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.button(buttonName));

    }

    @Then("^I verify if the below attributes has the correct values$")
    public void i_verify_if_the_below_attributes_has_the_correct_values(DataTable verifyElements) throws Throwable {

        for (Map<String, String> data : verifyElements.asMaps(String.class, String.class)) {
            this.dashBoardPage.visibilityOfElement(this.dashBoardPage.deviceAttributesMultipleElement(data.get("object"),data.get("attribute")));
            this.dashBoardPage.verifySingleElements(this.dashBoardPage.deviceAttributesMultipleElement(data.get("object"),data.get("attribute")), data.get("value"));

        }
    }
}
