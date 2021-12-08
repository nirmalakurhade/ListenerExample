package com.selListener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class ListenerEx implements WebDriverEventListener{

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("user navigated to new URl :"+url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("user navigated to backward ");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("user navigated to backword ");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("user navigated to forward ");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		
		System.out.println("user navigated to forward ");
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		
		System.out.println("user refreshing window");
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("user finding an element");
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("found an element");
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("user clicked on element");
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		
		System.out.println("exception occured as"+throwable.getMessage());
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		
		
	}
	

}
