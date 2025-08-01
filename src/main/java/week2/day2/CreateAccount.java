package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        
        ChromeDriver driver=new ChromeDriver(options);
        
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");

        // Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        // Click the Login button
        driver.findElement(By.className("decorativeSubmit")).click();
        
        // Clcik on the CRMSFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click on the Leads link
        driver.findElement(By.linkText("Accounts")).click();

        // Click on the Create Lead link
        driver.findElement(By.linkText("Create Account")).click();
        
     // Enter company name
         driver.findElement(By.id("accountName")).sendKeys("TestLeafAutomation4");
         String inputAccountName = "TestLeafAutomation4";
         System.out.println(inputAccountName);

        // Industry
        driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");

        WebElement sourceElement1 = driver.findElement(By.name("industryEnumId"));

        Select dropdown1 = new Select(sourceElement1);
        
        dropdown1.selectByValue("IND_SOFTWARE");
        
        //Ownership
        WebElement sourceELement2 = driver.findElement(By.name("ownershipEnumId"));
        
       Select dropdown2 = new Select(sourceELement2);
       dropdown2.selectByVisibleText("S-Corporation");
       
       //Source
       WebElement sourceELement3 = driver.findElement(By.id("dataSourceId"));
       
       Select dropdown3 = new Select(sourceELement3);
       dropdown3.selectByValue("LEAD_EMPLOYEE");
       
       //Marketing Campaign
        WebElement sourceELement4 = driver.findElement(By.id("marketingCampaignId"));
       
       Select dropdown4 = new Select(sourceELement4);
       dropdown4.selectByIndex(6);
       
      //State Province
       WebElement sourceELement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
       
       Select dropdown5 = new Select(sourceELement5);
       dropdown5.selectByValue("TX");
       
       driver.findElement(By.className("smallSubmit")).click();
       
       String outputAccountName = driver.findElement(By.xpath("//span[contains(text(),'TestLeaf')]")).getText();
       
       System.out.println(outputAccountName);
       if(outputAccountName.contains(inputAccountName)) {
    	   System.out.println("Account name is displayed correctly");
       }
       else {
    	   System.out.println("Account name is not displayed correctly");
       }
       driver.close();


	}

}
