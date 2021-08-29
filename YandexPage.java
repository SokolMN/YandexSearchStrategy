package Yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexPage {

    WebDriver driver;

    YandexPage(WebDriver driver){
        /*Adding Comment for Test*/
	/*Addin Second Comment for Test*/
        this.driver = driver;
    }

    public void setFindSearch(String findString){
       // WebElement searchLine = driver.findElement(By.xpath("//div[@type='submit']"));
        WebElement searchLine = driver.findElement(By.id("text"));
        searchLine.sendKeys(findString);

        WebElement searchButton = driver.findElement(By.xpath("//form/div[2]/button")); //рабочий вариант
        searchButton.click();

    }

    public void chooseItem(String xpath){
        WebElement needItem = driver.findElement(By.xpath(xpath));
        needItem.click();
        for(String SubWindow:driver.getWindowHandles()){
            driver.switchTo().window(SubWindow);
        }
        System.out.println("URL после клика в яндексе: " + driver.getCurrentUrl());
        System.out.println("URL после клика в яндексе: " + driver.getWindowHandles());
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
