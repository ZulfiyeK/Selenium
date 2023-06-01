package techproed.day05_XpathCssSelector;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class C03_RelativeLocators {
    /*
    Selenium ile gelen yeniliklerden biridir. Bagil locator'lardir.
    Bir Webelementi direk locate edemedigimiz durumlarda etrafindaki web elementlerin referansi ile tarif edebiliriz.
    Bir web sayfasinda benzer ozelliklere sahip webelemenletinin oldugu durumlarda kullanilabilir.

        - above--> belirtilen elementin ustunde olan elementi secer.
        - below--> belirtilen elementin altinda olan elementi secer.
        - to_left_of--> belirtilen elementin solunda olan elementi secer.
        - to_right_of--> belirtilen elementin saginda olan elementi secer.
        - near--> belirtilen elementin yaninda/yakininda olan elementi secer.

            a  b  c  d      f'yi bulabilmek icin--> j'nin ustunde, e 'nin saginda seklinde tarif ederim.
            e  f  g  h      bunun icin once f'nin ve e'nin locate'ni alirim.
            i  j  k  l
    */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //amazon sayfasına gidelim
        driver.get("https://amazon.com");


        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);



        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
       WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        WebElement roadBikes = driver.findElement(with(By.tagName("span")).above(hybridBikes));
        roadBikes.click();



        // sayfayı kapatın
        driver.close();
















    }


}
