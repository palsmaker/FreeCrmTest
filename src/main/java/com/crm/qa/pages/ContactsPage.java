package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath ="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	//for checkboxes have to create dynamic xpath which is not possible for all the options
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}
	
	//public void selectContactsByName(String name) {
		//driver.findElement(By.xpath)}
	
	
	
}
	
	
