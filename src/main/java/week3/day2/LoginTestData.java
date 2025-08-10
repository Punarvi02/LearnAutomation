package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Username entered");
	}
	
	public void enterPassword() {
		System.out.println("Password entered");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData test = new LoginTestData();
		test.enterUsername();
		test.enterPassword();
		test.enterCredentials();
		test.navigateToHomePage();

	}

}
