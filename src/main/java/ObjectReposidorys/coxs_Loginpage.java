package ObjectReposidorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coxs_Loginpage {
	
	@FindBy(xpath="//input[@name='login[username]']")private WebElement username;
	//@FindBy(xpath="")private WebElement password;
	//@FindBy(xpath="")private WebElement loginbtn;
	
	//constructure
	public coxs_Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    //Getters
	public WebElement getUsername() {
		return username;
	}

	//public WebElement getPassword() {
	//	return password;
	//}

	//public WebElement getLoginbtn() {
		//return loginbtn;
	//}
	
	//Business liberayer
	public void logintocoxs(String UNAME)
	{
		username.sendKeys(UNAME);
		//password.sendKeys(PWORD);
		//loginbtn.click();
	}
	
	

}
