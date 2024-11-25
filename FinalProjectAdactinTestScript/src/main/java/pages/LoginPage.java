package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class LoginPage extends TestBase {
	
	//locators
		@FindBy ( id = "username")
		WebElement username;
		
		@FindBy ( id = "password")
		WebElement password;
		
		@FindBy ( id = "login")
		WebElement login;
		
		//initializing the page objects
			public LoginPage()
			{
				PageFactory.initElements(driver, this);
				
			}
			
	//actions		
		public BookingPage login(String un , String pwd) {
			    username.sendKeys(un);
				password.sendKeys(pwd);
				login.click();
				return new BookingPage();
		
			}
			
		
}
