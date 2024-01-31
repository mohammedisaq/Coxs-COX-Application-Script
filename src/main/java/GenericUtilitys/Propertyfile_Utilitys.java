package GenericUtilitys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfile_Utilitys {
	
	
	public String ReadData_propertyfile (String keys) throws Throwable {
		FileInputStream fisp=new FileInputStream(".\\src\\test\\resources\\credentials.properties");
		Properties p= new Properties();
		p.load(fisp);
		String value = p.getProperty(keys);
		return value;
	}

}
