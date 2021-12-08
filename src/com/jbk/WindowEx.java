package com.jbk;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowEx {
	WebDriver driver;

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		String mainwin = driver.getWindowHandle();
		List<WebElement> links = driver.findElements(By.partialLinkText("info"));

		for (WebElement link : links)
			link.click();
		Thread.sleep(5000);
		Set<String> allwins = driver.getWindowHandles();
		for (String window : allwins) {
			System.out.println("id or handle of window: " + window);

			driver.switchTo().window(window);
			System.out.println(" title of child window : " + driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			if (!window.equals(mainwin))
			driver.close();

		}

	}
}