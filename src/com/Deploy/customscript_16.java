package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class customscript_16 {
	private static String window = "W-11-21H2-ENG";
	@Test(description = "Verify customscript")
	public void customscript() throws InterruptedException {
		commonobject_2 obj = new commonobject_2();
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get(obj.loginUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtLoginEmail']")).sendKeys(obj.username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(obj.password);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='CUSTOM SCRIPT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create Custom Script']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtCustScriptAppName']")).sendKeys("BatchFile");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUrlNetworkLocation']")).sendKeys("https://faronics-qa-installer.s3-us-west-2.amazonaws.com/Scripts/CreateFolder_Bat.Bat");
		Thread.sleep(5000);
		WebElement dropdownElement =driver.findElement(By.xpath("//select[@id='ddCustScriptTypes']"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='dvCustomScriptContainer']//input[@id='btnCustScriptSaveToGrid']")).click();
		
	}
}
