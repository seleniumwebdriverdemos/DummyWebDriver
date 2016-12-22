package com.openq.selenium;

public interface WebDriver {

	public void get(String url);
	public void Click(String Locator);
	public void sendKeys(String Locator);
	public void captureScreenshot();
	public void getText(String locator);
	
}
