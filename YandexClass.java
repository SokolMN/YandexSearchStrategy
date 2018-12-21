package Yandex;

import HTTP.APIWorker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class YandexClass {

    WebDriver driver;

    @BeforeClass
    public void getStartPate() {
        System.setProperty("webdriver.chrome.driver", "C:\\Repository\\Rep1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String lunaLoginIRL = "https://yandex.ru";
        driver.get(lunaLoginIRL);
        System.out.println("Переходим на страницу яндекса");
    }

    @Test
    public void findStrategium(){
        YandexPage yaPage = new YandexPage(driver);
        yaPage.setFindSearch("Стратегиум");
        //yaPage.chooseItem("");

     //   yaPage.chooseItem("//b[@class='needsclick' and contains(text(), 'форум о стратегических играх')]");
        yaPage.chooseItem("//div[@class='organic__url-text']");

        driver = yaPage.getDriver();

        StrategyPage strategyPage = new StrategyPage(driver);
        strategyPage.chooseLoywer();
        driver = strategyPage.getDriver();
        System.out.println("Название вкладки: " + driver.getTitle());

        assertEquals("Законы Форума - Конституция и Законы - Strategium.ru",driver.getTitle());
    }
}
