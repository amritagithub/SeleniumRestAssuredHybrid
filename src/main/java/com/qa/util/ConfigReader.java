package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private Properties prop;
/**
 * This method is used to load properties from config.properties file
 * @return
 */
public Properties init_prop() 
{
	prop=new Properties();
	try {
		FileInputStream fis1212=new FileInputStream("src/test/resources/Config/config.properties");
		prop.load(fis1212);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return prop;

	
	
}
}
