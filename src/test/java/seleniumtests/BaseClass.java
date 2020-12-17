package seleniumtests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    @BeforeAll
    public static void setUp(){
    driver= new ChromeDriver();
        //driver=new FirefoxDriver();

    }
    @BeforeEach
    public void init(){
        driver.get("http://localhost:8080/add");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterAll
    public  static void teardown(){
        driver.quit();

    }
}
