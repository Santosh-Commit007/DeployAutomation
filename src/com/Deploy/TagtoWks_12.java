package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagtoWks_12 {
	private static String window = "W-11-21H2-ENG";

	@Test(description = "Verify Tag to wks as expected.")
	public void TagtoWks() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='dx-texteditor-input-container dx-tag-container dx-native-click']"))
				.sendKeys("Test");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='dx-texteditor-input-container dx-tag-container dx-native-click']"))
				.sendKeys("Test");
		driver.findElement(By.xpath("//span[normalize-space()='Test']")).click();

		driver.quit();
	}

}
