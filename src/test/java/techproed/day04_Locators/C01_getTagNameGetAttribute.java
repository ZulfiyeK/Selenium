package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {

    /*
   webElement.getTagName( ); Web elementin tag ismini getirir.
   Bir HTML koduna inspect ile baktik. Tag name'nin input oldugunu gorduk. getTagName() bize
   input'u verir.


   webElement.getAttribute("Att.ismi" ); Ismi girilen attribute'un degerini getirir.
   Ayni HTML koduna baktik ve id olan attribute'u gorduk. Bu id attribute'i getAttribute() parantezi
   icine yazarsak bize value'su olan twotabsearchtextbox'i verir.

        */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//sayfadaki her bir web elementin yuklenebilmesi icin max bekleme suresi.


        //amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        //arama kutusunu locate ediniz.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //arama kutusunun tagName'nin "input" oldugunu test edin
        String actuelTagName = aramaKutusu.getTagName();//arama kutusunun tagNameni verecek
        String expectedTagName = "input";
        if(actuelTagName.equals(expectedTagName)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        //arama kutusunun name attribute'inin degerinin "field-keywords" oldugunu test edin
        String actuelAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute = "field-keywords";
        if (actuelAttribute.equals(expectedAttribute)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }


        //sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
























    }
}
