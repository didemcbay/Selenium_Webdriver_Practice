package Lesson2_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_DriverNavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        // driver.get ile aynı işlemi yapar. Ama daha hızlıdır

        driver.navigate().to("https://www.techproeducation.com"); // ayrı bir obje oluşturulmadıgı için
        // amazondan sonra AYNI SAYFADA techpronun sayfasına gider, farklı bir sayfa AÇMAZ.

        driver.navigate().back(); // bir önceki sayfaya gider

        driver.navigate().forward(); // bir sonraki sayfaya gider

        driver.navigate().refresh(); // sayfayı yeniler.


    }

}


