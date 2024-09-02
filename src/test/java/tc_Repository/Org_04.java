package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_UtilityOrLib.Base_Class;
import generic_UtilityOrLib.ExcelUtility;
import generic_UtilityOrLib.JavaUtility;
import objectrepository.CreateNewOrgPage;
import objectrepository.HomePage;
import objectrepository.OrgHomePage;
@Listeners(generic_UtilityOrLib.ListernersImplementationClass.class)
public class Org_04 extends Base_Class {

	@Test(retryAnalyzer = generic_UtilityOrLib.RetryAnalyzerImplementationClass.class)
	public void Org_04() throws Exception {
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		ExcelUtility eutil = new ExcelUtility();
		
		String OrgName = eutil.getIndividualTestDate("Organisation", 11, 1);
		String Website = eutil.getIndividualTestDate("Organisation", 11, 2);
		String Noemp = eutil.getIndividualTestDate("Organisation", 11, 3);
		String Phone = eutil.getIndividualTestDate("Organisation", 11, 4);
		String OtherPhone = eutil.getIndividualTestDate("Organisation", 11, 5);
		String Email = eutil.getIndividualTestDate("Organisation", 11, 6);
		String BillingAdd = eutil.getIndividualTestDate("Organisation", 11, 7);
		String BillingCity = eutil.getIndividualTestDate("Organisation", 11, 8);
		String BillingState = eutil.getIndividualTestDate("Organisation", 11, 9);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage op=new OrgHomePage(driver);	
		op.ClickOnNewOrgBtn();
		CreateNewOrgPage cn=new CreateNewOrgPage(driver);
		cn.createorganisation(OrgName+num, Website, Noemp, Phone, OtherPhone, Email, BillingAdd, BillingCity, BillingState);
		Thread.sleep(3000);
		System.out.println("Org_04 executed");
	}
}
