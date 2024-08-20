package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		Thread.sleep(7000);
		String tag="Test";
		Actions	a=new Actions(driver);
		
		
		
		a.moveToElement(driver.findElement(By.xpath("//div[@data-dx_placeholder='Type a tag to apply']"))).click().sendKeys(tag).build().perform();
		//driver.findElement(By.xpath("//div[@data-dx_placeholder='Type a tag to apply']")).click();
				
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@data-dx_placeholder='Type a tag to apply']"))
			//	.sendKeys("Test");
		//driver.findElement(By.xpath("//span[normalize-space()='Test']")).click();
		driver.findElement(By.xpath("//div[text()='"+tag+"']")).click();

		driver.quit();
	}

}
