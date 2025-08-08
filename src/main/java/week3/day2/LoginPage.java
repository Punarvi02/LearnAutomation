package week3.day2;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Common Tasks performed from Loginpage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage();
		obj.performCommonTasks();
		obj.findElement();
		obj.clickElement();
		obj.enterText();
	

	}

}
