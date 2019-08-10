package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods{
	public Login() {
		
	}
	
	public void enterUsername(String username) {
		WebElement ele = locateElement("id", "username");
		clearAndType(ele, username);
		switchToWindow(2);
	}

}
