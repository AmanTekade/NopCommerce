package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomPackage.LoginPagePOM;

public class TC02_VerifyLoginPage extends TestBase
{
	@Test
	public void verifyLoginPage() throws InterruptedException
	{
		LoginPagePOM lg= new LoginPagePOM(driver);
		lg.clickOnLink();
		System.out.println("Click On Login Link");
		Thread.sleep(2000);


		lg.enterEmail("chetantayade15@gmail.com");
		System.out.println("Email Entered");
		Thread.sleep(2000);


		lg.enterPassword("123456");
		System.out.println("PassWord Entered");
		Thread.sleep(2000);

		lg.clickOnRememberMe();
		System.out.println("ClickOnRememberMeBtn");
		Thread.sleep(2000);


		lg.clickOnLoginBtn();
		System.out.println("ClickBtn");
		Thread.sleep(2000);
		
		System.out.println("verifyingloginfunctionality");
		
		String actual=driver.getTitle();
		Assert.assertEquals(actual, "nopCommerce demo store", actual);
	}
}
