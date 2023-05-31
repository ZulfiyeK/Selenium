package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators {

     /*
      herhangi bir web elementine ulasabilmem icin bir adresinin olmasi gerekir.
      otomasyonla bir web elemente mudahale edebilmem icin buranin adresi lazim.
      her bir web elementin kendine ozgu bir html adresleri vardir. bu adresler tag'lar ile gosterilir.
      <h1>, <a> , gibi taglar var, atritibutler ile sayfalara gidip bu web elementin hangi taga sahip ise atribut degereini alacagim
      aldigim html kodlari(deger) unque olmak zorunda. kaynak adres belirtmek zorundayim.
      class dan almak istedigimde yine unique olmak zorunda ki hangisine gidecegini bilin

    -- Webelemetler: Button, Search, Text box, Headers, Tables
    -- Webelement taglari: <html>, <body>, <label>,<input>, <a> vb.
       Biz webelementlere ulasmak icin HTML kodlarini kullanacagiz.
     <tr>==> row satir demek.

    bir web sayfasinda gordugumuz hersey bir webelementtir ve her bir webelement html kodlarina sahiptir.
    bzim bu web elemenlerine mudahale edebilmemeiz icin bu web elementlerin kodlarina ihtiyacimiz vardir.
    ama aradigimiz web elementi dogru bir sekilde bulabilmemeiz icin dogru kodu girmis olmamiz gerkir.
    bunun icin de bu kodlarin tekrarsiz benzersiz yani unique olmasi gerekmektedir.

    lokaters'ler web elementlerini tanimlamak icin kullanilir.metin kutulari, onay kutulari, linkler,
    radiolar gibi bunlar uzerinde eylemler gerceklestirebilmek icin locators'lara ihtiyacimiz var.
    web elementlerine ulasabilmek icin tag ve bazi attribute'ler kullanilir,
    bunlara ulasilamayan web elemnetler icin ozel olarak tanimlanan Xpath ve css locator'lari kullanilir.

    8 tane locator vardir.
        1. id,
        2. name,
        3. className,
        4. tagName,
        5. link Text,
        6. partialLinkTest,
        7. xpath(xpath yazmanin birden fazla yolu vardir),
        8. cssSelector(css yazmanin biren fazla yolu vardir),

    bir web elementin html kodlarinda id varsa id, yoksa xpath veya css kullanirim.
    ?? web sitesinde input tagi var, kactane link tagi var givbi sorulabilir..

    Locatoraslari Bulabilmek icin Kullanilan Methodlar
        1. findElemnt(Locator) Methodu
        driver.findElement(Locator)

        2.  findElemnt(Locator) Methodu icine parametre yazacagimiz locator'un  8 locatordan hangisi oldugunu belitmek icin locate bilgisi yazilir.
        driver.findElement(By.LocatorTuru("LocateBilgisi")

        web ogesini tanimlamanin en kolay yolu id kullanmaktir cunku genellikle unique olur.

      */


    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

    //Arama kutusunu locate edelim,Arama kutusuna iphone yazdıralım ve aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);//

        /*
         Bir webelementin Locat'ini birden fazla kullanacaksak bir Webelement'e degisken olarak atayabilirsiniz.
         Webelement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); seklinde kullanabiliriz.

        1. Locat islemi bittikten sonra eger Webelemen'e metin gondereceksek sendKeys() methodu kullaniriz.,
        2. web elemente tiklayacaksak click() methodu kullaniriz.
        3. webelementin uzerindeki yaziyi almak istiyorsak
        4. sendKeys() methodundan sonra(yani webelement'e metin gonderdikten sonra) Keys.ENTER ile yada
           submit() methodu ile manuel olarak enter yaptigimiz gibi otomasyonda da yapabiliriz.
         */


    //Sayfayı kapatalım
        driver.close();


































    }
}
