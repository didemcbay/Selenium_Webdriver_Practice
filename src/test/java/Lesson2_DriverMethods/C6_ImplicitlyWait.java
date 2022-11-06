package Lesson2_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C6_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // Bunu en başta her zaman yapmakta fayda var
        // bazı elementler bazen gözükmeyebilir bu yüzden mazimize yapmakta fayda var.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // implicitlywait testimiz boyunca sayfa açılması ve element bulunması konusunda driver'in bekleyecegi
        // maximum süreyi belirler. Bu süre içerisinde görevini bitirir bitirmez bir sonraki adıma geçer
        // Bu süre zarfında görevini bitiremezse o zaman hata verir.

        // Belirlenen max. süre Thread.sleep deki gibi mutlak bekleme süresi degildir. Görevi bitirdiyse 15.sn. yazdıysam
        // sonuna kadar beklemez, görevi bitirince yapıp geçer. Bitiremezse max. süreye kadar bekler,
        // açılmadıgı takdirde run time verir.

        driver.get("https://techproeducation.com");

        // Thread.sleep(15000); // Burada 5 saniye bekler, mutlaka bekler.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        driver.quit();


    }


}
