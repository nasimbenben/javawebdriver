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


    @Given("^user is logged in as user \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_is_logged_in_as_user_and_password(String user, String pass) {

        this.loginPage.loginModule(this.loginPage.userName, user);
        this.loginPage.loginModule(this.loginPage.passWord, pass);
        this.loginPage.loginButton();

    }

    @When("^user sees \"([^\"]*)\" overview page$")
    public void user_sees_overview_page(String pageHeader) throws Throwable {

       this.dashBoardPage.visibilityOfElement(this.dashBoardPage.headerPage(pageHeader));

    }

    @Then("^user clicks on \"([^\"]*)\" under the \"([^\"]*)\" main menu$")
    public void user_clicks_on_under_the_main_menu(String subMenu, String mainMenu) throws Throwable {

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.openMainMenu());
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.mainMenu(mainMenu));
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.subMenu(subMenu));
    }


    @Then("^user selects \"([^\"]*)\" under the \"([^\"]*)\" object$")
    public void user_selects_under_the_object(String main, String sub) throws Throwable {

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.deviceTasks(main,sub));
    }


    @Then("^user clicks on \"([^\"]*)\" under Device groups$")
    public void user_clicks_on_under_Device_groups(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.links(item));
    }

    @Then("^user selects \"([^\"]*)\" in a list overview$")
    public void user_selects_in_a_listoverview(String Device) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.links(Device));
    }

    @Then("^user clicks on \"([^\"]*)\"$")
    public void user_clicks_on(String link) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.links(link));
    }


    @Then("^user clicks on \"([^\"]*)\" of the object menu$")
    public void user_clicks_on_of_the_object_menu(String objectItem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.objectMenu(objectItem));
    }

    @Then("^user verifies the \"([^\"]*)\" details and the \"([^\"]*)\" should be \"([^\"]*)\"$")
    public void user_verifies_the_details_and_the_should_be(String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user verifies  if \"([^\"]*)\" has the value \"([^\"]*)\"$")
    public void user_verifies_if_has_the_value(String object, String content) throws Throwable {

        this.dashBoardPage.visibilityOfElement(this.dashBoardPage.deviceAttributesSingleElement(object));
        this.dashBoardPage.verifySingleElements(this.dashBoardPage.deviceAttributesSingleElement(object),content);
    }


    @Then("^user verifies if the objects has the correct values$")
    public void user_verifies_if_the_objects_has_the_correct_values(DataTable verifyElements) throws Throwable {

        for (Map<String, String> data : verifyElements.asMaps(String.class, String.class)) {
            this.dashBoardPage.visibilityOfElement(this.dashBoardPage.deviceAttributesSingleElement(data.get("Object")));
            this.dashBoardPage.verifySingleElements(this.dashBoardPage.deviceAttributesSingleElement(data.get("Object")), data.get("Value"));
        }


    }

    @When("^user wants to change the information i click on Edit \"([^\"]*)\" under the \"([^\"]*)\" button$")
    public void user_wants_to_change_the_information_i_click_on_Edit_under_the_button(String subButton,String button) throws Throwable {
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.deviceAttributesActionButton(button));
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.deviceAttributesActionSubButton(subButton));
    }

    @Then("^user changes the Values from old value to new value$")
    public void user_changes_the_Values_from_old_value_to_new_value(DataTable content) throws Throwable {


        this.dashBoardPage.visibilityOfElement(this.dashBoardPage.headerPage("Edit"));


        for (Map<String, String> data : content.asMaps(String.class, String.class)) {
            this.dashBoardPage.visibilityOfElement(this.dashBoardPage.detailField(data.get("object")));
            this.dashBoardPage.waitAndTypeInField(this.dashBoardPage.detailField(data.get("object").trim()),data.get("value"));

            //this.dashBoardPage.dropDownList(this.dashBoardPage.detailField(data.get("object").trim()),this.dashBoardPage.listSelection(data.get("value").trim()),data.get("value"));
        }

    }

    @Then("^user clicks on the \"([^\"]*)\" button$")
    public void user_clicks_on_the_button(String buttonName) throws Throwable {
        this.dashBoardPage.waitAndClickOnElement(this.dashBoardPage.button(buttonName));

    }

    @Then("^user verifies if the below attributes has the correct values$")
    public void user_verifies_if_the_below_attributes_has_the_correct_values(DataTable verifyElements) throws Throwable {

        for (Map<String, String> data : verifyElements.asMaps(String.class, String.class)) {
            this.dashBoardPage.visibilityOfElement(this.dashBoardPage.deviceAttributesMultipleElement(data.get("object"),data.get("attribute")));
            this.dashBoardPage.verifySingleElements(this.dashBoardPage.deviceAttributesMultipleElement(data.get("object"),data.get("attribute")), data.get("value"));

        }
    }
}
