package Lesson1_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_Intro {
// Normalde Seleniumun kendi IDE'si de var fakat biz daha kullanışlı oldugu için IntelliJ kullanıyoruz.
    // İntelliJ'de yeni bir proje açtıgımızda öncelikle Selenium kütüphanelerini projeye eklememiz gerekir
    // Biz en ilkel hali ile projemize kütüphaneleri jar dosyaları olarak yükledik. Bu ekledigimiz dosyalarla artık
    // Driver'in ayarlarını yapabiliriz.
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
    // setProperty methodu 2 parametre ister.
    // ilki kullanacagımız browser'a ait driver
    // ikinci parametre ise selenium itesinden indirip projemize ekledigimiz chromedriver'in path'i
    // windows--> .exe  koyulurken   apple --> .exe eklenmiyor.
    WebDriver driver=new ChromeDriver(); // hiçbir şey yazmasam da boş bir browser açar, obje oluşturdugu için
    driver.get("https://www.amazon.com");   // herhangi bir siteye gitmemizi saglyor. https yazmak mecburi
    Thread.sleep(5000); // burda yazacagım saniye kadar bekliyor
// java'dan gelir, içine yazılan milisaniye kadar kodların çalışmasını durdurur.

    driver.close(); // açtıgımız web sayfasını bu kodla kapatıyoruz.
// driver.close classın sonuna yazılır.Çünkü bu kod çalışınca driver'imiz kapanır.
    // bu koddan sonra yeniden bir browser açmak istiyorsak driver'a yeni bir deger atamalıyız.

    driver =new ChromeDriver();


}
}
