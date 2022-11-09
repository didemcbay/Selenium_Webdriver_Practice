package Lesson5_SeleniumPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c1_driverfindelement {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4-Sayfayi “refresh” yapin
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        //6- Gift Cards sekmesine basin
        //7- Birthday butonuna basin
        //8- Best Seller bolumunden ilk urunu tiklayin
        //9- Gift card details’den 25 $’i  secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //10-Sayfayi kapatin


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().refresh();

        String actualTitle=driver.getTitle();
        String titleAranan="Spend less";

        if (actualTitle.contains(titleAranan)) {
            System.out.println("Title test PASS");
        } else {
            System.out.println("Title test FAİLED \nActual Title: " + actualTitle);
        }


        //6- Gift Cards sekmesine basin

        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();

        //7- Birthday butonuna basin

        driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']")).click();

        //8- Best Seller bolumunden ilk urunu tiklayin

        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();

        //9- Gift card details’den 25 $’i  secin

        driver.findElement(By.xpath("//button[@value='25.00']")).click();


        //10-Urun ucretinin 25$ oldugunu test edin

        WebElement fiyatElementi=driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        String expectedValue="$25.00";
        String actualValue=fiyatElementi.getText();

        System.out.println(expectedValue.equals(actualValue) ? "Passed" : "Failed" );

        //10-Sayfayi kapatin

        driver.close();






    }
}
