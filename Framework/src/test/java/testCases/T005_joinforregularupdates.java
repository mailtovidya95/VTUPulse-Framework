package testCases;

import java.lang.annotation.Target;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.basetest;

 public class T005_joinforregularupdates extends basetest {
	
	  @Test
	    public void joinlink1() throws  Throwable{
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/a")).click();
	        //Thread.sleep(3000);
	        //driver.switchTo().alert().accept();

}
 }
