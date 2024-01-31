package ObjectReposidorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFieldPage {
	
	@FindBy(xpath = "//input[@id='search']")private WebElement lig;
	@FindBy(xpath = "//button[@title='Search']")private WebElement searchicon;
	
	//constructure
	
	public SearchFieldPage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}

	//Getters
	public WebElement getLig() {
		return lig;
	}
	
	
	//business Liberayer
	
	public WebElement getSearchicon() {
		return searchicon;
	}


	public void serachtheproduct(String SEARCH) {
		 lig.sendKeys(SEARCH);
	}
	public void clickOnSearchIcon() {
		searchicon.click();
	}

}
