package ObjectReposidorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cokiespages {
	
	@FindBy(xpath="//button[@id='btn-cookie-allow']")private WebElement cookiesbutton;
	
	
	public cokiespages(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getCookiesbutton() {
		return cookiesbutton;
	}
	
	public void clickoncookies() {
		cookiesbutton.click();
	}
	

}
