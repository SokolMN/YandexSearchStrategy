package Yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StrategyPage {
    WebDriver driver;

    public StrategyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseLoywer(){
        WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'Законы')]"));
        //WebElement element = driver.findElement(By.xpath("//div"));
        System.out.println(driver.getCurrentUrl());

        element.click();
    }

    public WebDriver getDriver(){
        return this.driver;
    }

}
