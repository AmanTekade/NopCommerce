package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	WebDriver driver;
	public LoginPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[text()='Log in']")
	WebElement loginlink;
	public void clickOnLink()
	{
		loginlink.click(); 
	}



	@FindBy(xpath="//input[@id='Email']")     
	WebElement email;
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}

	@FindBy(xpath="//input[@id='Password']")     
	WebElement Password;
	public void enterPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	@FindBy(xpath="//input[@id='RememberMe']")
	WebElement rememberme;
	public void clickOnRememberMe()
	{
		rememberme.click();
	}
	
	
	@FindBy(xpath="//button[text()='Log in']")     
	WebElement loginBtn;
	public void clickOnLoginBtn()
	{
		loginBtn.click(); 
	}




}
