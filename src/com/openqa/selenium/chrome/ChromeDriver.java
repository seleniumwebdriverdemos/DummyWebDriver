package com.openqa.selenium.chrome;

import com.openq.selenium.WebDriver;

public class ChromeDriver implements WebDriver{

	public ChromeDriver(){
		System.out.println("Launching Chrome Browser");
	}
	
	
	public void getTitle(){
		System.out.println("Getting title from the webpage in Chrome");
	}
	
	public void get(String URL){
		System.out.println("Navigating to URL in ChromeDriver");
	}
	
	public void Click(String Locator){
		System.out.println("Clicking on an Element in Chrome");
	}
	
	public void sendKeys(String locator){
		System.out.println("Typing in an Element in Chrome");
	}
	
	public void captureScreenshot(){
		System.out.println("captureScreenshot on Chrome");
	}


	@Override
	public void getText(String locator) {
		System.out.println("getText from Chrome");
	}
}
