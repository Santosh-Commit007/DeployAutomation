package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applogin {

	
	public static void main(String[] args) {
		commonobject obj = new commonobject();
		// Initialize the WebDriver
				WebDriver driver = new ChromeDriver();
				driver.get(obj.loginUrl);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys(obj.username);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(obj.password);
				driver.findElement(By.xpath("//input[@value='Sign in']")).click();
				
				
		
	}
}
