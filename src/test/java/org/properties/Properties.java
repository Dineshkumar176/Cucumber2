package org.properties;


import java.io.FileReader;
import java.io.IOException;

public class Properties {
public static void main(String[] args) throws IOException {
	FileReader fileReader = new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\Feature\\Conf.properties");
	java.util.Properties pro = new java.util.Properties();
	pro.load(fileReader);
	String property = pro.getProperty("url");
	System.out.println(property);
	
	String property2 = pro.getProperty("name");
	System.out.println(property2);
	
	
}
}
