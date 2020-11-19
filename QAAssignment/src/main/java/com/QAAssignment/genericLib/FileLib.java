package com.QAAssignment.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileLib {
	
	public static String getPropertyKeyvalue(String key) throws Throwable {
		FileInputStream file=new FileInputStream(".\\commonData.properties");
		Properties p=new Properties();
		p.load(file);
		return p.getProperty(key);
	}
	
	

}
