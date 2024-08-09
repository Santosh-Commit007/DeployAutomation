package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstalledAppusingApppreset_12 {
	private static String window = "W-11-21H2-ENG";

	@Test(description = "Verify InstalledAppusingApppreset.")
	public void InstalledAppusingApppreset() throws InterruptedException {
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
		System.out.println("(//div[@id='dvPendingApplicationsGrid']//table)[4]//tr//td//span[text()='" + window + "']");

		driver.findElement(
				By.xpath("(//div[@id='dvPendingApplicationsGrid']//table)[4]//tr//td//span[text()='" + window + "']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='INSTALL APP PRESETS']")).click();
		Thread.sleep(5000);
				// driver.findElement(By.xpath("//a[@class='dropdown-item
		// open-app-presets-popup-link']")).click();
		driver.findElement(By.xpath("//a[@onclick='openAppPresetPopup();']")).click();
		driver.findElement(By.xpath("\r\n" + "driver.findElement(By.xpath(\"//input[@id='txtAppPresetName']\"))"))
				.sendKeys("Test");
		driver.findElement(By.xpath("\r\n" + "driver.findElement(By.xpath(\"//input[@id='txtAppPresetName']\"))"))
				.click();
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"//button[@id='btnSaveAppPresets']\"))")).click();
		driver.quit();
	}

}
