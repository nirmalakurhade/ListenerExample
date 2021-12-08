package com.selListener;

import java.util.EventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ListenerTest {
     WebDriver driver; 
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		EventFiringWebDriver efd = new EventFiringWebDriver(driver);
        ListenerEx listEx = new ListenerEx();
		efd.register(listEx);
		driver=efd;
	}
	@Test 
	public void test01() throws Exception {
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.navigate().refresh();
		
		driver.navigate().to("https://javabykiran.com/playground/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().to("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("kiran@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123456");
		
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | DashBoard1");
	}
}
