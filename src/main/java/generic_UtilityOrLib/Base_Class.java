package generic_UtilityOrLib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.browser.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import objectrepository.HomePage;
import objectrepository.LoginPage;

public class Base_Class {
	
	public static WebDriver driver=null;
	Seleniumutility sutil=null;
	PropertiesUtility putil=new PropertiesUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void createConnection()
	{
		System.out.println("Connection Establish!!");
	}
	
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception
	{
		String Url=putil.getDataFromProperties("url");
		sutil=new Seleniumutility();
		driver=new ChromeDriver();
		sutil.implicitWait(driver,10);
		sutil.maximizeWindow(driver);
		driver.get(Url);
		System.out.println("Launching Browser Successfully!!");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginApp() throws Exception
	{
		String Username=putil.getDataFromProperties("username");
		String Password=putil.getDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lp.LoginOperation(Username, Password);
		System.out.println("Login Successfully!!");
		
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void logoutApp() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.logoutOpretaion(driver);
		System.out.println("Logout Successfully!!");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser Closed Successfully!!");
	}
	
	@AfterSuite(alwaysRun=true)
	public void closeConnection()
	{
		System.out.println("Connection Closed Successfully!!");
	}
}
