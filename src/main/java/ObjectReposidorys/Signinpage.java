package ObjectReposidorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {

	
	@FindBy(xpath="//span[text()='Sign In']")private WebElement signbtn;
	
	//constructor
	public Signinpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
  //Getters
	public WebElement getSignbtn() {
		return signbtn;
	}
	
	//Business Liberayer
	
	public void ClickonSignButton() {
		signbtn.click();
	}
	
}
