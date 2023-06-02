package techproed.day06_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //amazon sayfasına gidelim
        driver.get("https://amazon.com");


        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);



        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //Webelementlerin yazısını konsola yazdıralım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));//tagName yerine * da yazilabilir.
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());

        System.out.println("*******************************************************************");

        //Bikes altındaki tüm linkleri(webelement) konsola yazdıralım
        List<WebElement> linklerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
        linklerListesi.forEach(t-> System.out.println(t.getText()));

        /*
        xPath kullaniminda bir sayfadaki wevelementlere mudahale etmek istedigimizde xpath ile locate aldigimizda birden fazla sonic verebilir.
        [position()>=9 and position()<=15] bu kullanimla aralik belirterek istedigimiz we'leri secip mudahale edebiliriz.
         */

        //lambda ile yazdirdik
        linklerListesi.forEach(t-> System.out.println(t.getText()));
        System.out.println("*******************************************************************");

        //foreach ile yazdirdik
        for (WebElement w: linklerListesi) {
            System.out.println(w.getText());
        }

        System.out.println("*******************************************************************");
        //bu linklerin hepsine tiklayalim ve sayfa basliklarinizi yazdiralim
        for (int i = 0; i < linklerListesi.size(); i++){
            linklerListesi= driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(linklerListesi.get(i).getText());
            linklerListesi.get(i).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }




        driver.close();
    }

}
