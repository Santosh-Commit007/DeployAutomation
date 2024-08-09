package com.Deploy;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Fullinstaller_3 {
@Test
	public  void main() throws InterruptedException {
		commonobject_2 obj = new commonobject_2();
		 WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(obj.loginUrl);
		driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys(obj.username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(obj.password);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='downloadAgentDummyGrid']")).click();
		//For downloaded Agent verification need to check manually,Currently there is no automation scope. 
		
		driver.close();

	}
}
