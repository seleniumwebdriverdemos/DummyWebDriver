package com.openqa.selenium.ie;

import com.openq.selenium.WebDriver;

public class InternetExplorerDriver implements WebDriver{

	public InternetExplorerDriver(){
		System.out.println("Launchin IE Browser");
	}
	
	
	public void getTitle(){
		System.out.println("Getting title from the webpage in IE");
	}
	
	public void get(String URL){
		System.out.println("Navigating to URL in InternetExplorer");
	}
	
	public void Click(String Locator){
		System.out.println("Clicking on an Element in IE");
	}
	
	public void sendKeys(String locator){
		System.out.println("Typing in an Element in IE");
	}
	
	public void captureScreenshot(){
		System.out.println("captureScreenshot on IE");
	}


	@Override
	public void getText(String locator) {
		System.out.println("getText from IE");
	}
	
}
