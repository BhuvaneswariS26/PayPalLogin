package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePagePaypal extends ProjectMethods{
	public HomePagePaypal()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement signupButton;
	
	public SignUpPage clickSignUp()
	{
		click(signupButton);
		return new SignUpPage();
	}
	
	
	
	
	
	
	

}
