package Lesson5_SeleniumPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_questiontitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        /*   Question1
        1.https://www.youtube.com sayfasına gidin
        2.Title i consolda yazdirin
        3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yzdirin”
        4.Sayfayi kapatin
        5.Tum sayfalari kapatin
        6.Consola “Test completed” yazdirin   */
// 1.
        driver.get("https://www.youtube.com");
        //2.
        System.out.println(driver.getTitle());

        //3.

        String actuelTitle=driver.getTitle();
        String exceptedResult="YouTube";
        if (actuelTitle.equals(exceptedResult)) {
            System.out.println("correct title");
        } else {
            System.out.println("incorrect title");
        }

        //4.

        driver.close();

        // 5.

        driver.quit();

        // 6.

        System.out.println("Test Completed");

    }
}
