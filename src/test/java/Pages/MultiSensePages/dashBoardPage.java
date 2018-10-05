package Pages.MultiSensePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashBoardPage {

    final WebDriver driver;

    public dashBoardPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement headerPage(String overviewPage) {
        return driver.findElement(By.xpath("//span[text()[contains(.,'"+overviewPage+"')]][@class='x-header-text x-panel-header-text x-panel-header-text-large']"));
    }


    public WebElement mainMenu(String mainMenuItem) {
        return driver.findElement(By.xpath(".//span[@class='name'][contains(text(),"+mainMenuItem+")]"));
    }

    public WebElement subMenu(String subMenuItem) {
        return driver.findElement(By.xpath(".//span[text()[contains(.,'"+subMenuItem+"')]][@class='x-btn-inner x-btn-inner-center']"));
    }


    public WebElement deviceTasks(String mainObject, String subObject) {
        return driver.findElement(By.xpath("//div[contains(.,'"+mainObject+"')]//a//span[text()='"+subObject+"']"));
    }


    //https://enexis.energyict.com/apps/multisense/index.html#/devices/devicegroups
    //https://enexis.energyict.com/apps/multisense/index.html#/devices/devicegroups/3001

    public WebElement deviceGroupItem(String deviceGroupItems) {
        return driver.findElement(By.xpath("//div//a[text() = '"+deviceGroupItems+"']"));
    }


    //https://enexis.energyict.com/apps/multisense/index.html#/devices/Dummy%20device%201
    public WebElement deviceSpecificOptions(String deviceOptions) {
        return driver.findElement(By.xpath("//span[text() = '"+deviceOptions+"']"));
    }



}
