package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Appsupdatedonschedule_21 {
	private static String window = "W-11-21H2-ENG";

	@Test(description = "Verify Appsupdatedonschedule_policy")
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
		//Click on policy page
		driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Policies']")).click();
		Thread.sleep(5000);
	//	driver.navigate().refresh();
		driver.findElement(By.xpath("//span[@title='Scheduled']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-light btnWhite installAppButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='scheduleTime']//div[@class='dx-dropdowneditor-icon']")).click();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[text()='11:00 AM']"))).build().perform();
		driver.findElement(By.xpath("//div[text()='11:00 AM']")).click();
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

	}
}