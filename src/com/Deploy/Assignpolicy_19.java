package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignpolicy_19 {
	private static String window = "W-11-21H2-ENG";
	
	@Test(description = "Verify Assignpolicy")
	public void Assignpolicy() throws InterruptedException {
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
		Thread.sleep(7000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@id='dvSearchPolicy']//input[@role='combobox']"))).click().build().perform();
		Thread.sleep(5000); //Select assign policy option
		driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Custom']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='policyFAIcon']//i[@class='fa fa-check approvePatchButtonIco blue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='btnConfirmCommonYes']")).click();
		
		driver.quit();
}
}
