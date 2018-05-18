package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating a New Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Bhuvi";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
	}	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String cmpName, String firstName,String lastName,String email,String PhNo) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cmpName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailId(email)
		.enterPhoneNo(PhNo)
		.clickSubmit();
		
	}
}
