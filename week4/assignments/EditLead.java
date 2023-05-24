package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();
//		6   Click Leads link
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
        leadButton.click();
//		7	Click Find leads
        WebElement findlead = driver.findElement(By.linkText("Find Leads"));
        findlead.click();
        //Enter first name
        WebElement firstName = driver.findElement(By.id("ext-gen248"));
        firstName.sendKeys("Arun");
        //Click Find leads button
        WebElement FindLeadsButton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
        FindLeadsButton.click();
        //Click on first resulting lead
        WebElement firstLead = driver.findElement(By.xpath("(//a[text()='VARUN'])[1]"));
        firstLead.click();
        //Verify title of the page
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contains("View Lead")) {
			System.out.println("title is verified");
		}
        //Click Edit
        WebElement edit = driver.findElement(By.linkText("Edit"));
        edit.click();
        //change company
        WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
        companyName.clear();
        companyName.sendKeys("leaftaps1000");
        //Click Update
        WebElement update = driver.findElement(By.name("submitButton"));
        update.click();
        WebElement changedCompName = driver.findElement(By.id("viewLead_companyName_sp"));
        String text = changedCompName.getText();
        System.out.println(text);
        if(text.contains("leaftaps")) {
        	System.out.println("company name changed");
			
		}
        driver.quit();
        

	}

}
