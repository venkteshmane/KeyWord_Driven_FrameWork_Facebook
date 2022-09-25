package com.qa.facebook.tests;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.qa.facebook.keyword.engine.KeyWordEngine;

public class LoginTest {
	public KeyWordEngine keyWordEngine;
	
	@Test(priority=1)
	public void loginTest() throws InvalidFormatException {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Login");
	}
	
	@Test (priority=2)
	public void signUpTest() throws InvalidFormatException {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("SignUp");
	}
}
