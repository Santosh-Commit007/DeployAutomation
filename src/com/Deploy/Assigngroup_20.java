package com.Deploy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assigngroup_20 {
	
	
		private static String window = "W-11-21H2-ENG";
		
		@Test(description = "Verify Assigngroup_20")
		public void Assigngroup() throws InterruptedException {
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
			a.moveToElement(driver.findElement(By.xpath("//div[@class='dx-dropdowneditor-input-wrapper']//input[@role='combobox']"))).click().build().perform();
			Thread.sleep(5000); //Select assign group option
			driver.findElement(By.xpath("//input[@id='txtNewGroupName']")).sendKeys("Santest");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@onclick='AddGroup(this)']")).click();
			Thread.sleep(5000);
			driver.navigate().refresh();
			driver.findElement(
					By.xpath("(//div[@id='dvPendingApplicationsGrid']//table)[4]//tr//td//span[text()='" + window + "']"))
					.click();
			Thread.sleep(5000);
			a.moveToElement(driver.findElement(By.xpath("//div[@class='dx-dropdowneditor-input-wrapper']//input[@role='combobox']"))).click().build().perform();
			Thread.sleep(5000);
			
			Actions a1 = new Actions(driver);
			a1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Santest')]"))).click().build().perform();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='groupFAIcon']//i[@class='fa fa-check approvePatchButtonIco blue']")).click();
			
			driver.quit();
	}
	}



