package Lesson2_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_NavigationsMethods {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        //4. Tekrar YouTube’sayfasina donelim
        //5. Yeniden Amazon sayfasina gidelim
        //6. Sayfayi Refresh(yenile) yapalim
        //7. Sayfayi tam ekran yapalim
        //8. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.navigate().to(" https://www.youtube.com");
        driver.navigate().to(" https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit(); // quit varsa açık olan tüm sayfaları kapatır. Close ise sadece
        // driverin son bulundugu sayfayı kapatır
        //  driver.close();

    }









}


