package Lesson3_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C2_LoginTest {

    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 1. Bir class oluşturun: LoginTest
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");
        //    b. Sign in butonuna basin

        WebElement signInLinki=driver.findElement(By.id("sign-in")); // Sadece locate edip bir variable'a assign ettik.
        signInLinki.click();

        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz.

        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signInButonu=driver.findElement(By.name("commit"));

        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");

        // Thread.sleep(3000);
        signInButonu.click();

        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement girisYazisiElementi=driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());
        String actualGirisYazisi= girisYazisiElementi.getText();
        String expectedGirisYazisi="Welcome to Address Book";

        if (actualGirisYazisi.equals(expectedGirisYazisi)){
            System.out.println("Sayfaya giris testi PASS");
        }else{
            System.out.println("sayfaya giris testi FAILED");
        }


        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressWebElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));

        System.out.println(adressWebElementi.isDisplayed());

        if (adressWebElementi.isDisplayed()) {
            System.out.println("Adress elementi görüntüleme testi PASS");
        } else {
            System.out.println("Adress elementi görüntüleme testi FAİLED");
        }


        if (signOutElementi.isDisplayed()) {
            System.out.println("Sign out elementi görüntüleme testi PASS");
        } else {
            System.out.println("Sign out elementi görüntüleme testi FAİLED");
        }


        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));

        System.out.println("Sayfada " + linklerListesi.size() + " tane link vardır.");


    }
}

