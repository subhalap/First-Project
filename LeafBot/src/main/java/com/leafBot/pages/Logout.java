package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Logout extends ProjectSpecificMethods{
	
	public Logout() {
		
	}
	
	public void clickLogoutButton(String logout) {
		WebElement ele = locateElement("id", "logout");
		ele.click();
	}

}
