import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

    private static final WebDriver driver = new ChromeDriver();



    @BeforeMethod
    public static void driver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


    }

    @Test(testName = "The Latest News author and image verify")
    public static void latest1() {
        driver.get(BaseUrl.BASE_URL);
        WebForm webForm = new WebForm(driver);
        org.testng.Assert.assertEquals(webForm.getArticle(), webForm.getAuthor());
        org.testng.Assert.assertEquals(webForm.getArticle(), webForm.getPicture());
    }

    @Test(testName = "The Latest News browser and links verify")
    public static void latest2() {
        driver.get(BaseUrl.BASE_URL);
        WebForm webForm = new WebForm(driver);
        org.testng.Assert.assertEquals(webForm.linkVerify(), 0);
    }

    @AfterTest
    public static void clean() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
    }

