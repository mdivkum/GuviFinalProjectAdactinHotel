package test;

import org.testng.annotations.Test;
import pages.HomePage;

public class RegisterTest {
	@Test
	public void registerTest() {

		HomePage obj=new HomePage();
		obj.clickregister().
		enterusername("Divyakumari").
		enterpassword("Test@123").
		enterconpass("Test@123").
		enterfullname("Divyakumari M").
		enteremail("mdivkum@gmail.com").
		entercaptcha("ghjklmn").
		clickterms()
	    .clickgobacktologinpage();
		
		
		//clickRegisterButton();

	}

}
