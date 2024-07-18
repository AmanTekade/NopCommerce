package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass
{
  WebDriver driver;
  public CartPagePOMClass(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//input[@id='termsofservice']")WebElement iagreebox;
  public void clickOnCheckBox()
  {
	  iagreebox.click();
  }
  
  @FindBy(xpath="//button[@id='checkout']")WebElement checkoutBtn;
  public void clickOnCheckoutBtn()
  {
	  checkoutBtn.click();  
  }
}
