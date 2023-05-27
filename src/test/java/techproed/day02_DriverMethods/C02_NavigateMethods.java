package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromDriver", " src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//bos bir chrome driversayfasi aciyor.
        // driver objesi ile de bu sayfaya git diyorum ve asagidaki islemleri yap demis oluyorum.

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get methodu() ile ayni isi goruyor.
        Thread.sleep(3000);// 3 sn bekler diger sayfaya gecmek icin.


        //Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");


        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon Sayfa Basligi: "+driver.getTitle());
        Thread.sleep(3000);


        //Techproeducation sayfasına geri dönelim
        driver.navigate().back();//onceki sayfaya geri gitmek icin back() methodu kullanilir.


        //Sayfa başlığını yazdıralım
        System.out.println("Techproeducation Sayfa basligi: "+driver.getTitle());
        Thread.sleep(3000);


        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();//sirayi takip eder
        System.out.println("Amazon Sayfasi Url'i"+driver.getCurrentUrl());
        Thread.sleep(3000);


        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();//sayfayi yeniler
        Thread.sleep(3000);


        driver.close();




    }
}
