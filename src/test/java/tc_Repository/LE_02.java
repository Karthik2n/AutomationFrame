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
public class LE_02 extends Base_Class{
	@Test(groups = {"regression"})
		public void  le_02Case() throws Exception {
			JavaUtility jutil = new JavaUtility();
			int num = jutil.getRandomNumber(1000);
			ExcelUtility eutil = new ExcelUtility();
			
			String FirstName = eutil.getIndividualTestDate("Leads", 4, 1);
			String SecondName = eutil.getIndividualTestDate("Leads", 4, 2);
			String Company = eutil.getIndividualTestDate("Leads", 4, 3);
			String Title = eutil.getIndividualTestDate("Leads", 4, 4);
			String Phone = eutil.getIndividualTestDate("Leads", 4, 5);
			String Mobile= eutil.getIndividualTestDate("Leads", 4, 6);
			String Email = eutil.getIndividualTestDate("Leads", 4, 7);
			String NoE = eutil.getIndividualTestDate("Leads", 4, 8);
			String Street= eutil.getIndividualTestDate("Leads", 4, 9);
			String Post = eutil.getIndividualTestDate("Leads", 4, 10);
			String PostalCode = eutil.getIndividualTestDate("Leads", 4, 11);
			String City = eutil.getIndividualTestDate("Leads", 4, 12);
			String Country = eutil.getIndividualTestDate("Leads", 4, 13);
			String State = eutil.getIndividualTestDate("Leads", 4, 14);
			
			HomePage hp = new HomePage(driver);
			hp.clickOnLeads();
			LeadsHomePage lp = new LeadsHomePage(driver);
			lp.ClickOnNewLeadBtn();
			CreateNewLeadPage cn = new CreateNewLeadPage(driver);
			cn.createLeads(FirstName, SecondName, Company, Title, Phone, Mobile,
					Email, NoE, Street, PostalCode, Post, City, Country, State);
			Thread.sleep(3000);
			System.out.println("regression executed!!");
		}
}
