package techproed.day01_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkTest_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliiklerini ayarlamak için setProperty() methodu ile kullanırız.
        //setProperty methodu ile class'imiza driver'in fiziki yolunu belirtiriz.


        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty ile "Key" değerini girerek "value" a ulaşılabilir.

        WebDriver driver = new ChromeDriver();//chrome kullanacagim icin chrome olusturdum.
        driver.get("https://techproeducation.com");//get methodu ile String olarak girilen url'e gideriz.







    }
}
