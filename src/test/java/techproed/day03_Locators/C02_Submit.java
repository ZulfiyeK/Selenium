package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //arama sayfasina gidelim,
        driver.get("https://www.amazon.com");

        //aramakutusunu lokate edip iphone aratalim
        WebElement aramakutusu = driver.findElement((By.name("field-keywords")));
        aramakutusu.sendKeys("iphone");
        Thread.sleep(3000);
        aramakutusu.submit();//keys.ENTER
        //burdan sonra back yapip tekrar aramakutusu.senKeys yazip bir de samsung aratirsak
        //StaleElementReferenceException atar cunku webelemnk aramak kutusu...kodumuz eskimis bayatlamis olur calismaz.


        //sayfayi kapatalim.
        driver.close();
    }
}
