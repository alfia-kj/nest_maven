package com.nest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
WebDriver driver;
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	private WebElement email;
	
	@FindBy(xpath="//select[@ng-model='country']")
	private WebElement cname;

	@FindBy(xpath="//input [@ng-model='Phone']")
	private WebElement pname;

    @FindBy(xpath="//input [@ng-model='radiovalue']")
    private WebElement gname;

	@FindBy(xpath="// input[@ng-model='Password']")
	private WebElement passname;

    @FindBy(xpath="// input[@ng-model='CPassword']")
    private WebElement cpassname;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	private WebElement chkname;
	
	@FindBy(xpath="//select[@placeholder='Year']")
	private WebElement yname;
	
	@FindBy(xpath="(//select[@placeholder='Year']//parent::div//following-sibling::div//child::select)[1]")
    private WebElement mname;

	@FindBy(xpath="(//select[@placeholder='Year']//parent::div//following-sibling::div//child::select)[2]")
	private WebElement dname;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement adname;
	
	@FindBy(xpath="//button[@id='submitbtn']")
private WebElement submit;
	
	public RegisterPage(WebDriver driver)  //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String Setfname(String finame)
	{   
	fname.sendKeys(finame);
		return fname.getAttribute("value");
	}
	
	public String Setlname1(String laname)
	{   
	lname.sendKeys(laname);
		return lname.getAttribute("value");
	}
	
	public String Setemail(String eemail)
	{   
	email.sendKeys(eemail);
		return email.getAttribute("value");
	}
	
	public String SetCountry(String cntname)
	{   
cname.sendKeys(cntname);
		return cname.getAttribute("value");
	}
	
	public String SetPhoneNumber(String phname)
	{   
	pname.sendKeys(phname);
		return pname.getAttribute("value");
	}
	
	public void SetGender()
	{   
	gname.click();
	}
	
	public String SetPassword(String paname)
	{   
	passname.sendKeys(paname);
		return passname.getAttribute("value");
	}
	
	public String SetConfirmPass(String confname)
	{   
	cpassname.sendKeys(confname);
		return cpassname.getAttribute("value");
	}
	
	public void Setchk()
	{   
	chkname.click();
	}
	
	public String SetYear(String yrname)
	{   
	yname.sendKeys(yrname);
		return yname.getAttribute("value");
	}
	
	public String SetMonth(String moname)
	{   
	mname.sendKeys(moname);
		return mname.getAttribute("value");
	}

	public String SetDay(String dyname)
	{   
	dname.sendKeys(dyname);
		return dname.getAttribute("value");
	}
	
	public String SetAddress(String adrname)
	{   
	adname.sendKeys(adrname);
		return adname.getAttribute("value");
	}
	
	public void ClickSubmit()
	{        submit.click();      	}
	
}
