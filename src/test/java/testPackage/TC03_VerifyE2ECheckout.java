package testPackage;

import org.testng.annotations.Test;

import pomPackage.CartPagePOMClass;
import pomPackage.CheckoutPagePOMClass;
import pomPackage.HomePagePOMClass;
import pomPackage.LoginPagePOM;

public class TC03_VerifyE2ECheckout extends TestBase
{

	@Test
	public void verifyE2ECheckout() throws InterruptedException
	{
		LoginPagePOM lp = new LoginPagePOM(driver);
		lp.clickOnLink();
		System.out.println("Click On Login Link");
		Thread.sleep(2000);


		lp.enterEmail("vivekshimpi09@gmail.com");
		System.out.println("Email Entered");
		Thread.sleep(2000);


		lp.enterPassword("Vivek@1234");
		System.out.println("PassWord Entered");
		Thread.sleep(2000);

		lp.clickOnRememberMe();
		System.out.println("ClickOnRememberMeBtn");
		Thread.sleep(2000);


		lp.clickOnLoginBtn();
		System.out.println("Clicked login Btn and went on homepage");
		Thread.sleep(5000);
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.clickOnHTC();
		System.out.println("Clicked htc prod");
		Thread.sleep(4000);
		
		hp.clickOnAddToCart();
		System.out.println("Clicked add to cart button");
		Thread.sleep(3000);
		
		hp.clickOnShoppingCart();
		System.out.println("Clicked on Cart");
		Thread.sleep(3000);
		
		CartPagePOMClass cp = new CartPagePOMClass(driver);
		cp.clickOnCheckBox();
		System.out.println("Clicked on CheckBox");
		Thread.sleep(3000);
		
		cp.clickOnCheckoutBtn();
		System.out.println("Clicked on checkout");
		Thread.sleep(3000);
		
		
		CheckoutPagePOMClass chp = new CheckoutPagePOMClass(driver);
		
		chp.enterFirstName();
		
		chp.enterlastName();
		
		chp.enterEmail();
		
		chp.selectCountry();
		
		chp.enterCity();
		
		chp.enterAddress();
		
		chp.enterZipCode();
		
		chp.enterPhone();
		
		chp.clickOnContinueBtn();
		
		chp.clickonshippingContineu();
		
		chp.clickOnpaymentCBTN();
		
		chp.clickOnPayInfoCBtn();
		
		chp.clickOnConfirmBtn();
		
	}
}
