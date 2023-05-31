package techproed.day04_Locators;

public class C03 {
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
            <tbody> ---> tbody 'ye ulasabilmem icin --> //div/ table /tbody seklinde yol yazarim. bir miktar tag atlamak, gecmek yazmak istemiyorsam // iki slash atarim.
                <tr>

    istedigimiz herhangi bir parent tag'indan baslayabiliriz.


2. Relative xpath (bunu kullanacagiz)
    temel olaak uc bilesen vardir.
    1. tag name
    2. attribute
    3. attribute value
    bu uc bileseni birlikte kullanarak her bir web element icin unique sonuc veren bir cok xpath yazabilriz.
    //tagName[@attributeIsmi = 'attributeValue']





*/






}
