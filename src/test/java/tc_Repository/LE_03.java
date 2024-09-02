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
public class LE_03 extends Base_Class {
	@Test(groups = {"sanity"})
	public void le_03() throws Exception {
	JavaUtility jutil = new JavaUtility();
	int num = jutil.getRandomNumber(1000);
	ExcelUtility eutil = new ExcelUtility();
	
	String FirstName = eutil.getIndividualTestDate("Leads", 7, 1);
	String SecondName = eutil.getIndividualTestDate("Leads", 7, 2);
	String Company = eutil.getIndividualTestDate("Leads", 7, 3);
	String Title = eutil.getIndividualTestDate("Leads", 7, 4);
	String Phone = eutil.getIndividualTestDate("Leads", 7, 5);
	String Mobile= eutil.getIndividualTestDate("Leads", 7, 6);
	String Email = eutil.getIndividualTestDate("Leads", 7, 7);
	String NoE = eutil.getIndividualTestDate("Leads", 7, 8);
	
	HomePage hp = new HomePage(driver);
	hp.clickOnLeads();
	LeadsHomePage lp = new LeadsHomePage(driver);
	lp.ClickOnNewLeadBtn();
	CreateNewLeadPage cn = new CreateNewLeadPage(driver);
	cn.createLeads(FirstName, SecondName, Company, Title, Phone, Mobile, Email, NoE);
	Thread.sleep(3000);
	System.out.println("Sanity executed!!");
}
}
