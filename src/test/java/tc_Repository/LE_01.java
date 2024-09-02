package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_UtilityOrLib.Base_Class;
import generic_UtilityOrLib.ExcelUtility;
import generic_UtilityOrLib.JavaUtility;
import objectrepository.CreateNewLeadPage;
import objectrepository.HomePage;
import objectrepository.LeadsHomePage;
@Listeners(generic_UtilityOrLib.ListernersImplementationClass.class)

public class LE_01 extends Base_Class {
	//@Test(groups = {"smoke"})
	@Test(retryAnalyzer = generic_UtilityOrLib.RetryAnalyzerImplementationClass.class)
	public void le_01Case() throws Exception {
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		ExcelUtility eutil = new ExcelUtility();
		
		String FirstName = eutil.getIndividualTestDate("Leads", 1, 1);
		String SecondName = eutil.getIndividualTestDate("Leads", 1, 2);
		String Company = eutil.getIndividualTestDate("Leads", 1, 3);
		
		HomePage hp = new HomePage(driver);		
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.ClickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLeads(FirstName+num, SecondName, Company);
		Thread.sleep(4000);
		System.out.println("smoke executed!!");
	}
}
