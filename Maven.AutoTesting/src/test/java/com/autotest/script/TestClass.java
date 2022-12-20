package com.autotest.script;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nest.constant.AutomationConstants;
import com.nest.pages.RegisterPage;
import com.nest.utilites.ExcelUtilities;

public class TestClass extends TestBase {
	RegisterPage objRegister;
	
	@BeforeClass
	public void objCreation() {
		objRegister= new RegisterPage(getDriver1());
	}

	@Test(priority=1)
	public void fnameVerification() throws Exception {
		 String fname=ExcelUtilities.readDetails(1, 1);
		  String actfname=objRegister.Setfname(fname);
		  Assert.assertEquals(AutomationConstants.class,actfname);
	}		  
	@Test(priority=2)  
	 public void LnameVerification() throws Exception {
     String lname=ExcelUtilities.readDetails(2, 1);
     String actlname=objRegister.Setlname1(lname);
	 Assert.assertEquals(AutomationConstants.class,actlname);
	 }
	@Test(priority=3)
	public void emailVerification() throws Exception {
	 String ename=ExcelUtilities.readDetails(3, 1);
	 String actename=objRegister.Setemail(ename);
	Assert.assertEquals(AutomationConstants.class,actename);}
	@Test(priority=4)		  
	 public void countryVerification() throws Exception {
	 String cname=ExcelUtilities.readDetails(4, 1);
	String actcname=objRegister.SetCountry(cname);
	Assert.assertEquals(AutomationConstants.class,actcname);
	 }
	@Test(priority=5)
	public void phoneVerification() throws Exception {
	String phname=ExcelUtilities.readDetails(2, 1);
	String actphname=objRegister.SetPhoneNumber(phname);
    Assert.assertEquals(AutomationConstants.class,actphname);
	}
	@Test(priority=7)
	public void passwVerification() throws Exception {
	 String passname=ExcelUtilities.readDetails(0, 5);
	String actpassname=objRegister.SetPassword(passname);
	 Assert.assertEquals(AutomationConstants.class,actpassname);
		  }
	@Test(priority=8)
	public void cpasswVerification() throws Exception {
		 String cpassname=ExcelUtilities.readDetails(1, 1);
		String actcpassname=objRegister.SetConfirmPass(cpassname);
		 Assert.assertEquals(AutomationConstants.class,actcpassname);
		 objRegister.SetGender();
		 objRegister.Setchk();
	}
	@Test(priority=10)
	public void yearVerification() throws Exception {
		 String yname=ExcelUtilities.readDetails(1, 5);
		String actyearname=objRegister.Setfname(yname);
		 Assert.assertEquals(AutomationConstants.class,actyearname);
			  }
	@Test(priority=11)
	public void monthVerification() throws Exception {
		 String mname=ExcelUtilities.readDetails(1, 3);
		String actmonthname=objRegister.Setfname(mname);
		 Assert.assertEquals(AutomationConstants.class,actmonthname);
			  }
	@Test(priority=12)
	public void dayVerification() throws Exception {
		 String dname=ExcelUtilities.readDetails(1, 4);
		String actdayname=objRegister.Setfname(dname);
		 Assert.assertEquals(AutomationConstants.class,actdayname);
			  }
	@Test(priority=13)
	public void addressVerification() throws Exception {
		 String addrname=ExcelUtilities.readDetails(0, 0);
		String actaddressname=objRegister.Setfname(addrname);
		 Assert.assertEquals(AutomationConstants.class,actaddressname);
			 objRegister.ClickSubmit();
	}
	
}
