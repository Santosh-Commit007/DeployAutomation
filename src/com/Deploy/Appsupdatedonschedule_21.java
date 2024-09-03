package com.Deploy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//div[text()='11:00 AM']"))).click().build().perform();
		//driver.findElement(By.xpath("//div[text()='11:00 AM']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@onclick='savePolicy()']")).click();	
		//Switch to Application page
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-target='dvFDApplication']")).click();
		
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
		Actions a1 = new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//div[@id='dvSearchPolicy']//input[@role='combobox']"))).click().build().perform();
		Thread.sleep(5000); //Select assign policy option
		driver.findElement(By.xpath("//div[text()='Scheduled']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='policyFAIcon']//i[@class='fa fa-check approvePatchButtonIco blue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='btnConfirmCommonYes']")).click();
		


	
		WebElement policy=driver.findElement(By.xpath("(//tr//td[@aria-label='Column Policy'])[1]"));
		String policyid=policy.getAttribute("aria-colindex");
		System.out.println(policyid);
		String exp="//tr[td[text()='Scheduled']and td//span[text()='"+window+"']]/td["+policyid+"]";
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes((long) (5))); // Waiting for a maximum of 10
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(exp)));

		if (driver.findElements(By.xpath(exp)).size() > 0) 
		{
				System.out.println("Scheduled policy assigned");
			
		}else 
		{
			System.out.println("Scheduled policy not assigned");
		}
		
		driver.quit();
	}
}