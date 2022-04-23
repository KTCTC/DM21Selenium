package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWritter {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir")+"\\"+"Env.properties");
		
		FileInputStream fis = new FileInputStream(f);		
		Properties propObj = new Properties();
		propObj.load(fis);
		fis.close();
		
		FileOutputStream fos = new FileOutputStream(f);
		
		propObj.setProperty("username", "PQRS");
		
		propObj.store(fos, "Updated file");

	}

}
