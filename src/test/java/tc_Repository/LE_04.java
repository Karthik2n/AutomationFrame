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
public class LE_04 extends Base_Class{
	@Test(groups = {"smoke","regression"})
	public void le_04() throws Exception {
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		ExcelUtility eutil = new ExcelUtility();
		
		String FirstName = eutil.getIndividualTestDate("Leads", 10, 1);
		String SecondName = eutil.getIndividualTestDate("Leads", 10, 2);
		String Company = eutil.getIndividualTestDate("Leads", 10, 3);
		String Street= eutil.getIndividualTestDate("Leads", 10, 4);
		String Post = eutil.getIndividualTestDate("Leads", 10, 5);
		String PostalCode = eutil.getIndividualTestDate("Leads", 10, 6);
		String City = eutil.getIndividualTestDate("Leads", 10, 7);
		String Country = eutil.getIndividualTestDate("Leads", 10, 8);
		String State = eutil.getIndividualTestDate("Leads", 10, 9);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.ClickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLeads(FirstName, SecondName, Company, Street, PostalCode, Post, City, Country, State);
		Thread.sleep(3000);
		System.out.println("smoke and regression executed!!");
	}

}
