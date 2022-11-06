package Lesson2_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle()); // sayfanın titleini getirir.
        System.out.println(driver.getCurrentUrl()); // gittigi url yi string olarak getirdi.
        System.out.println(driver.getWindowHandle()); // CDwindow-7A12F2F1DDA67B9F3AE4AC302EBF5107
// Her objeye ayrı bir numara getiriyor.
        System.out.println(driver.getPageSource()); // sayfanın kaynagını getirir.

    }

}
