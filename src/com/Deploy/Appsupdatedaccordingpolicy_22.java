package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Appsupdatedaccordingpolicy_22 {
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
		//Select Manual policy
		driver.findElement(By.xpath("(//span[text()='Manual'])[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='btn btn-light btnWhite installAppButton']")).click();
		//Thread.sleep(5000);

}
}
