package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01_Xpath {
 /*
     Tag nedir?
     HTML komutlarına tag denir ve <> işaretinin arasına yazılır.
     Taglar arasinda parent child isilkisi vardir ve kardes iliskisi vardir.
     ic ice olanlarda parent chil, alt alta olanlarda kardes iliskisi vardir.

     Inceledigimiz HTML kodunda div, table, tbody taglarini ustten alta dogru sirali halde gorduk.Parent olanlar
     ustte, child'lar kendi parent'larinin altinda siralanmis.
     td taglari ise ayni hizada alt alta sirali idi ve td taglari birbirinin kardesleridir.

     Tags: < > şeklinde görülen komutlara etiket (tag) adı verilir.
     parent-child-sibling relationship(Ebeveyn-çocuk-kardeş ilişkisi) hakkında konuştuğumuzda, yalnızca tag adları önemlidir
     <table>, <div> in çocuğudur(child) ve <tbody>, <tr> in ebeveyndir (parent)
     <td> taglari ise siblings (kardes)'dir

iki cesit xpath vardir.

1. Absolute xpath
    bazen hatalar verebiliyor bu yuzden pek kullanmayiz.Absolute xpath yazmak icin once // yazmak gerekir, aralarda ise tek / yazilir.
    tbody'e ulasmak icin en bastaki koda gitmek gerekir..

    ornegin: Asagidaki gibi bir html kodumuz olsun

    <div
        <table
            <tbody> ---> tbody 'ye ulasabilmem icin --> //div/ table /tbody seklinde yol yazarim.
                <tr>                                    bir miktar tag atlamak, gecmek yazmak istemiyorsam // iki slash atarim.

    istedigimiz herhangi bir parent tag'indan baslayabiliriz.


2. Relative xpath (bunu kullanacagiz)
    temel olaak uc bilesen vardir.
    1. tag name
    2. attribute
    3. attribute value

    bu uc bileseni birlikte kullanarak her bir web element icin unique sonuc veren bir cok xpath yazabilriz.

   By.xpath( "//tagName[@attributeIsmi = 'attributeValue']")

    xpath ile butun attribute 'ler ile lokate alabiliriz.unique olmak zorunda

*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");


        // arama kutusuna "city bike"  yazıp aratın
                //once arqaqama kutusunun locate'ini almam lazim
        //1. yol- id = twotabsearchtextbox attribute'i ile arama
        // WebElement aramaKutusu = driver.findElement((By.xpath("//input[@id='twotabsearchtextbox']")));//locate aldik, id olmasaydi baska bir attribute'yi kullanabilirdik.
        //  aramaKutusu.sendKeys("city bike "+ Keys.ENTER);

        // 2. yol -placeholder='Search Amazon' ile arama
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        aramaKutusu.sendKeys("city bike "+ Keys.ENTER);


        // Hybrid Bikes bölümüne tıklayın
        WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
            //herhangi bir attribute' assign edilmediyse ve herhangi bir elmas<> icinde degilse o zaman anliyorum ki bu text'tir.
            //xpath icine text yazarken @ kullanilmaz.
        hybridBikes.click();


        // sonuc sayısını yazdırın
        WebElement sonuc = driver.findElement(By.xpath("//span[text()='6 results for']"));
        System.out.println(sonuc.getText());
        String sonucSayisi [] = sonuc.getText().split(" ");
        System.out.println("sonucSayisi = " + Arrays.toString(sonucSayisi));//bu kodu yazmasak da olur.
        System.out.println("sonucSayisi[0] = " + sonucSayisi[0]);


        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
       // (//div[@class='a-section aok-relative s-image-fixed-height'])[1]--> parantez icine alip sonuna da [1] yazinca ilk olani alarak unique yapmis oluruz.


        //Sayfayı kapatınız
        driver.close();

    }




}
