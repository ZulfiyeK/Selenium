package techproed.day01_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromDriver", " src/resources/drivers/chromedriver.exe");//yolumuzu olusturuyoruz.
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Son girilen sayfanin basligi==>"+driver.getTitle());//Amazon.com. Spend less. Smile more.
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());//amazona gider ve yeni sekmede techproya goider,
        // sonra tekrar amazona yeni sekmede geri gidebilmem icin bunu otomasyonla yapabilmemiz icin "getWindowHandle" kodu yazmamiz gerekiyor.



        driver.get("https://techproeducation.com");
        System.out.println("Son girilen sayfanin basligi==>"+driver.getTitle());//Techpro Education | Online It Courses & Bootcamps--en son gittigi sayfanin basligini veriri.


        System.out.println(driver.getCurrentUrl());//son gittigi sayfanin url'ni getirir.-https://techproeducation.com/--dogrulamalarda kullanacagiz.

        //System.out.println(driver.getPageSource());// butun kaynak kodlarini yazdirir. cok uzun oldugu icin simdilik yoruma alacagim.kaynak kodlarinda ...kod geciyor mu diye sorabilirler..if ile bakilabilir.

        System.out.println(driver.getWindowHandle());// 0B0FCE657CE8E7EEEF396CAAE5BAD5A9 ---gidilen sayfanin handle degerini(hashkod) verir. Bu handle degerini sayfalar arasi gecis icin kullaniliriz.




    }
}
