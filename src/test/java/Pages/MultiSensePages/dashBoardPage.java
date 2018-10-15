package Pages.MultiSensePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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



    public String concatString(String string) {
        String property;
        //Battery
        if (string.equals("Battery type")) {
            property = "batteryType";
            return property;
        } else if (string.equals("Battery replacement date")) {
            property = "properties.batteryReplacementDate";
            return property;
            //General
        } else if (string.equals("Construction Year")) {
            property = "properties.constructionYear";
            return property;
        } else if (string.equals("Equipment Identifier")) {
            property = "properties.equipmentIdentifier";
            return property;
            //Modem
        } else if (string.equals("Communication")) {
            property = "properties.communicationModuleId";
            return property;
        } else if (string.equals("IMEI")) {
            property = "properties.imei";
            return property;
            //SIM
        } else if (string.equals("Status")) {
            property = "properties.status";
            return property;
        } else if (string.equals("ICCID")) {
            property = "properties.iccid";
            return property;
        } else if (string.equals("Provider")) {
            property = "properties.provider";
            return property;
        } else if (string.equals("Format")) {
            property = "properties.format";
            return property;
        } else if (string.contains("Batch")) {
            property = "properties.batchId";
            return property;
        } else if (string.equals("IMSI")) {
            property = "properties.imsi";
            return property;
        } else if (string.equals("Name")) {
            property = "name";
            return property;
        } else if (string.equals("Service category")) {
            property = "serviceCategory";
            return property;
        } else if (string.equals("Type of usage point")) {
            property = "typeOfUsagePoint";
            return property;
        } else if (string.equals("Grid operator")) {
            property = "properties.gridOperator";
            return property;
        } else if (string.equals("Administrative status")) {
            property = "properties.administrativeStatus";
            return property;
        } else if (string.equals("External Grid Operator Master")) {
            property = "properties.externalGridOperatorMaster";
            return property;
        } else if (string.equals("Transition")) {
            property = "id";
            return property;
        } else if (string.equals("Connection state")) {
            property = "properties.set.connection.state.property.name";
            return property;

        } else {
            return null;
        }

    }



    public WebElement detailField(String field,String concat){

         WebElement dynElm =   driver.findElement(By.xpath("//td[contains(.,'"+field+"')]//following-sibling::*/..//..//..//..//input[contains(@name, '"+concat.trim()+"')]"));

      return dynElm;

              }


    public WebElement errorMessage(String error) {

        WebElement dynElm = driver.findElement(By.xpath("//td[contains(.,'" + error + "')]/following-sibling::td[1]//div/ul/li"));
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
        elements.isDisplayed();
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
