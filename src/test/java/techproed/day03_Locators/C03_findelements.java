package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //mamazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //sayfadaki linklerin sayisini ve linkleri yazdiralim.

        /*
        findelement methodu ile bir webelemente ulasirken, birden fazla webelement icin findelements() methosunu kullaniriz.
        Bu web elementlerin sayisina ulasabilmek icin ya da bu webelementlerin yazisini konsola yazdirabilmek icin
        List<Webelement> LinklerListesi = driver.findelements(By.locator("locator degeri") olarak kullaniriz.
        Olusturmus oldugumuz list'i loop ile konsola yazdirabiliriz.
        */


        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerListesi = " + linklerListesi.size());
        /*
        for (WebElement w :linklerListesi) {
            if(!w.getText().isEmpty()) {//yazisi olmayan linkleri getirmesin diye if kodu yazdik.
                System.out.println(w.getText());
         }}
         */

        //lambda ile yazdiralim
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});

        //hop deals in Electronics webelementinin yazisini yazdiralim
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.linkText("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement((By.id("nav-link-accountList-nav-line-1")));
        System.out.println(webElementYazisi.getText());
        //webelementin uzerindeki yaziyi almak istiyorsak getText() methodu kullaniriz.

        driver.close();

    //Amazon sayfasına gidiniz
    //iphone aratınız
    //çıkan sonuç yazısını konsola yazdırınız
    //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız








    }
}
