package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPagePOMClass
{
 WebDriver driver;
 Select sel;
 public CheckoutPagePOMClass(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")WebElement firstName;
 public void enterFirstName()
 {
	 firstName.sendKeys("Vivek");
 }
 
 @FindBy(xpath="//input[@id='BillingNewAddress_LastName']")WebElement lastName;
 public void enterlastName()
 {
	 lastName.sendKeys("Shimpi");
 }
 
 @FindBy(xpath="//input[@id='BillingNewAddress_Email']")WebElement email ;
 public void enterEmail()
 {
	email.sendKeys("vivekshimpi09@gmail.com"); 
 }
 
 @FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")WebElement  countryDrop;
 public void selectCountry()
 {
	 sel = new Select(countryDrop);
	 sel.selectByVisibleText("India");
 }
 
 @FindBy(xpath="//input[@id='BillingNewAddress_City']")WebElement city;
 public void enterCity()
 {
	 city.sendKeys("Pune");
 }
 
 @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")WebElement address;
 public void enterAddress()
 {
	 address.sendKeys("pimpri");
 }
 
 @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")WebElement zipCode;
 public void enterZipCode()
 {
	 zipCode.sendKeys("411027");
 }
 
 @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")WebElement phone;
 public void enterPhone()
 {
	 phone.sendKeys("7456354648");
 }
 
 @FindBy(xpath="//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']")WebElement continueBtn;
 public void clickOnContinueBtn()
 {
	 continueBtn.click();
 }
 
 @FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")WebElement shippingContineu;
 public void clickonshippingContineu()
 {
	 shippingContineu.click();
 }
 
 @FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")WebElement paymentCBTN;
 public void clickOnpaymentCBTN()
 {
	 paymentCBTN.click();
 }
 
 @FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")WebElement payInfoCBtn;
 public void clickOnPayInfoCBtn()
 {
	 payInfoCBtn.click(); 
 }
 
 @FindBy(xpath="//button[text()='Confirm']")WebElement confirmBtn;
 public void clickOnConfirmBtn()
 {
	 confirmBtn.click();
 }
 
}
