package ObjectReposidorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage {

	@FindBy(xpath = "//button[@class='PopupCloseButton__InnerPopupCloseButton-sc-957qyh-0 cMdPwy wisepops-close']")private WebElement popupbtn;
	
	// constructor
	
	public PopupPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
   //Getters
	public WebElement getPopupbtn() {
		return popupbtn;
	}
	
	//Business Liberayers
	
	public void clickonPopUp()
	{
		popupbtn.click();
	}
	
}
