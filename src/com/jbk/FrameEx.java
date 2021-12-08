package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameEx {
	WebDriver driver;

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sign-in-icon-down\"]")).click();	
		driver.findElement(By.xpath("//*[@id=\"signInLink\"]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.xpath("//*[@id=\"newFbId\"]")).click();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
}
}