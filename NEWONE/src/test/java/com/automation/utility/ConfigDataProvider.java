package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pp;

	public ConfigDataProvider() throws IOException {
		// TODO Auto-generated constructor stub
		File file=new File("D:/workspace/NEWONE/config/config.properties");
		FileInputStream fis=new FileInputStream(file);
		pp=new Properties();
		pp.load(fis);
	}

	public String getBrowser()
	{
		return pp.getProperty("Browser");
	}
public String getUrl()
{
	return pp.getProperty("qaURL");
}
}
