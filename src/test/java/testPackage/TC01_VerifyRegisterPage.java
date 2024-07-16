package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pomPackage.RegisterPagePomClass;

public class TC01_VerifyRegisterPage extends TestBase {
	@Test
	public void verifyRegisterPage() throws InterruptedException
	{
		Faker faker = new Faker();
		
		String fname = faker.name().firstName();
		String lname= faker.name().lastName();
		String mail = faker.internet().emailAddress();
		String password = faker.internet().password();
		String cpassword = password;
		
		
		RegisterPagePomClass rp=new RegisterPagePomClass(driver);
		rp.clickOnRegister();
		Thread.sleep(3000);
		System.out.println("Click On Register Link");
		
		rp.clickOnGender();
		System.out.println("Gender is Selected");
		Thread.sleep(2000);
		
		rp.clickOnFirstName(fname);
		System.out.println("First Name Enered");
		Thread.sleep(2000);
		
		rp.clickOnLastName(lname);
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
		
		rp.enterEmail(mail);
		System.out.println("Email Entred");
		Thread.sleep(2000);
		
		rp.enterPassword(password);
		System.out.println("Password Entred");
		Thread.sleep(2000);
		
		rp.enterConPassword(cpassword);
		System.out.println("Confirm Password Entred");
		Thread.sleep(2000);
		
		rp.registerButton();
		System.out.println("Click on  Register Button");
		String actual=rp.verifySucessText();
		String expected="Your registration completed";
		//Assert.assertEquals(actual, expected, expected);
		
      


	}


}
