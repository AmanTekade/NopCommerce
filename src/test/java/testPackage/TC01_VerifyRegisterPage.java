package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomPackage.RegisterPagePomClass;

public class TC01_VerifyRegisterPage extends TestBase {
	@Test
	public void verifyRegisterPage() throws InterruptedException
	{
		RegisterPagePomClass rp=new RegisterPagePomClass(driver);
		rp.clickOnRegister();
		Thread.sleep(3000);
		System.out.println("Click On Register Link");
		rp.clickOnGender();
		System.out.println("Gender is Selected");
		Thread.sleep(2000);
		rp.clickOnFirstName();
		System.out.println("First Name Enered");
		Thread.sleep(2000);
		rp.clickOnLastName();
		System.out.println("Last Name Entred");
		Thread.sleep(2000);
		rp.selectDay();
		System.out.println("Day Entred");
		Thread.sleep(2000);
		rp.selectMonth();
		System.out.println("Month Entred");
		Thread.sleep(2000);
		rp.selectYear();
		System.out.println("Year Entred");
		Thread.sleep(2000);
		rp.enterEmail();
		System.out.println("Email Entred");
		Thread.sleep(2000);
		rp.enterPassword();
		System.out.println("Password Entred");
		Thread.sleep(2000);
		rp.enterConPassword();
		System.out.println("Confirm Password Entred");
		Thread.sleep(2000);
		rp.registerButton();
		System.out.println("Click on  Register Button");
		String actual=rp.verifySucessText();
		String expected="Your registration completed";
		Assert.assertEquals(actual, expected, expected);
		
      


	}


}
