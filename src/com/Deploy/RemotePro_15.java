package com.Deploy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RemotePro_15 {
	private static String window = "W-11-21H2-ENG";

	@Test(description = "Verify RemotePro wks as expected.")
	public void RemotePro() throws InterruptedException {
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
		driver.findElement(By.xpath("//button[@id='btnApplicationRemConnect']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='dropdown-item remoteProOption']")).click();
		String condition1 = "(//div[@id='computerFullScreenVideoView'])[1]";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes((long) (5))); // Waiting for a maximum of 10
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(condition1)));

		if (driver.findElements(By.xpath(condition1)).size() > 0) {
			System.out.println("Condition 1 met");
			System.out.println("Remote session established");
		} else {
			System.out.println("Remote session not established");
		}
		// seconds
		driver.quit();

	}

}



