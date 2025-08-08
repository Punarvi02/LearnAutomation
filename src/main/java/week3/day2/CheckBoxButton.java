package week3.day2;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("Button is checked");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxButton obj = new CheckBoxButton();
		obj.clickCheckButton();
		obj.click();

	}

}
