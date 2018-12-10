package com.ibm.Datatables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datatables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		WebElement entries = driver.findElement(By.name("example_length"));
		Select se=new Select(entries);
		se.selectByVisibleText("50");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
	    int noOfRows=rows.size();
	    System.out.println(noOfRows);
	   int total=0;
	    
	    for(int i=1;i<=noOfRows;i++)
	    {
	    	WebElement nameEle = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td"));
	    	nameEle.click();
	    	WebElement salEle = driver.findElement(By.xpath("//span[@class='dtr-data']"));
	    	String salary=salEle.getText().replace("$", "").replace(",","");
	    	//total +=Integer.parseInt(salary);
	    	nameEle.click();
	    	System.out.println(salary);
//	    	if(total>200000)
//	    	{
//	    	salEle.getText();
//	    	}
	    }
	    
	}
	
}
