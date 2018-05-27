import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class SignUp extends SeMethods{
	@Test
	public void run() {
		startApp("chrome", "https://www.paypal.com/in/home");
		WebElement signUp = locateElement("signup-button");
		click(signUp);
		//		WebElement radio = locateElement("radio-personal");
		//		boolean a = verifySelected(radio);
		//		if(!a)
		//		{
		//			System.out.println(" selected");
		//			click(radio);
		//		}
		WebElement nextButton = locateElement("linkText","Next");
		click(nextButton);

		WebElement country = locateElement("country");
		Select dd=new Select(country);
		dd.selectByVisibleText("Belgium");
		
		
		WebElement email = locateElement("email");
		type(email,"rohini.viragani@gmail.com");
		
		WebElement pwd = locateElement("password");
		type(pwd,"Test123");
		
		WebElement confpwd = locateElement("confirmPassword");
		type(confpwd,"Test123");
		
		WebElement conbutton = locateElement("_eventId_personal");
		click(conbutton);
		
		
		
		

	}


}
