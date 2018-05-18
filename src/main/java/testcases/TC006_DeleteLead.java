package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DeleteLead";
		testDescription="Delete a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Bhuvi";
		browserName="chrome";
		dataSheetName="TC006_DeleteLead";
		
	}	
	
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String PhNo,String LeadId) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhonetab()
		.enterPhone(PhNo)
		.clickFindLeadbutton()
		.getLeadId()
		.clickLeadName()
		.clickDelete()
		.clickFindLead()
		.enterLeadId(LeadId);
		
		
		
		
		
	}
}
