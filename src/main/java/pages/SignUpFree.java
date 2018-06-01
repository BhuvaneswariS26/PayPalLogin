package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpFree extends ProjectMethods{

	public SignUpFree() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="country")
	private WebElement countryName;
	
	@FindBy(how=How.ID,using="email")
	private WebElement emailId;
	
	@FindBy(how=How.ID,using="password")
	private WebElement password;
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement continuebutton;
	
	
	public SignUpFree selectCountryName(String data)
	{
		selectDropDownUsingText(countryName,data);
		return this;
	}
	public SignUpFree enterEmailId(String data)
	{
		type(emailId,data);
		return this;
	}
	public SignUpFree enterPassword(String data)
	{
		type(password,data);
		return this;
	}
	public SignUpFree enterconfirmPassword(String data)
	{
		type(confirmPassword,data);
		return this;
	}
	
	public Captcha clickConitueBtn()
	{
		click(continuebutton);
		return new Captcha();
	}
	

}
