package com.foodbuddy.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src= new File("D:\\projectWorkspace\\foodbuddy\\Configuration\\foodbuddy.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e)
		{
			System.out.println("Exception is" + e.getMessage());
		}
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getPhNum()
	{
		String phNum=pro.getProperty("phnum");
		return phNum;
	}
}
