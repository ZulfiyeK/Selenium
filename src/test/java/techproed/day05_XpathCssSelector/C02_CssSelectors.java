package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick ='addElement()']")).click();


        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete butonu GORUNUR");
        }else {
            System.out.println("Delete butonu GORUNUR DEGIL");
        }

        //Delete butonuna basin


        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin


        //Sayfayı kapatın
       // driver.close();





    }
}
