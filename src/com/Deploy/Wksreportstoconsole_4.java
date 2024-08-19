package com.Deploy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
// Make sure after installation wks reports to all deploy pages as expected with correct group and policy.

public class Wksreportstoconsole_4 {

	// public static String window = "WIN-10-64-21H2-";
		private static String window = "W-11-21H2-ENG";
@Test
	public  void main() throws InterruptedException {
		commonobject_2 obj = new commonobject_2();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(obj.loginUrl);
		driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys(obj.username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(obj.password);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Applications']")).click();
		driver.findElement(By.xpath("//img[@id='appSearchImg']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='dropdown-menu customDDMenu show']//a[text()='All']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes((long) (5))); // Waiting for a maximum of 10
																						// seconds
		String condition1 = "//div[@class='dx-scrollable-wrapper']//span[text()='"+window+"']";
		// String condition1 =
		// "(//div[@id='dvPendingApplicationsGrid']//table)[4]//tr//td//span[text()='" +
		// window + "']"; // Application
		// page
		
		System.out.println(condition1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(condition1)));

		if (driver.findElements(By.xpath(condition1)).size() > 0) {
			System.out.println("Condition 1 met");
			System.out.println("computer added");
			
		WebElement policy=driver.findElement(By.xpath("//div[@id='dvPendingUpdateList']//td[@aria-label='Column Policy']"));
		String index=policy.getAttribute("aria-colindex");
		
		WebElement policy2=driver.findElement(By.xpath("//div[@class='dx-scrollable-wrapper']//tr[td//span[text()='"+window+"']]//td["+index+"]"));
        String policyname=policy2.getText();
            System.out.println(policyname);
        WebElement group=driver.findElement(By.xpath("//div[@id='dvPendingUpdateList']//td[@aria-label='Column Group']"));
        String index1=group.getAttribute("aria-colindex");
        
        WebElement group2=driver.findElement(By.xpath("//div[@class='dx-scrollable-wrapper']//tr[td//span[text()='"+window+"']]//td["+index1+"]"));
        String groupname=group2.getText();
            System.out.println(groupname);
        
            
            
		} else {
			System.out.println("computer not added");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-md-12 customTabContainer']//li/a[text()='Windows Updates']"))
				.click(); // Windows Update page

		// String condition2 =
		// "(//div[@class='dx-scrollable-wrapper']//table)[1]//tr//td//span[text()='WIN-10-64-21H2-']";
		String condition2 = "(//div[@class='dx-scrollable-wrapper']//span)[text()='"+window+"']";

		System.out.println(condition2);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(condition2)));

		if (driver.findElements(By.xpath(condition2)).size() > 0) {
			System.out.println("Condition 2 met");
			System.out.println("computer added");

		} else {
			System.out.println("computer not added");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-md-12 customTabContainer']//li/a[@id='aOSDeploymentMain']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='dvBSpopup']//button[@class='close']")).click(); // Deployment page

		// String condition3 =
		// "(//div[@class='dx-scrollable-wrapper']//table)[1]//tr//td//span[text()='WIN-10-64-21H2-']";
		String condition3 = "(//div[@class='dx-scrollable-wrapper']//span)[text()='"+window+"']";

		System.out.println(condition3);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(condition3)));

		if (driver.findElements(By.xpath(condition3)).size() > 0) {
			System.out.println("Condition 3 met");
			System.out.println("computer added");

		} else {
			System.out.println("computer not added");

		}

		Thread.sleep(5000);
		// driver.findElement(By.xpath("//div[@id='dvFDMainMenuParent']//li/a[@class='nav-link
		// active']")).click(); // Inventory
		// page
		driver.findElement(By.xpath("//div[@id='dvFDMainMenuParent']//li/a[@data-target='#dvFDInvertory']")).click(); // Inventory
																														// page
		// String condition4 =
		// "(//div[@class='dx-scrollable-wrapper']//table)[1]//tr//td//span[text()='WIN-10-64-21H2-']";
		String condition4 = "(//div[@class='dx-scrollable-wrapper']//span)[text()='"+window+"']";

		System.out.println(condition4);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(condition4)));

		if (driver.findElements(By.xpath(condition4)).size() > 0) {
			System.out.println("Condition 4 met");
			System.out.println("computer added");
			

		} else {
			System.out.println("computer not added");
		}
		
	}
}
