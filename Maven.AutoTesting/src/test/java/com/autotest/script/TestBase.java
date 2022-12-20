package com.autotest.script;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase{
private static WebDriver driver;
public static Properties properties;

@BeforeTest
public void onSetUp() throws IOException
	{
		properties=new Properties();
		FileInputStream inputStream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		properties.load(new InputStreamReader(inputStream));
		
		if(properties.getProperty("browser").equals("chrome"))
		{
			setDriver(new ChromeDriver());
		}
		else if(properties.getProperty("browser").equals("firefox"))
		{
			setDriver(new FirefoxDriver());
		}
		 getDriver1().get(properties.getProperty("url"));
		// getDriver().manage().window().maximize();
		 System.out.println("setup completed successfully");

}


public void setDriver(WebDriver driver) {
	this.driver=driver;

}



public static WebDriver getDriver1() {
	// TODO Auto-generated method stub
	return driver;
}}
