package Coxscoxs;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import GenericUtilitys.Propertyfile_Utilitys;
import ObjectReposidorys.Coxs_CoxsHomePage;
import ObjectReposidorys.SearchFieldPage;
import ObjectReposidorys.cokiespages;

public class coxs_coxs_maincode {
	public static void main(String[] args) throws Throwable  {
	
		WebDriver driver=new EdgeDriver();
		
	Propertyfile_Utilitys putil=new Propertyfile_Utilitys();

	//fetch Data from propertyfile
	String UNAME = putil.ReadData_propertyfile("uname");
	System.out.println(UNAME);
	
	String PWORD = putil.ReadData_propertyfile("pword");
	System.out.println(PWORD);
	
	String URL = putil.ReadData_propertyfile("url");
	System.out.println(URL);
	
	String SEARCH = putil.ReadData_propertyfile("search");
	System.out.println(SEARCH);
	
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	//Lunching the Applications
	driver.get(URL);
	
	//cookies 
	Thread.sleep(5000);
	
	cokiespages cp=new cokiespages(driver);
	cp.clickoncookies();
	
	Thread.sleep(5000);
	
     //Move To Element
       Coxs_CoxsHomePage chp=new Coxs_CoxsHomePage(driver);
       chp.moveonoutdoor(driver);
	}

}
