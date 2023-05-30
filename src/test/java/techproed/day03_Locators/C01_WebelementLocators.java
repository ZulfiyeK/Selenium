package techproed.day03;

public class C01 {
    public static void main(String[] args) {
     /* herhangi bir web elementine ulasabilmem icin bir adresinin olmasi gerekir.
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
        1.id,
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
    }
}
