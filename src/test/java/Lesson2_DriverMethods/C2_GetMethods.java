package Lesson2_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_GetMethods {

    //3. Amazon sayfasina gidelim. https://www.amazon.com/
    //4. Sayfa basligini(title) yazdirin
    //5. Sayfa basliginin “Amazon” icerdigini test edin
    //6. Sayfa adresini(url) yazdirin
    //7. Sayfa url’inin “amazon” icerdigini test edin.
    //8. Sayfa handle degerini yazdirin
    //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
    //10. Sayfayi kapatin.
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com/");
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String arananKelime ="Amazon";  // expected result
        // expected result == actual
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title test PASS");
        } else {
            System.out.println("Title test FAİLED");
            System.out.println("Sayfanın Title'i : " + actualTitle);
        }
        System.out.println(driver.getCurrentUrl());
        String actuallUrl= driver.getCurrentUrl();
        String urlArananKelime="amazon";
        if (actuallUrl.contains(urlArananKelime)) {
            System.out.println("Url test PASS");
        } else {
            System.out.println("Url test FAİLED");
            System.out.println("Actuall url: " + actuallUrl);
        }
        System.out.println(driver.getWindowHandle());
        String actualPageSource=driver.getPageSource();
        String pageArananKelime="alisveris";

        if (actualPageSource.contains(pageArananKelime)) {
            System.out.println("page source test PASS");
        } else {
            System.out.println("page source test FAİLED");
            System.out.println("Actuall url: " + actualPageSource);
        }
        driver.close();






}


}
