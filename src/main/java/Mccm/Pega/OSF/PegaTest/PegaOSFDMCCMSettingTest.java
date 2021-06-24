package Mccm.Pega.OSF.PegaTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Mccm.Pega.OSF.OSFDMCCMSettings;
import Mccm.Pega.OSF.OSFDSS;
import Mccm.Pega.Outbound.PegaMain.HomePage;
import Mccm.Pega.Outbound.PegaMain.LoginPage;
import Mccm.Pega.Outbound.PegaMain.HomePageDetails;
//import Mccm.Pega.Outbound.PegaSubClass.HomePageDetails;
import Mccm.Pega.Outbound.PegaTestBase.TestBase;
import Mccm.Pega.QAUtil.TestUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PegaOSFDMCCMSettingTest extends TestBase {

	private static final String priorty = null;
	LoginPage loginpage;
	HomePage  homepage;
	//	HomePageDetails HomePageDetails1;
	OSFDMCCMSettings OSFDMCCMSettings1;
	TestUtil testutil;
	OSFDSS osfDSS;

	public PegaOSFDMCCMSettingTest()
	{
		super();
	}
	@BeforeMethod

	public void setup() throws InterruptedException {
		initialization();

		loginpage = new LoginPage();
		testutil = new TestUtil();
		osfDSS =new OSFDSS();

		//HomePageDetails1 =new HomePageDetails();
		OSFDMCCMSettings1 = new OSFDMCCMSettings();

		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		 
		//	HomePageDetails1=homepage.ClickHomepage();
		OSFDMCCMSettings1=homepage.ClickHomepageOSF();
		 
	}
	@Test (priority=1)
	public void VerifyOSFDynamicSystemSettingRunSuccessfully() throws InterruptedException { 
		System.out.println("OSF DSS Script started");
		OSFDMCCMSettings1.Recordclk();
		OSFDMCCMSettings1.SysAdmin();
		OSFDMCCMSettings1.javaexictor4();
		OSFDMCCMSettings1.DynamicSystemSettins();
		 

		//Internal_REST_URL_OSF
		testutil.SwitcToFrame(0);
		osfDSS.FilterosfDSS();
		osfDSS.CalNBAStartOffSrch();
		osfDSS.ApplaycALCNBAfilter();
		osfDSS.ClikMCCM();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.CalNBAStartOff();
		osfDSS.SaveCalNBAStartOff();
		osfDSS.CloseCalNBAStartOff();
		//Internal_REST_URL_OSF
		System.out.println("Internal_REST_URL_OSF DSS Setting Done");

		//		//OSFDirection
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget0Ifr");
		osfDSS.FilterOSFDirection();
		osfDSS.OSFDirectionSrch();
		osfDSS.ApplayOSFDirection();
		osfDSS.ClikMCCMOSFDirection();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.OSFDirection();
		osfDSS.SaveOSFDirection();
		osfDSS.CloseOSFDirection();
		//		//OSFDirection
		System.out.println("OSFDirection DSS Setting Done");
		//		//OSFChannel
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget0Ifr");
		osfDSS.FilterOSFChannel();
		osfDSS.OSFChannelSrch();
		osfDSS.ApplayOSFChannel();
		osfDSS.ClikMCCMOSFChannel();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.OSFChannel();
		osfDSS.SaveOSFChannel();
		osfDSS.CloseOSFChannel();
		//		//OSFChannel
		System.out.println("OSFChannel DSS Setting Done");

		//OSFContainerName
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget0Ifr");
		osfDSS.FilterOSFContainerName();
		osfDSS.OSFContainerNameSrch();
		osfDSS.ApplayOSFContainerName();
		osfDSS.ClikMCCMOSFContainerName();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.OSFContainerName();
		osfDSS.SaveOSFContainerName();
		osfDSS.CloseOSFContainerName();
		//OSFContainerName
		System.out.println("OSFContainerName DSS Setting Done");

		//OSFSClassificationDefaultValue
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget0Ifr");
		osfDSS.FilterOSFSClassificationDefaultValue();
		osfDSS.OSFSClassificationDefaultValueSrch();
		osfDSS.ApplayOSFSClassificationDefaultValue();
		osfDSS.ClikMCCMOSFSClassificationDefaultValue();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.OSFSClassificationDefaultValue();
		osfDSS.SaveOSFSClassificationDefaultValue();
		osfDSS.CloseOSFSClassificationDefaultValue();
		//OSFSClassificationDefaultValue
		System.out.println("OSFSClassificationDefaultValue DSS Setting Done");

		//MaxNoOfAcntsForOSFGetNBAPerRqst
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget0Ifr");
		osfDSS.FilterOSFMaxNoOfAcntsForOSFGetNBAPerRqst();
		osfDSS.OSFMaxNoOfAcntsForOSFGetNBAPerRqstSrch();
		osfDSS.ApplayOSFMaxNoOfAcntsForOSFGetNBAPerRqst();
		osfDSS.ClikMCCMOSFMaxNoOfAcntsForOSFGetNBAPerRqst();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.OSFMaxNoOfAcntsForOSFGetNBAPerRqstValue();
		osfDSS.SaveOSFMaxNoOfAcntsForOSFGetNBAPerRqst();
		osfDSS.CloseOSFMaxNoOfAcntsForOSFGetNBAPerRqst();
		//MaxNoOfAcntsForOSFGetNBAPerRqst
		System.out.println("MaxNoOfAcntsForOSFGetNBAPerRqst DSS Setting Done");

		//OSFGetNBATimeout
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget0Ifr");
		osfDSS.FilterOSFGetNBATimeout();
		osfDSS.OSFGetNBATimeoutSrch();
		osfDSS.ApplayOSFGetNBATimeout();
		osfDSS.ClikMCCMOSFGetNBATimeout();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.OSFGetNBATimeout();
		osfDSS.SaveOSFGetNBATimeout();
		osfDSS.CloseOSFGetNBATimeout();
		//OSFGetNBATimeout
		System.out.println("OSFGetNBATimeout DSS Setting Done");
		//D_mccmsettings
		osfDSS.D_mccmsettings();
		osfDSS.SerchClick();
		osfDSS.Clickdmccmsetting();
		testutil.SwitcTodefaultContent();
		testutil.SwitchToFrame("PegaGadget1Ifr");
		osfDSS.ActionClkDmccmsetting();
		osfDSS.RunActionClk();
		osfDSS.FulshRunClick();
		//D_mccmsettings
		System.out.println("D_mccmsettings DSS Setting Done");
		
		System.out.println("OSF DSS Execution Ended");
	}


	@AfterMethod

	public void teardown() {

	 driver.quit();


		System.out.println("OSF Dynamic System Setting Test Case Executed");  
	}

}
