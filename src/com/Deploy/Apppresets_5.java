package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apppresets_5 {
	private static String window = "W-11-21H2-ENG";

@Test (description="Verify signup and login works as expected.")
	
	public  void Apppreset() throws InterruptedException {
		commonobject_2 obj = new commonobject_2();
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get(obj.loginUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys(obj.username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(obj.password);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@id='appSearchImg']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='dropdown-menu customDDMenu show']//a[text()='All']")).click();
		Thread.sleep(5000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes((long)
		// (5))); // Waiting for a maximum of 10
		// seconds
		// String condition1 = "//div[@class='dx-scrollable-wrapper']//span[text()='" +
		// window + "']";
		System.out.println("(//div[@id='dvPendingApplicationsGrid']//table)[4]//tr//td//span[text()='" + window + "']");

		driver.findElement(
				By.xpath("(//div[@id='dvPendingApplicationsGrid']//table)[4]//tr//td//span[text()='" + window + "']"))
				.click();

		Thread.sleep(5000);

	driver.findElement(By.xpath("//button[@id='btnApplicationRemConnect']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='RDP']")).click();
	
	}
}
