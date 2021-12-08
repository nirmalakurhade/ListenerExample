package com.jbk;

import java.util.concurrent.PriorityBlockingQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver = null;
	@Test(groups= "Login")
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	}
		@Test(groups= "Login")
		public void Logindata() {
		WebElement email = driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
		
}
	@Test(groups = " Dash")
	public void Dashboard() {
		System.out.println("Dash");
	}

	@Test(groups = " Dash")
	public void Users() {
		System.out.println("User");
	}

}
