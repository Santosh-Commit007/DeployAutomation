package com.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class customscript_16 {
	private static String window = "W-11-21H2-ENG";
	private String Batch ="Batch";
	private String Power ="Power";
	private String VB ="VB";
	

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
		
		driver.findElement(By.xpath("//input[@id='txtCustScriptAppName']")).sendKeys(Batch);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUrlNetworkLocation']")).sendKeys("https://faronics-qa-installer.s3-us-west-2.amazonaws.com/Scripts/CreateFolder_Bat.Bat");
		Thread.sleep(5000);
		WebElement dropdownElement =driver.findElement(By.xpath("//select[@id='ddCustScriptTypes']"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='dvCustomScriptContainer']//input[@id='btnCustScriptSaveToGrid']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='CUSTOM SCRIPT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create Custom Script']")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//input[@id='txtCustScriptAppName']")).sendKeys(Power);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUrlNetworkLocation']")).sendKeys("https://faronics-qa-installer.s3-us-west-2.amazonaws.com/Scripts/CreateFolder_PS.ps1");
		Thread.sleep(5000);
		WebElement dropdownElement1 =driver.findElement(By.xpath("//select[@id='ddCustScriptTypes']"));
		Select dropdown1 = new Select(dropdownElement1);
		dropdown1.selectByIndex(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='dvCustomScriptContainer']//input[@id='btnCustScriptSaveToGrid']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='CUSTOM SCRIPT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create Custom Script']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='txtCustScriptAppName']")).sendKeys(VB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUrlNetworkLocation']")).sendKeys("https://faronics-qa-installer.s3-us-west-2.amazonaws.com/Scripts/CreateFolder_VB.vbs");
		Thread.sleep(5000);
		WebElement dropdownElement2 =driver.findElement(By.xpath("//select[@id='ddCustScriptTypes']"));
		Select dropdown2 = new Select(dropdownElement2);
		dropdown2.selectByIndex(1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='dvCustomScriptContainer']//input[@id='btnCustScriptSaveToGrid']")).click();
	
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("(//tr//td[@aria-label='Column Custom Scripts'])[1]")).click();
		Thread.sleep(5000);
		//Batch
		WebElement batchscript=driver.findElement(By.xpath("(//tr//td[@aria-label='Column "+Batch+"'])[1]"));
		String batchid=batchscript.getAttribute("aria-colindex");
		System.out.println(batchid);
		driver.findElement(By.xpath("//tr[td//span[text()='"+window+"']]/td["+batchid+"]")).click();
		Thread.sleep(5000);
		
		//power
		WebElement powerscript=driver.findElement(By.xpath("(//tr//td[@aria-label='Column "+Power+"'])[1]"));
		String powerid=powerscript.getAttribute("aria-colindex");
		System.out.println(powerid);
		driver.findElement(By.xpath("//tr[td//span[text()='"+window+"']]/td["+powerid+"]")).click();
		Thread.sleep(5000);
		
			//VB
				WebElement VB1=driver.findElement(By.xpath("(//tr//td[@aria-label='Column "+VB+"'])[1]"));
				String VBid=VB1.getAttribute("aria-colindex");
				System.out.println(VBid);
				driver.findElement(By.xpath("//tr[td//span[text()='"+window+"']]/td["+VBid+"]")).click();
				Thread.sleep(5000);
	
		driver.findElement(By.xpath("//button[@id='btnRunCustomScript']")).click();//run script
		driver.findElement(By.xpath("//input[@id='btnConfirmCommonYes']")).click();
	
	}
}
