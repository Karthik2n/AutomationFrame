package sample;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority = 3)
	//@Test(invocationCount = 0)
	public void CreateUser() {
		System.out.println("user created!!");
	}
	//@Ignore
	@Test(dependsOnMethods = "CreateUser")
	public void ModifyUser() {
		System.out.println("user Modified!!");
	}
	@Test(invocationCount = 3)
	public void DeleteUser() {
		System.out.println("User Deleted!!");
	}
}
