package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
 
	//for all common methods
	
	public static long PAGE_LOAD_TIMEOUT =20;
	public static long IMPLICIT_WAIT_TIMEOUT = 10;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
		
		//public static void equals(String reason, String actual, String expected){
		//if(!actual.equalsIgnoreCase(expected)) {
//		throw new RuntimeException(reason);}}
		
	}
}
