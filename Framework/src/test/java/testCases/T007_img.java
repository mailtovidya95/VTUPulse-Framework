package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.clickheretodownload;
import PageObject.mainbar;
import testBase.Click_here_to_download;
import testBase.basetest;

public class T007_img extends basetest {
	
	@Test
	public void testimg()throws Throwable
	{
		 //driver.findElement(By.xpath("//*[@id=\"post-13617\"]/div/figure/table/tbody/tr[2]/td[2]/a/strong")).click();
		clickheretodownload hm = new clickheretodownload(driver);
        hm.img();
       // hm.setTutorial();

	        List<WebElement> countElement=driver.findElements(By.xpath("//ol[@class=\"flex-control-nav flex-control-thumbs\"]/li"));
	        int name=countElement.size();
	        for(int i=1;i<=countElement.size();i++)
	        {
	            driver.findElement(By.xpath("//ol[@class=\"flex-control-nav flex-control-thumbs\"]/li["+i+"]")).click();
	            Thread.sleep(2000);

	        }
}
}
