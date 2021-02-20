package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	//Global variables so that all the child classes can inherit the properties of the parent class
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Dhrubajyoti\\Desktop\\Mid-Spring 2020 Selenium\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
			}
		
		

	public static void initialization() {
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browserName.equals("FF")) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	}
	}



