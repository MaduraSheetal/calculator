package seleniumtests;

import com.cicd.calculator.CalculatorApplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    protected static ConfigurableApplicationContext context;

    @BeforeAll
    public static void setUp(){
        context=SpringApplication.run(CalculatorApplication.class);
        System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
    driver= new ChromeDriver();
        driver.get("http://localhost:8010/add");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver=new FirefoxDriver();

    }
    //@BeforeEach
    //public void init(){
      //  driver.get("http://localhost:8010/add");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterAll
    public  static void teardown(){
        driver.quit();

    }
}
