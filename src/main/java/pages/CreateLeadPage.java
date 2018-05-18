package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement eleFirstName;
	

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	WebElement eleEmailId;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	WebElement eleCreateLead;
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	WebElement elePhoneNo;
		
	
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
		
		public CreateLeadPage enterFirstName(String data) {
			type(eleFirstName,data);
			return this;			
		}
		public CreateLeadPage enterLastName(String data) {
			type(eleLastName,data);
			return this;			
		}
		
		public CreateLeadPage enterEmailId(String data) {
			type(eleEmailId,data);
			return this;
		}
		public CreateLeadPage enterPhoneNo(String data) {
			type(elePhoneNo,data);
			return this;
		}		
		
		public void clickSubmit() {
			click(eleCreateLead);
									
		}
		
	}

	

