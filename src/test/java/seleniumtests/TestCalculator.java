package seleniumtests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static org.junit.jupiter.api.Assertions.*;

public  class TestCalculator extends LocatingAllElements{

    @Test
    public  void TestAdd(){
        //ClickAdditiion();
      SelectCalType("Addition");

        EnterfirstValue("4");
        EnterSecondValue("3");
        ClickSubmit();
        String Expected="7";
        String Actual=driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText();
        assertEquals(Expected,Actual);

    }
    @Test
    public void TestSubtraction(){
       //ClickSubtraction();
        SelectCalType("Subtraktion");
        EnterfirstValue("8");
        EnterSecondValue("3");
        ClickSubmit();
        String Expected="5";
        String Actual=driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText();
        assertEquals(Expected,Actual);
    }
    @Test
    public void TestMultiply(){
        //ClickMultiply();
        SelectCalType("Multiplikation");
        EnterfirstValue("9");
        EnterSecondValue("2");
        ClickSubmit();
        String Expected="18";
        String Actual=driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText();
        assertEquals(Expected,Actual);
    }
    @Test
    public void TestDivide(){
        //ClickDivide();
        SelectCalType("Division");
        EnterfirstValue("6");
        EnterSecondValue("3");
        ClickSubmit();
        String Expected="2.0";
        //String Actual=driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText();
        String Actual=driver.findElement(By.cssSelector("body > div.calc-content > h3 > p")).getText();
        assertEquals(Expected,Actual);
    }
//Test to Check whether Citat is displayed onscreen
    @Test
    public void TestCitat(){
        SelectCalType("Citat");
        String Expected="Citat";
        String Actual=driver.findElement(By.xpath("/html/body/div[2]/h1")).getText();
        assertEquals(Expected,Actual);
    }

    @Test
    public void TestCampusLink(){
        Campuslink();
        String Expected="https://www.molndal.se/campus-molndal.html";
        String Actual=driver.getCurrentUrl();
        assertEquals(Expected,Actual);
    }

    @Test
    public void TestUrl(){
        String Expected="http://localhost:8010/add" ;
        String Actual= driver.getCurrentUrl();
        assertEquals(Expected,Actual);
    }

    @Test
    public void TestTittle(){
        String Expected="Calculator - ADD";
        String Actual=driver.getTitle();
        assertEquals(Expected,Actual);
    }
    //Test to Ensure error message is displayed when an invalid value is entered in Text box
    @Test
    public void TestError(){
        SelectCalType("Addition");
        EnterfirstValue("8.8");
        EnterSecondValue("9");
        ClickSubmit();
        String Expected="Fyll i ett heltal.";
        assertEquals(Expected,driver.findElement(By.tagName("span")).getText());
    }
    //Test that browser return to main page when back navigation  is clicked
    @Test
    public void TestBackLink(){
        Campuslink();
        driver.navigate().back();
        String Expected="Calculator - ADD";
        String Actual=driver.getTitle();
        assertEquals(Expected,Actual);

    }


}
