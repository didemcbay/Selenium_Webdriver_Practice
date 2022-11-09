package Lesson5_SeleniumPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_titleverify {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        //4.https://www.ebay.com/ sayfasina gidin.
        //5. Sayfa basliginin “Ebay.com” icerdigini dogrulayin.
        //6. Tekrar “facebook” sayfasina donun
        //7. Sayfayi yenileyin
        //8. Sayfayi tam sayfa (maximize) yapin
        //9.Browser’i kapatin

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");
        //2.
        String actualTitle = driver.getTitle();
        String expectedResult = "facebook";
        if (actualTitle.equals(expectedResult)) {
            System.out.println("Pass");
        } else {
            System.out.println(actualTitle);
        }

        //3. Sayfa URL’inin “Facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "Facebook";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Pass");
        } else {
            System.out.println(actualUrl);
        }

        //4.https://www.ebay.com/ sayfasina gidin.

        driver.navigate().to("https://www.ebay.com/");


        //5. Sayfa basliginin “Ebay.com” icerdigini dogrulayin.

        String actualTitleE = driver.getTitle();
        String expectedTitle = "Ebay.com";

        System.out.println(actualTitleE.contains(expectedTitle) ? "Title test PASS" : "Title test FAİLED");

        //6. Tekrar “facebook” sayfasina donun

        driver.navigate().back();

        //7. Sayfayi yenileyin

        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin

        driver.manage().window().maximize();


        //9.Browser’i kapatin

        driver.quit();




    }
}
