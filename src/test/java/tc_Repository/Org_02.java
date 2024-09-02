package tc_Repository;

import org.testng.annotations.Test;

import generic_UtilityOrLib.Base_Class;
import generic_UtilityOrLib.ExcelUtility;
import generic_UtilityOrLib.JavaUtility;
import objectrepository.CreateNewOrgPage;
import objectrepository.HomePage;
import objectrepository.OrgHomePage;

public class Org_02 extends Base_Class {

	@Test
	public void Org_02() throws Exception {
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		ExcelUtility eutil = new ExcelUtility();
		
		String OrgName = eutil.getIndividualTestDate("Organisation", 5, 1);
		String Website = eutil.getIndividualTestDate("Organisation", 5, 2);
		String Noemp = eutil.getIndividualTestDate("Organisation", 5, 3);
		String Phone = eutil.getIndividualTestDate("Organisation", 5, 4);
		String OtherPhone = eutil.getIndividualTestDate("Organisation", 5, 5);
		String Email = eutil.getIndividualTestDate("Organisation", 5, 6);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.ClickOnNewOrgBtn();
		CreateNewOrgPage cn=new CreateNewOrgPage(driver);
		cn.createorganisation(OrgName+num, Website, Noemp, Phone, OtherPhone, Email);
		Thread.sleep(3000);
		System.out.println("Org_02 executed");
	}
}
