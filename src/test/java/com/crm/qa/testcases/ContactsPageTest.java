package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	

	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();		
	}
	
	@Test
	public void verifyContactsPageLabel() {
		Boolean ContactsLabel = contactsPage.verifyContactsLabel();
		Assert.assertTrue(ContactsLabel);
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
