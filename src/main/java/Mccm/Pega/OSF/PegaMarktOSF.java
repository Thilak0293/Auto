package Mccm.Pega.OSF;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import Mccm.Pega.Outbound.PegaTestBase.TestBase;
import Mccm.Pega.QAUtil.TestUtil;
import Mccm.Pega.excel.utility.Excel_Reader;

public class PegaMarktOSF extends TestBase  {
	

	public static String ExcelFilePath;
	
	@FindBy(xpath="//a[@id='appview-nav-toggle-one']")
	WebElement Homepage;
	
	@FindBy(xpath="(//i[@class='pi pi-caret-down'])[2]")
	WebElement Pegalunch;
	
	@FindBy(xpath="(//span[@class='menu-item-title'])[5]")
	WebElement pegamrkting1;
	@FindBy(xpath="//a[@id='appview-nav-toggle-one']")
	WebElement ExpandPegMrkPage;
	
	@FindBy(xpath="//span[text()='Campaigns']")
	WebElement Campaigns;
	
	@FindBy(xpath="//*[@class='pi pi-caret-down']")
	WebElement Create;
	
	@FindBy(xpath="//span[text()='Multi-Channel Campaign']")
	WebElement MultiChannelCampaign;
	
	@FindBy(xpath="//input[@type='text'][@name='$PpyWorkPage$ppyLabel']")
	WebElement Campaigncode;
	
	@FindBy(xpath="//span[text()='Build']")
	WebElement Build;
				
	@FindBy(css="button[name='ContainerWithHeader_pyWorkPage.ProgramConfiguration.StrategyContainer_7']")
	WebElement MrktStrtgyConfig;
	
	@FindBy(xpath="//input[contains(@name,'pFilterCriteriaDisplay$ppyValue')]")
	WebElement SrchMrkStrtgy;
	
	@FindBy(xpath="//*[contains(@class,'pi-search')]")
	WebElement ClkSrchMrkStrtgy;
	
	@FindBy(xpath="(//div[contains(@data-repeat-source,'MultiSelectCardSelector')]//button[text()='Add'])[1]")
	WebElement AddMrkStrtgy;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement Applay;
	
	@FindBy(xpath="//div[text()='Engagement']")
	WebElement webelement2;
	
	
	@FindBy(css="button[name='EngagementContainer_pyWorkPage_7']")
	WebElement Engagementconfig;
	
	
	@FindBy(xpath="//input[@type='checkbox'][@name='$PpyWorkPage$pEnableContainers']")
	WebElement OSFContainers;
	
	
	@FindBy(xpath="//img[@name='CalendarImg-8e50e8cd']")
	WebElement Calender;
	
	@FindBy(xpath="//a[text()='Today']")
	WebElement Currentdate;
	
	@FindBy(xpath="//text()[.='Configure containers']/ancestor::button[1]")
	WebElement ConfigureContainers;
	
	@FindBy(xpath="//input[@type='text'][@name='$PRealtimeContainerMultiPg$pFilterCriteriaDisplay$ppyValue']")
	WebElement SrchConfigEngagment;
	
	@FindBy(xpath="//*[@name='WideDetailsSelectorPanel_RealtimeContainerMultiPg_53']")
	WebElement ClkConfigEngagment;
	
	@FindBy(xpath="(//div[contains(@data-repeat-source,'RealtimeContainerMultiPg')]//button[text()='Add'])[1]")
	WebElement AddConfigureContainers;
	
	@FindBy(xpath="//button[text()='Add containers']")
	WebElement AddContainers;
	
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement ApplayEngagement;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement SaveCampgn;
	
	@FindBy(xpath="//button[text()='Run']")
	WebElement RunCampgn;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement ConfirmCampgn;
	
	@FindBy(xpath="//*[@class='pi pi-refresh']")
	WebElement RefreshCampgn;

	@FindBy(xpath="//h2[text()='Run schedule']")
	WebElement Runschedule;
	
	@FindBy(xpath="(//span[@class='menu-item-icon-imageclass pi pi-megaphone'])[1]")
	WebElement CampaignImage;

	
	
	Excel_Reader obj= new Excel_Reader(ExcelFilePath+"/UseCaseConfigFile/TestData/PegaTestData.xlsx");
	
	String OSFCampaigncd = obj.getCellValue("PegaTestDataOSF", 1, 0);
		
	String ConfigMrkStrtgy = obj.getCellValue("PegaTestDataOSF", 1, 1);
				
	String OSFcontainers = obj.getCellValue("PegaTestDataOSF", 1, 2);
	
	
		
	public PegaMarktOSF( ) {
    	PageFactory.initElements(driver, this);
    }
	
	public PegaMarktOSF Pegamrklunch()throws InterruptedException {
		
	     Actions  action = new Actions(driver);
	     action.moveToElement(Pegalunch).click().build().perform();
	     Thread.sleep(1000);
	     return new PegaMarktOSF();
	}
	
	public void pegamarkting() throws InterruptedException
	{
		Thread.sleep(6000);
		pegamrkting1.click( );
		Thread.sleep(6000);
	}


	public void ExpandPegMrkPage1() throws InterruptedException
	{

		boolean searchIconPresence = ExpandPegMrkPage.isDisplayed();
		boolean searchIconEnabled =  ExpandPegMrkPage.isEnabled();

		if (searchIconPresence==true && searchIconEnabled==true)

		{
			WebElement element20 = ExpandPegMrkPage;
			JavascriptExecutor executor14 = (JavascriptExecutor)driver;
			executor14.executeScript("arguments[0].click();", element20);

		}
		 
	}


