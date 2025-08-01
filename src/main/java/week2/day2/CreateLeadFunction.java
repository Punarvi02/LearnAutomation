package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("guest");
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");

        // Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        

        // Click the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Clcik on the CRMSFA link
        driver.findElement(By.partialLinkText("CRM")).click();

        // Click on the Leads link
        driver.findElement(By.linkText("Leads")).click();

        // Click on the Create Lead link
        driver.findElement(By.linkText("Create Lead")).click();

        Thread.sleep(4000);

        // Enter company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");

        // Enter first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Punarvi1");

        // Enter the last name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karanam1");
        
        //Enter Title
       driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("LearnAutomation");
        
       String inputTitle = "LearnAutomation";
       System.out.println(inputTitle);
       
    // Click on the Create lead button
       driver.findElement(By.name("submitButton")).click();


       String outputTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
       
       System.out.println(outputTitle);
       if(outputTitle.contains(inputTitle)) {
    	   System.out.println("Title is displayed correctly");
       }
       else {
    	   System.out.println("Title is not displayed correctly");
       }
        
       driver.close();

        
    }
}
