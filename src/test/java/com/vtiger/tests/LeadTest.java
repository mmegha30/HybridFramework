package com.vtiger.tests;


import org.testng.annotations.Test;

import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;



public class LeadTest extends BaseTest {


	@Test
	public void CreateLeadWithMandatoryFieldsTC03()
	{
		
		String TCName = "CreateLeadWithMandatoryFieldsTC03";
		logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.clickNewLead();
		ldp.createLeadwithMandatoryFields(dt.get(TCName).get("Lname"), dt.get(TCName).get("Company"));
		ldp.clickLogout();
		extent.flush();
	}
	
	
}
