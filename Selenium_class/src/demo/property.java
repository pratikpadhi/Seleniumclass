package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test.properties");
	      Properties prop = null;
	     // fis = new FileInputStream("test.properties");
	         prop = new Properties();
	         prop.load(fis);
	         System.out.println("username: "+ prop.getProperty("username"));
	         System.out.println("password: "+ prop.getProperty("password"));
	         prop.setProperty("place","pune");
	         System.out.println("place: "+ prop.getProperty("place"));

	}

}
