package seleniumtests;

import org.openqa.selenium.By;

public class LocatingAllElements extends BaseClass{

    public void SelectCalType(String typeCal){
        driver.findElement(By.partialLinkText(typeCal)).click();
    }

    public void EnterfirstValue(String value){
        driver.findElement(By.id("firstValue")).clear();
        driver.findElement(By.id("firstValue")).sendKeys(value);
    }

    public void EnterSecondValue(String value){
        driver.findElement(By.name("secondValue")).clear();
        driver.findElement(By.name("secondValue")).sendKeys(value);
    }

    public void ClickSubmit(){
        //to click on add button
        driver.findElement(By.xpath("/html/body/div[2]/form/p/input")).click();
    }

    public void Campuslink(){
        driver.findElement(By.xpath("/html/body/div[3]/p/a")).click();
    }
}