	public void Campaigns() throws InterruptedException
	{
	//	wait.until(ExpectedConditions.visibilityOf(Campaigns));
		Campaigns.click( );
		Thread.sleep(8000); 
	}
	

public void CampaignImage() throws InterruptedException
	{

	//	wait.until(ExpectedConditions.visibilityOf(CampaignImage));
		CampaignImage.click( );
		 
	}
	public void Create() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Create));
		Create.click( );
         
	}
	public void MultiChannelCampaign() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(MultiChannelCampaign));
		MultiChannelCampaign.click( );
        
	}
	public void Campaigncode() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Campaigncode));
		Campaigncode.sendKeys(OSFCampaigncd);
        
	}
	public void Build() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Build));
		Build.click( );
         
	}
	public void MrktStrtgyConfig() throws InterruptedException
	{
	//	wait.until(ExpectedConditions.visibilityOf(MrktStrtgyConfig)); 
	//	Thread.sleep(3000);
		MrktStrtgyConfig.click( );
         
	}
	public void SrchMrkStrtgy() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(SrchMrkStrtgy));
		SrchMrkStrtgy.sendKeys(ConfigMrkStrtgy);
		wait.until(ExpectedConditions.visibilityOf(ClkSrchMrkStrtgy));
        ClkSrchMrkStrtgy.click();
      
	}
		
	public void AddMrkStrtgy() throws InterruptedException
	{
	//	wait.until(ExpectedConditions.visibilityOf(AddMrkStrtgy));
		AddMrkStrtgy.click( );
        
	}
	public void Applay() throws InterruptedException
	{
	//	wait.until(ExpectedConditions.visibilityOf(Applay)); 
		Applay.click( );
		 Thread.sleep(6000);
	}    
	
	public void javaexictor2() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(webelement2)); 
		TestUtil obj=new TestUtil();
		obj.JavascriptExecutor(webelement2);
	}
	
	public void Engagementconfig() throws InterruptedException
	{
		Thread.sleep(3000);
	//	wait.until(ExpectedConditions.visibilityOf(Engagementconfig)); 
		Engagementconfig.click( );
        
	}
	
	public void OSFContainers() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(OSFContainers)); 
		OSFContainers.click( );
        
	}
	
	public void Calender() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Calender)); 
		Calender.click( );
        
	}
	
	public void Currentdate() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Currentdate)); 
		Currentdate.click( );
        
	}
	
	public void ConfigureContainers() throws InterruptedException
	{
	 	wait.until(ExpectedConditions.visibilityOf(ConfigureContainers)); 
	 	ConfigureContainers.click( );
        
	}
	
	public void SrchConfigEngagment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(SrchConfigEngagment)); 
		SrchConfigEngagment.sendKeys(OSFcontainers);
		wait.until(ExpectedConditions.visibilityOf(ClkConfigEngagment)); 
        ClkConfigEngagment.click();
         
	}
	public void AddConfigureContainers() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(AddConfigureContainers)); 
		AddConfigureContainers.click( );
        
	}
	
	public void Javascriptserch() throws InterruptedException
	{
		  
		 boolean searchIconPresence = AddContainers.isDisplayed();
	     boolean searchIconEnabled =  AddContainers.isEnabled();

	     if (searchIconPresence==true && searchIconEnabled==true)

	     {
	      	 WebElement element9 = AddContainers;
	    	 JavascriptExecutor executor3 = (JavascriptExecutor)driver;
	    	 executor3.executeScript("arguments[0].click();", element9);
	    	
	     }
	}
	     
	public void ApplayEngagement() throws InterruptedException
	 	{
	  	wait.until(ExpectedConditions.visibilityOf(ApplayEngagement));
	//	wait.until(ExpectedConditions.elementToBeClickable(ApplayEngagement)); 
	//	wait.until(ExpectedConditions.presenceOfElementLocated((By) ApplayEngagement));
	     	Thread.sleep(6000);
	 		ApplayEngagement.click( );
	         
	 	}
	
	public void SaveCampgn() throws InterruptedException
 	{
	// 	wait.until(ExpectedConditions.presenceOfElementLocated((By) SaveCampgn));
	// 	wait.until(ExpectedConditions.elementToBeClickable(SaveCampgn));
     	wait.until(ExpectedConditions.visibilityOf(SaveCampgn));
	// 	wait.until(ExpectedConditions.visibilityOfElementLocated((By) SaveCampgn));
	 	Thread.sleep(3000);
 		SaveCampgn.click( );
         
 	}
	
	public void RunCampgn() throws InterruptedException
 	{
		wait.until(ExpectedConditions.visibilityOf(RunCampgn));
 		RunCampgn.click( );
         
 	}


	public void ConfirmCampgn() throws InterruptedException
 	{
	 	wait.until(ExpectedConditions.elementToBeClickable(ConfirmCampgn));
 		ConfirmCampgn.click( );
          
 	}
	public void RefreshCampgn() throws InterruptedException
 	{
	 	wait.until(ExpectedConditions.elementToBeClickable(RefreshCampgn));
 		RefreshCampgn.click( );
        
 	}
	
	}
	

	
