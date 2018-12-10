package com.ibm.moneycontrol;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		
		driver.findElement(By.xpath("//a[@class='link1']")).click();
		WebElement links = driver.findElement(By.tagName("a"));
		driver.getTitle();
		System.out.println(links);
		
		
		

	}

}
