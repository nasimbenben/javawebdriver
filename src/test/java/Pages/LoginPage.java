package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    final WebDriver driver;


   // @FindBy(how = How.NAME, using = "username")
    @FindBy(how = How.XPATH, using = ".//input[@name='username']")
    @CacheLookup
    public WebElement userName;


    @FindBy(how = How.XPATH, using = ".//input[@name='password']")
    @CacheLookup
    static WebElement passWord;

    @FindBy(id = "button-1017-btnIconEl")
    @CacheLookup
    static WebElement loginbSubmitButton;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


    public void setUserName(String user){
        userName.click();
        userName.clear();
        userName.sendKeys(user);

    }

    public void setUserPassword(String pass){

        passWord.click();
        passWord.clear();
        passWord.sendKeys(pass);
    }


    public void loginButton(){

        loginbSubmitButton.click();
    }




}
