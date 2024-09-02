package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgName;
	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;
	@FindBy(xpath = "//input[@name='employees']")
	private WebElement employees;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phn ;
	@FindBy(xpath = "//input[@name='otherphone']")
	private WebElement otherphn;
	@FindBy(xpath = "//input[@id='email1']")
	private WebElement email;
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAdress;
	@FindBy(xpath = "//input[@id='bill_city']")
	private WebElement billingCity;
	@FindBy(xpath = "//input[@id='bill_state']")
	private WebElement billingState;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhn() {
		return phn;
	}

	public WebElement getOtherphn() {
		return otherphn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAdress() {
		return billingAdress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * this is test case 01
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param otherPhone
	 * @param mailId
	 */
	
	public void createorganisation(String organisationName,
			String web, String emp,String phoneNumber, String otherPhone,String mailId) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherphn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		saveBtn.click();
	}
	/**
	 * this is test case 02
	 * @param organisationName
	 * @param web
	 * @param emp
	 */
		
	public void createorganisation(String organisationName,
			String web, String emp) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		employees.sendKeys(emp);
		saveBtn.click();
	}
	
	/**
	 * this is test case 03
	 * @param organisationName
	 * @param web
	 * @param billadd
	 * @param billcity
	 * @param billstate
	 */
	public void createorganisation(String organisationName,
			String web, String billadd,String billcity, String billstate) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		billingAdress.sendKeys(billadd);
		billingCity.sendKeys(billcity);
		billingState.sendKeys(billstate);
		saveBtn.click();
	}
	
	/**
	 * this is test case 04
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param otherPhone
	 * @param mailId
	 * @param billadd
	 * @param billcity
	 * @param billstate
	 */
	public void createorganisation(String organisationName,
			String web, String emp,String phoneNumber, String otherPhone,String mailId,
			String billadd,String billcity, String billstate) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherphn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		billingAdress.sendKeys(billadd);
		billingCity.sendKeys(billcity);
		billingState.sendKeys(billstate);
		saveBtn.click();
	}
}
