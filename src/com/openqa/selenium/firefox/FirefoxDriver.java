package com.openqa.selenium.firefox;

import com.openq.selenium.WebDriver;

public class FirefoxDriver implements WebDriver{

	public FirefoxDriver(){
		System.out.println("Launchinf Firefox Browser");
	}
	public void getTitle(){
		System.out.println("Getting title from the webpage in Firefox");
	}
	
	public void get(String URL){
		System.out.println("Navigating to URL in Firefox");
	}
	
	
	public void Click(String Locator){
		System.out.println("Clicking on an Element in Firefox");
	}
	
	public void sendKeys(String locator){
		System.out.println("Typing in an Element in Firefox");
	}
	
	public void captureScreenshot(){
		System.out.println("captureScreenshot on Firefox");
	}
	@Override
	public void getText(String locator) {
		System.out.println("getText from FF");
	}
	
}
