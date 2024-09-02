package tc_Repository;

import org.testng.annotations.Test;

import generic_UtilityOrLib.Base_Class;
import generic_UtilityOrLib.ExcelUtility;
import generic_UtilityOrLib.JavaUtility;
import objectrepository.CreateNewOrgPage;
import objectrepository.HomePage;
import objectrepository.OrgHomePage;

public class Org_03 extends Base_Class {

	@Test
	public void Org_03() throws Exception {
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		ExcelUtility eutil = new ExcelUtility();
		
		String OrgName = eutil.getIndividualTestDate("Organisation", 8, 1);
		String Website = eutil.getIndividualTestDate("Organisation", 8, 2);
		String BillingAdd = eutil.getIndividualTestDate("Organisation", 8, 3);
		String BillingCity = eutil.getIndividualTestDate("Organisation", 8, 4);
		String BillingState = eutil.getIndividualTestDate("Organisation", 8, 5);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage op=new OrgHomePage(driver);	
		op.ClickOnNewOrgBtn();
		CreateNewOrgPage cn=new CreateNewOrgPage(driver);
		cn.createorganisation(OrgName+num, Website, BillingAdd, BillingCity, BillingState);
		Thread.sleep(3000);
		System.out.println("Org_03 executed");
	}
}
