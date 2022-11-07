package Lesson4_xPathCSSSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Intro {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a.google web sayfasına gidin. https://www. amazon.com/
        //    b. Search(ara) “city bike”
        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //    d. “Shopping” e tıklayın.
        //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");
        //    b. Search(ara) “city bike” yazın. Arattırın
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        // aramaKutusu.submit(); // Enter tuşuna basma gibi çalışır.

        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın.

        WebElement sonucYazisiElementi=driver.findElement(By.className("sg-col-inner"));

        // className ile daha önce bu elementi locate edemedigimiz halde
        // xPath ile class attribute'nu kullanarak locate edebildik.

        System.out.println(sonucYazisiElementi.getText());

        //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        // WebElement ilkUrunResmi=driver.findElement(By.className("s-image"));
        // ilkUrunResmi.click();
        // Sadece click yapmak gibi basit bir işlemde kullanacagımız WebElementler için
        // Variable oluşturmadan direk locate edip istedigimiz işlemi yapabiliriz.

        driver.findElement(By.className("s-image")).click();

    }

}
