package Pages.MultiSensePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashBoardPage {


    final WebDriver driver;

    public dashBoardPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement headerPage(String overviewPage) {
        WebElement HeaderPage =   driver.findElement(By.xpath("//span[text()[contains(.,'"+overviewPage.trim()+"')]][@class='x-header-text x-panel-header-text x-panel-header-text-large']"));
        return HeaderPage;
    }


    public WebElement openMainMenu() {
        WebElement openMainMenu =   driver.findElement(By.xpath("//a[@class='x-btn uni-nav-appcenter x-unselectable x-box-item x-btn-default-medium x-icon x-btn-icon x-btn-default-medium-icon']/span"));
        return openMainMenu;
    }



    public WebElement mainMenu(String mainMenuItem) {
        WebElement mainMenu =   driver.findElement(By.xpath("//span[@class='name'][contains(text(),'" + mainMenuItem.trim() + "')]/.."));
        return mainMenu;
    }



    public WebElement subMenu(String subMenuItem) {
        WebElement subMenu =   driver.findElement(By.xpath("//span[text()[contains(.,'" + subMenuItem.trim() + "')]][@class='x-btn-inner x-btn-inner-center']/.."));
        return subMenu;
    }



    public WebElement deviceTasks(String mainObject, String subObject) {
        WebElement deviceTasks =   driver.findElement(By.xpath("//div[contains(.,'" + mainObject.trim() + "')]//a//span[text()='" + subObject.trim() + "']"));
        return deviceTasks;
    }



    public WebElement links(String links) {
        WebElement link =   driver.findElement(By.xpath("//a[text() = '"+links.trim()+"']"));
        return link;
    }

    public WebElement errorButton() {
        WebElement error =   driver.findElement(By.xpath("//div[starts-with(@data-qtip,'Connexo has')]"));
        return error;
    }




      public WebElement objectMenu(String menuItem) {

          WebElement link =   driver.findElement(By.xpath("//a[@data-qtip='"+menuItem+"']/.."));

          return link;

      }




    public WebElement deviceAttributesSingleElement(String object){

        WebElement dynElm =   driver.findElement(By.xpath("//td[contains(.,'"+object.trim()+"')]/following-sibling::td//div[1]"));
        return dynElm;


    }

    public WebElement deviceAttributesMultipleElement(String object, String Attribute){

    WebElement dynElm =   driver.findElement(By.xpath(" //table[contains(.,'"+object.trim()+"')]//label[contains(.,'"+Attribute.trim()+"')]/../following-sibling::td[1]"));
    return dynElm;

    }




    public WebElement deviceAttributesActionButton(String button){

     WebElement dynElm =   driver.findElement(By.xpath("//span[contains(.,'Actions')]/span[2]"));
      return dynElm;

      }


    public WebElement deviceAttributesActionSubButton(String subButton){

     WebElement dynElm =   driver.findElement(By.xpath("//span[contains(.,Edit \'"+subButton.trim()+"\')]"));
      return dynElm;

    }


     public WebElement button(String Button){

     WebElement dynElm =   driver.findElement(By.xpath("//a//span[contains(.,'"+Button.trim()+"')][@class='x-btn-wrap']"));
     return dynElm;

       }




    public WebElement detailField(String field){

     WebElement dynElm =   driver.findElement(By.xpath(" //td[contains(.,'"+field+"')]//following-sibling::td/div//table//tr[@class='x-form-item-input-row']"));
      return dynElm;

              }












                                                                                 

    public void verifySingleElements(WebElement xpath,String expectedValue){
        String actualValue = xpath.getText().trim();
       // Assert.assertEquals(actualValue, true, expectedValue.trim());
        Assert.assertEquals(actualValue,expectedValue.trim());

    }






    public void refreshPage(WebElement DynamicElement) {

        driver.navigate().refresh();
    }






        public void errorCheck(WebElement DynamicElement) {
        try {

            WebElement element = (new WebDriverWait(driver, 30))
                    .until(ExpectedConditions.visibilityOf(DynamicElement));

            Actions hover = new Actions(driver);
            hover.moveToElement((DynamicElement)).build().perform();
            this.errorButton().click();
        }
        catch (NoSuchElementException e){

                }

        }


    ////////Common Logic for all elements

    public void waitAndClickOnElement(WebElement DynamicElement) {

        WebElement elements = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOf(DynamicElement));

        Actions hover = new Actions(driver);
        hover.moveToElement(DynamicElement).build().perform();
        elements.click();

    }

    public void visibilityOfElement(WebElement DynamicElement) {

        WebElement elements = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOf(DynamicElement));

    }



     public void waitAndTypeInField(WebElement DynamicElement,String content) {
                                                                                                                      
         WebElement elements = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOf(DynamicElement));
                                                                                                                      
         Actions hover = new Actions(driver);                                                                         
         hover.moveToElement(DynamicElement).build().perform();                                                       
         elements.click();
         elements.clear();
         elements.sendKeys(content);
                                                                                                                      
     }                                                                                                                






}
