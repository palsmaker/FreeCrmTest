package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super(); // for calling the super class properties of TestBase class constructor
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage(); // create object of loginPage class
	}
	//Testcases should be independent that's why launch the browser and close the browser for every test case
	
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");}
	
	@Test
	public void crmLogoImageTest() {
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);}
	
	@Test
	public void loginTest() {
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));}
		//returning the object of homepage
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
