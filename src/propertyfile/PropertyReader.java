package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
       
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		
		File f = new File(dir+"\\DM21Prop.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties proObj = new Properties();
		
		proObj.load(fis);
		
		String url = proObj.getProperty("baseURL");
		System.out.println(url);
		System.out.println(proObj.getProperty("useName"));
		System.out.println(proObj.getProperty("password"));
		


	}

}
