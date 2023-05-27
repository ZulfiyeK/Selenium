package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("chromDriver", " src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
           ONEMLI
           implicitlyWait(Duration.ofSeconds(20) : sayfadaki webElemenlerini gorunur hale gelene kadar max 20 sn bekler.
           Eger 2 saniyede olusursa 2 saniye bekler ve alt satira gecer . Fakat belirttigimiz sure boyunca internetten
           ya da sayfadan kaynakli webElementler olusmazsa testimiz "FAIL" verir.

           Thread.sleep() : java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
           30 saniye bekler ve alt satira gecer .
        */

    //techproed sayfasina gidelim
        String techproUrl = "https://www.techproeducation.com";// bir sayfada birden fazla kez kullanilacaksa bu sekilde Strin'a assign etmek daha kullanisli olur.
        String amazonUrl = "https://amazon.com";
        driver.get(techproUrl);

    //amazona gidelim
        driver.get(amazonUrl);

    //techpro sayfasina geri donelim
        driver.navigate().back();

    //sayfa basligini Techpro icerdigini test edelim
        String arananKelime = "Techpro";
        String actuaTtitle = driver.getTitle();

        if(actuaTtitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

    //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

    //sayfa basligini Amazon icerdigini test edelim
        if(driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


    //Sayfayi kapatiniz.
        driver.close();












    }
}
