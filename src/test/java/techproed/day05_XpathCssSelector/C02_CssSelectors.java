package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelectors {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);


        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick ='addElement()']")).click();
        Thread.sleep(2000);


        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete butonu GORUNUR");
        }else {
            System.out.println("Delete butonu GORUNUR DEGIL");
        }
        Thread.sleep(2000);

        //Delete butonuna basin
         deleteButton .click();
        Thread.sleep(2000);


        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement AddRemoveElements =  driver.findElement(By.cssSelector("h3"));//css text ile calismadigi icin, herhangi bir attribute olmadigi icin sadece tag ile islem yaptik.
        if(AddRemoveElements.isDisplayed()){
            System.out.println("AddRemoveElements GORUNUR");
        }else {
            System.out.println("AddRemoveElements GORUNUR DEGIL");
        }
        Thread.sleep(2000);


        //Sayfayı kapatın
        driver.close();


        /*

        Xpath ve cssSlelector arsindaki farklar:
        - Xpath text ile calisir.
        - cssSelector text ile calismaz
        - Xpath indekse gore arama yapabilir. Daha fazla kombinasyona sahiptir.
        - cssSelector indekse gore arama yapamaz ama daha hizli calisir.

         */



    }
}
