package Pages.MultiSensePages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashBoardPage {


    final WebDriver driver;

    public dashBoardPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement headerPage(String overviewPage) {

     //   WebElement HeaderPage =   driver.findElement(By.xpath("//span[contains(text(),"+overviewPage.trim()+")][@class='x-header-text x-panel-header-text x-panel-header-text-large']"));
      WebElement HeaderPage =   driver.findElement(By.xpath("//span[@class='x-header-text x-panel-header-text x-panel-header-text-large']"));
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
        WebElement link =   driver.findElement(By.linkText(links));
        return link;
    }


    public WebElement addButton(String button){

        WebElement link =   driver.findElement(By.linkText(button.trim()));
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

    WebElement dynElm =   driver.findElement(By.xpath("//table[contains(.,'"+object.trim()+"')]//label[contains(.,'"+Attribute.trim()+"')]/../following-sibling::td[1]//div[@role ='textbox']"));
    return dynElm;

    }




    public WebElement deviceAttributesActionButton(String button){

     WebElement dynElm =   driver.findElement(By.xpath("//span[contains(.,'"+button.trim()+"')]/span[2]"));
      return dynElm;

      }


    public WebElement deviceAttributesActionSubButton(String subButton){

     WebElement dynElm =   driver.findElement(By.xpath("//span[text()='Actions']/following::a//span[contains(.,'"+subButton.trim()+"')]"));
      return dynElm;

    }


     public WebElement button(String Button){

     WebElement dynElm =   driver.findElement(By.xpath("//a//span[contains(.,'"+Button.trim()+"')][@class='x-btn-wrap']"));
     return dynElm;

       }



       public String concatString(String string){

           String split[] = string.split(" ");
           String low = split[0].toLowerCase();

        try {

            String concat = low + split[1];
            System.out.println("Concat :   "+concat);
            return concat;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catched string :  "+low);
            return low;

        }

    }



    public WebElement detailField(String field,String concat){

         WebElement dynElm =   driver.findElement(By.xpath("//td[contains(.,'"+field+"')]//following-sibling::*/..//..//..//..//input[contains(@name, 'properties."+concat+"')]"));

      return dynElm;

              }


    public WebElement errorMessage(String error){

        WebElement dynElm =   driver.findElement(By.xpath("//div[contains(.,'"+error+"') and contains(@id,'panel') and contains(@id, 'innerCt')]"));
        return dynElm;
    }



    public WebElement listSelection(String field){

        WebElement dynElm =   driver.findElement(By.xpath("//li[contains(.,'"+field+"')]"));
        return dynElm;

    }


    public void verifySingleElements(WebElement xpath,String expectedValue){

        System.out.println("Xpath : "+xpath.getText().trim().replaceAll("[-+.^:,']","")+" actual : " +expectedValue.trim().replaceAll("[-+.^:,']",""));
        Assert.assertEquals(xpath.getText().trim().replaceAll("[-+.^:,']",""),expectedValue.trim().replaceAll("[-+.^:,']",""));

    }


    public void verifyIncorrectSingleElements(WebElement xpath,String expectedValue){



        System.out.println("ACTUAL : "+xpath.getText().trim().replaceAll("[-+.^:,']","")+" EXPECTED : " +expectedValue.trim().replaceAll("[-+.^:,']",""));
        Assert.assertNotEquals(xpath.getText().trim().replaceAll("[-+.^:,']",""),expectedValue.trim().replaceAll("[-+.^:,']",""));

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

        Actions hover = new Actions(driver);
        hover.moveToElement(DynamicElement).build().perform();

    }



     public void dropDownList(WebElement DynamicElement,WebElement listView, String content) {
                                                                                                                      
         WebElement elements = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOf(DynamicElement));
                                                                                                                      
         Actions hover = new Actions(driver);                                                                         
         hover.moveToElement(DynamicElement).build().perform();                                                       
         elements.click();


         WebElement list = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOf(listView));

         Select dropdown = new Select(listView);
         dropdown.selectByVisibleText(content.trim());
                                                                                                                      
     }

    public void waitAndTypeInField(WebElement DynamicElement,String content) {

        WebElement elements = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOf(DynamicElement));

        Actions hover = new Actions(driver);
        hover.moveToElement(DynamicElement).build().perform();
        elements.click();
        elements.clear();
        elements.sendKeys(content);
        elements.sendKeys(Keys.RETURN);


    }





}
