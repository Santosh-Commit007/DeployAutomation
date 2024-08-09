package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Applogin_1 {

	@Test (description="Verify signup and login works as expected.")
	
	public  void Login() {
		commonobject_2 obj = new commonobject_2();
		// Initialize the WebDriver
				WebDriver driver = new ChromeDriver();
				driver.get(obj.loginUrl);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys(obj.username);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(obj.password);
				driver.findElement(By.xpath("//input[@value='Sign in']")).click();
				
				
		
	}
}
