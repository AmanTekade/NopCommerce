package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass
{
  WebDriver driver;
  
  public HomePagePOMClass(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//input[@id='small-searchterms']")WebElement searchBar;
  public void enterInSearchBar()
  {
	  searchBar.sendKeys("HTC One M8 Android L 5.0 Lollipop");
  }
  
  @FindBy(xpath="//button[text()='Search']")WebElement searchBtn;
  public void clickOnSearchBtn()
  {
	  searchBtn.click(); 
  }
  
  @FindBy(xpath="//a[text()='HTC One M8 Android L 5.0 Lollipop']")WebElement htcProd;
  public void clickOnHTC()
  {
	  htcProd.click(); 
  }
  
  @FindBy(xpath="(//button[text()='Add to cart'])[1]")WebElement addToCart;
  public void clickOnAddToCart()
  {
	  addToCart.click();
  }
  
  @FindBy(xpath="//span[text()='Shopping cart']")WebElement shoppingCart;
  public void clickOnShoppingCart()
  {
	  shoppingCart.click();
  }
  
  
  
  
}
