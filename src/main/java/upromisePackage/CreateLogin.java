package upromisePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLogin extends ProjectMethods {

	public CreateLogin() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement eleYourEmail;
	
	public CreateLogin enterEmailId(String data) {
		type(eleYourEmail, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	
	public CreateLogin enterPassword(String data) {
		type(elePassword, data);
		return this;
			}
	
	@FindBy(how=How.ID,using="challenge")
	private WebElement eleChallengeqn;
	
	public CreateLogin selectChallengeqn(String data) {
		selectDropDownUsingText(eleChallengeqn, data);
		return this;
			}
	@FindBy(how=How.ID,using="challengeResponse")
	private WebElement elechallengeResponse;
	
	public CreateLogin enterSecurityAnswer(String data) {
		type(elechallengeResponse, data);
		return this;
			}
	
	@FindBy(how=How.ID,using="firstName")
			private WebElement eleFName;
			
			public CreateLogin enterFName(String data) {
				type(eleFName, data);
				return this;
					}
			
			@FindBy(how=How.ID,using="lastName")
			private WebElement eleLName;
			
			public CreateLogin enterLName(String data) {
				type(eleLName, data);
				return this;
					}
			@FindBy(how=How.ID,using="dateOfBirth")
			private WebElement eleDOB;
			
			public CreateLogin enterDOB(String data) {
				type(eleDOB, data);
				return this;
					}
			@FindBy(how=How.ID,using="addressLine1")
			private WebElement eleAddressLine1;
			
			public CreateLogin enterAddressLine1(String data) {
				type(eleAddressLine1, data);
				return this;
					}
			@FindBy(how=How.ID,using="zip")
			private WebElement eleZip;
			
			public CreateLogin enterZip(String data) {
				type(eleZip, data);
				return this;
					}
			@FindBy(how=How.ID,using="city")
			private WebElement eleCity;
			
			public CreateLogin enterCity(String data) {
				type(eleCity, data);
				return this;
					}
			@FindBy(how=How.ID,using="state")
			private WebElement eleState;
			
			public CreateLogin selectState(String data) {
				selectDropDownUsingText(eleState, data);
				return this;
					}
}
