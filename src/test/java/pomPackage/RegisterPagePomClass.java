package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPagePomClass
{
	WebDriver driver;	
	Select sel;
	public RegisterPagePomClass(WebDriver driver) //initialize driver to constructor
	{
		this.driver=driver;//global driver
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//a[text()='Register']")WebElement register;

	public void clickOnRegister()
	{
		register.click();
	}

	@FindBy(xpath="//input[@id='gender-male']")WebElement gender;

	public void clickOnGender()
	{
		gender.click();

	}

	@FindBy(xpath="//input[@id='FirstName']")WebElement firstName;

	public void clickOnFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}

	@FindBy(xpath="//input[@id='LastName']")WebElement lastName;

	public void clickOnLastName(String lname)
	{
		lastName.sendKeys(lname);
	}

	@FindBy(xpath="//select[@name='DateOfBirthDay']")WebElement day;
	public void selectDay()
	{
		day.click();
		sel=new Select(day);
		sel.selectByVisibleText("9");

	}

	@FindBy(xpath="//select[@name='DateOfBirthMonth']")WebElement month;
	public void selectMonth()
	{
		month.click();
		sel=new Select(month);
		sel.selectByVisibleText("September");

	}

	@FindBy(xpath="//select[@name='DateOfBirthYear']")WebElement year;
	public void selectYear()
	{
		year.click();
		sel=new Select(year);
		sel.selectByVisibleText("1999");

	}

	@FindBy(xpath="(//input[@type='email'])[1]")WebElement email;

	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}

	@FindBy(xpath="//input[@id='Password']")WebElement pass;

	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}

	@FindBy(xpath="//input[@id='ConfirmPassword']")WebElement cpass;

	public void enterConPassword(String cpassword)
	{
		cpass.sendKeys(cpassword);
	}
  @FindBy(xpath="//button[@id='register-button']")WebElement regbutton;
  
   public void registerButton()
   {
	   regbutton.click();
   }

   @FindBy(xpath="//div[text()='Your registration completed']")WebElement sucess;
  public String verifySucessText()
   {
	 return sucess.getText();
	  
	  
   }


}
