package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePagePaypal;

import wdMethods.ProjectMethods;

public class TC001_Signup extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_SignUp";
		testDescription="Paypal launch";
		testNodes="signup";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test
	public void InitaiateSignup() {
		
		new HomePagePaypal()
		.clickSignUp()
		.clickContinueButton();
		
		
	}

}
