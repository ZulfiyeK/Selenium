package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElementLocators {
    /*

    WebElement Is Selected Methodlari
    - isEnable()= webelement eriseilebilir ise true-false dondurur.
    - isDisplayed()= webelement gorunur ise true-false dondurur.
    - IsSelected()= webelement secili ise true-false dondurur.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//tum islem chrome ayarlari


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://wwww.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+ Keys.ENTER);//bir kaz kez kullanacaksak driver' i bir WebElement'e assign etmeye gerek yok, boyle kalabilir.


        // sonuc yazısını yazdırın
        List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
                                                                    //birden fazla " a-section a-spacing-small a-spacing-top-small"
                                                                    // oldugu icin bir list'e assign ettik.
       WebElement sonucYazisi= sonucYazilari.get(0);//listler indekslerle calisir ve ilk indeks 0'dir
        //System.out.println("sonucYazisi = " + sonucYazisi);//bu sekilde yazdirirsak bize hash kodunu veriri.WebElementler bu sekilde yazdirilmaz.
        System.out.println("sonucYazisi = " + sonucYazisi.getText());

        // sonuc sayısını yazdırın
        String sonusSayisi [] = sonucYazisi.getText().split(" ");//array'e assign ettik.
        System.out.println("sonusSayisi = " + Arrays.toString(sonusSayisi));//[10, results, for, "city, bike"]-burdan 10 sayisini almak istiyorum..0.ci indekstekini alacagim.
        System.out.println("sonusSayisi[0] = " + sonusSayisi[0]);// 10 sayisini elde etmeye calisiyorum.


        // ilk ürünün locatini alın
        List<WebElement> sonuclar =driver.findElements(By.className("s-image"));//burada 87 tane elemnt var bana ilk urun lazim.
        WebElement ilkUrun = sonuclar.get(0);//unique hale getirmek icin ilk indeksteki web elementi bulmam gerekiyor.


        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın.
        System.out.println(ilkUrun.isDisplayed());// true- true yada false verecek.


        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());//true


        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());//false - radio buton ve checkbox gibi tik atilabilen yerlerde kullanilir. o yuzden false verecek.


        // ilk urune tıklayın
        ilkUrun.click();


        // sayfayı kapatın
        driver.close();

    }
}
