package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleForeName;
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitButton;
	
	public EditLeadPage enterForeName(String data) {
		type(eleForeName,data);
		return this;
	}
	
	
	public ViewLeadPage clickSubmitButton() {
		click(eleSubmitButton);
		return new ViewLeadPage();
	}

}
