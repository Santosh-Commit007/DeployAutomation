package com.Deploy;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Temp {
		private static String window = "W-11-21H2-ENG";
		private String App ="Google Chrome";
		@Test(description = "Verify AppsupdatedusingUpdatebutton on wks as expected.")
		public void Appsupdate() throws InterruptedException {
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
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[normalize-space()='Grid Options']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='col-3']//div[@class='d-inline-block custom-switch checbox-switch switch-primary']//span")).click();
			//GoogleChrome
			WebElement application=driver.findElement(By.xpath("(//tr//td[@aria-label='Column "+App+"'])[1]"));
			String id=application.getAttribute("aria-colindex");
			System.out.println(id);
			//get title
			WebElement title=driver.findElement(By.xpath("//tr[td//span[text()='"+window+"']]/td["+id+"]"));
			String titlename=title.getAttribute("title");
			System.out.println(titlename);
			if(titlename.equalsIgnoreCase("Outdated")) {
				driver.findElement(By.xpath("//tr[td//span[text()='"+window+"']]/td["+id+"]")).click();
				Thread.sleep(5000);
				
			}
			else {
				System.out.println("Application is updated");
			}
		}
	}


