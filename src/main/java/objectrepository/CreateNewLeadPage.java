package objectrepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreateNewLeadPage {
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstname;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy(xpath="//input[@name='company']")
		private WebElement company;
		
		@FindBy(xpath="//input[@name='designation']")
		private WebElement title;
		
		@FindBy(xpath="//input[@name='phone']")
		private WebElement phone;
		
		@FindBy(xpath="//input[@name='mobile']")
		private WebElement mobile;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement email;
		
		@FindBy(xpath="//input[@name='noofemployees']")
		private WebElement noOfEmployees;
		
		@FindBy(xpath="//textarea[@name='lane']")
		private WebElement street;
		
		@FindBy(xpath="//input[@name='pobox']")
		private WebElement poBox;
		
		@FindBy(xpath="//input[@name='code']")
		private WebElement postalCode;
		
		@FindBy(xpath="//input[@name='city']")
		private WebElement city;
		
		@FindBy(xpath="//input[@name='country']")
		private WebElement country;
		
		@FindBy(xpath="//input[@name='state']")
		private WebElement state;
		
		@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[2]")
		private WebElement saveBtn;

		public CreateNewLeadPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getCompany() {
			return company;
		}

		public WebElement getTitle() {
			return title;
		}

		public WebElement getPhone() {
			return phone;
		}

		public WebElement getMobile() {
			return mobile;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getNoOfEmployees() {
			return noOfEmployees;
		}

		public WebElement getStreet() {
			return street;
		}

		public WebElement getPoBox() {
			return poBox;
		}

		public WebElement getPostalCode() {
			return postalCode;
		}

		public WebElement getCity() {
			return city;
		}

		public WebElement getCountry() {
			return country;
		}

		public WebElement getState() {
			return state;
		}
		
		
		public WebElement getSaveBtn() {
			return saveBtn;
		}

		
		public void createLeads(String fnmae,String lname,String comp) {
			firstname.sendKeys(fnmae);
			lastName.sendKeys(lname);
			company.sendKeys(comp);
			saveBtn.click();
		}
		
		public void createLeads(String fnmae,String lname,String comp,String tit,String phn,String mob,String mail,String empno,String str,String pob,String poscode,String ct,String coun,String sta) {
			firstname.sendKeys(fnmae);
			lastName.sendKeys(lname);
			company.sendKeys(comp);
			title.sendKeys(tit);
			phone.sendKeys(phn);
			mobile.sendKeys(mob);
			email.sendKeys(mail);
			noOfEmployees.sendKeys(empno);
			street.sendKeys(str);
			poBox.sendKeys(pob);
			postalCode.sendKeys(poscode);
			city.sendKeys(ct);
			country.sendKeys(coun);
			state.sendKeys(sta);
			saveBtn.click();
			
			}
		
		public void createLeads(String fnmae,String lname,String comp,String tit,String phn,String mob,String mail,String empno) {
			firstname.sendKeys(fnmae);
			lastName.sendKeys(lname);
			company.sendKeys(comp);
			title.sendKeys(tit);
			phone.sendKeys(phn);
			mobile.sendKeys(mob);
			email.sendKeys(mail);
			noOfEmployees.sendKeys(empno);
			saveBtn.click();
		}

		public void createLeads(String fnmae,String lname,String comp,String str,String pob,String poscode,String ct,String coun,String sta) {
			firstname.sendKeys(fnmae);
			lastName.sendKeys(lname);
			company.sendKeys(comp);
			poBox.sendKeys(pob);
			postalCode.sendKeys(poscode);
			city.sendKeys(ct);
			country.sendKeys(coun);
			state.sendKeys(sta);
			saveBtn.click();
		}
		
		
		
		
		
		
		

	
}
