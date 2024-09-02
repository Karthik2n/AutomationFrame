package tc_Repository;

import org.testng.annotations.Test;

import generic_UtilityOrLib.Base_Class;
import generic_UtilityOrLib.ExcelUtility;
import generic_UtilityOrLib.JavaUtility;
import objectrepository.CreateNewOrgPage;
import objectrepository.HomePage;
import objectrepository.OrgHomePage;

public class Org_01 extends Base_Class{
@Test
 public void org_01() throws Exception {
	
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		ExcelUtility eutil = new ExcelUtility();
		
		String OrgName = eutil.getIndividualTestDate("Organisation", 2, 1);
		String Website = eutil.getIndividualTestDate("Organisation", 2, 2);
		String Noemp = eutil.getIndividualTestDate("Organisation", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.ClickOnNewOrgBtn();
		CreateNewOrgPage cn=new CreateNewOrgPage(driver);
		cn.createorganisation(OrgName+num, Website, Noemp);
		Thread.sleep(3000);
		System.out.println("Org_01 executed");
	}
}
	
