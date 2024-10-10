package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFetch {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//create object for property file
		Properties p=new Properties();
		//specify the path
		p.load(new FileInputStream("./s21/d1.properties"));
		//fetch the value
		String val = p.getProperty("endPoint");
		System.out.println(val);
		

	}

}
