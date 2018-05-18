
package uPromiseTestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import upromisePackage.SignupPage;
import wdMethods.ProjectMethods;

public class TC1_CreatingUpromiseId extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC1_CreatingUPromiseId";
		testDescription="Creation of UPromise LoginId";
		testNodes="Signup";
		category="Smoke";
		authors="Bhuvi";
		browserName="chrome";
		dataSheetName="TC1_CreateId";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String firstName,String lastName,String email,String passWord,String secQn,String secAns,String dob,String address,String zip,String city,String state ) {
		
		new SignupPage()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.clickSubmit()
		.enterPassword(passWord)
		.selectChallengeqn(secQn)
		.enterSecurityAnswer(secAns)
		.enterFName(firstName)
		.enterLName(lastName)
		.enterDOB(dob)
		.enterAddressLine1(address)
		.enterZip(zip)
		.enterCity(city)
		.selectState(state);		
	}

}
