package ObjectReposidorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilitys.WebdriverUtilitys;

public class Coxs_CoxsHomePage extends WebdriverUtilitys {
	@FindBy(xpath="//span[text()='Outdoor']")private WebElement outdoor;
	@FindBy(xpath="")private WebElement seating;
	@FindBy(xpath="")private WebElement tables;
	@FindBy(xpath="")private WebElement mirrors;
	@FindBy(xpath="")private WebElement  lights;
	
	//constructurs
	
	public Coxs_CoxsHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Getters
	
	public WebElement getOutdoor() {
		return outdoor;
	}

	public WebElement getSeating() {
		return seating;
	}

	public WebElement getTables() {
		return tables;
	}

	public WebElement getMirrors() {
		return mirrors;
	}

	public WebElement getLights() {
		return lights;
	}
	
	//Business Liberayers
	public void moveonoutdoor(WebDriver driver) {
		movetoelement(driver, lights);
	}
	
	

}
