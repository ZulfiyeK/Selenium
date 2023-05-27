package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Browsere gittikten sonra sayfayi hemen maximize yapalim, cunku default olarak kucuk geldigi icin
          her hangi bir yerdeki web elemente mudahale edemem, mudahale edebilmem icin sayfayi buyutmem gerekir.   .
        2.manage(). window().maximize() methodu ile browser'i sayfayi buyutur.objeyi olusturduktan sonra bunu hemen yapmak lazim.
        3.getPosition() kordinatlarini, sayfanin ilk acildiginda ki boyutunu verir.setPosition ile de ekranda istedigimiz yere tasiyabiliriz.
        3.getSize() brovser'in olculerini veriri.
*/
        System.setProperty("chromDriver", " src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());


        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari : "+driver.manage().window().getSize());


        Thread.sleep(3000);
        //Browser'i maximize yapalim.
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");


        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());


        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari : "+driver.manage().window().getSize());
        Thread.sleep(3000);


        Thread.sleep(3000);
        //Sayfayi minimize yapalim.(asagi atalim)
        driver.manage().window().minimize();


        //Sayfayi FullScreen yapalim.
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));//hedef konumu belirtmem gerek x,y olarak. icine new point degiyp yeni degerleri belirtmem gerkir.
                                                                     //bu sayede istedimiz konuma getirir.
        driver.manage().window().setSize(new Dimension(600,600));//istedimiz olculerde yazdirmayi saglar.



        Thread.sleep(3000);
        driver.close();














    }
}
