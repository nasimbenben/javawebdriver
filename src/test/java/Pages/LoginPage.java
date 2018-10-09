package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    final WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }



    @FindBy(how = How.XPATH, using = ".//input[@name='username']")
    @CacheLookup
    public WebElement userName;


    @FindBy(how = How.XPATH, using = ".//input[@name='password']")
    @CacheLookup
    public WebElement passWord;

    @FindBy(id = "button-1017-btnIconEl")
    @CacheLookup
    static WebElement loginbSubmitButton;



    public void loginModule (WebElement loginElementField,String text) {

        WebElement loginElement = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.elementToBeClickable(loginElementField));
        loginElement.click();
        loginElement.clear();
        loginElement.sendKeys(text);
    }


    public void loginButton(){

        this.loginbSubmitButton.click();
    }






}
