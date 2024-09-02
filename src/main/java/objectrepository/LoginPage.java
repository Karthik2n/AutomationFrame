package objectrepository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	/**
	 * this is POM class for login operation
	 * @author RACHAYYA
	 * version 1.8.24
	 */
	public class LoginPage {
		
		@FindBy(xpath="//input[@name='user_name']")
		private WebElement username;
		
		@FindBy(xpath="//input[@name=\"user_password\"]")
		private WebElement password;
		
		@FindBy(xpath="//input[@id=\"submitButton\"]")
		private WebElement loginbtn;
		
		public  LoginPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
		/**
		 * this is business library to do login operation
		 * @param uname
		 * @param pass
		 */
		
		public void LoginOperation(String uname, String pass) {
			username.sendKeys(uname);
			password.sendKeys(pass);
			loginbtn.click();
			
		}

}
