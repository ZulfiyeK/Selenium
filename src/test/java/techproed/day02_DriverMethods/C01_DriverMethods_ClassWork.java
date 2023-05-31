package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", " src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim,
        driver.get("https://amazon.com");

        // Sayfa basliginin Amazon icerdigini test edelim,(Expected)
        String actualTitle = driver.getTitle();//gercek title
        String expectedTitle = "Amazon";// iceriyor mu-beklenen title
        //gittigim sayfanin basligini getTitle() methodu ile aliyoruz.Expected da beklenen(expected ile actual esitmi bakiyoruz.)
        //if ile de bunu yazdirdik.
        //testeer olarak asil amacimiz actual ile expected karsilastirilmasidir. actual expected i iceriyor ise passed icermiyor ise failed aliriz


        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // Url'in https://www.amazon.com oldugunu test edelim,
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED "+ actualUrl);
        }else System.out.println("Test FAILED "+ actualUrl);



        // Sayfayi kapatalim.
        driver.close();//Browser'i kapatir--islem bitmeden kapatmamak gerek..
       // driver.quit();// birden fazla brovser varsa hepsini kapatir.




    }
}
