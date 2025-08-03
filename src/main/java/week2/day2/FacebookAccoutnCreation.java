package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccoutnCreation {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        
        //Click create account button
        driver.findElement(By.partialLinkText("Create new account")).click();
     
        //Enter First name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Firstname1");
        
        //Enter Surname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Surname1");
        
        //Enter mobile number
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("98798765");
        
        //Enter password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
        
        //Day Dropdown
        WebElement day = driver.findElement(By.id("day"));
        
        Select s1 = new Select(day);
        s1.selectByIndex(9);
        
        //Month dropdown
        WebElement month = driver.findElement(By.id("month"));
        
        Select s2 = new Select(month);
        s2.selectByVisibleText("May");
        
        //Year dropdown
        WebElement year = driver.findElement(By.id("year"));
        
        Select s3 = new Select(year);
        s3.selectByValue("2020");
        
        
        //Gender radio button
        driver.findElement(By.xpath("//input[@value='1']")).click();
        
        

	}

}
