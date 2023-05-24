package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
//		8	Click on Email
        WebElement email = driver.findElement(By.linkText("Email"));
        email.click();
//		9	Enter Email
        WebElement typeEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
        typeEmail.sendKeys("arunsenthil761@gmail.com");
//		10	Click find leads button
        WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findLeadButton.click();
//		11	Capture name of First Resulting lead
        WebElement nameOfThe1stLead = driver.findElement(By.xpath("//a[text()='Arun '][1]"));
        String text = nameOfThe1stLead.getText();
        System.out.println(text);
        nameOfThe1stLead.click();
//		12	Click First Resulting lead
//		13	Click Duplicate Lead
        WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
        duplicate.click();
//		14	Verify the title as 'Duplicate Lead'
        String title = driver.getTitle();
        System.out.println(title);
        if(title.contains("Duplicate Lead")){
        System.out.println("title is verified");
        	
        }
//		15	Click Create Lead
        WebElement submit = driver.findElement(By.name("submitButton"));
        submit.click();
//		16	Confirm the duplicated lead name is same as captured name
        WebElement dName = driver.findElement(By.id("viewLead_firstName_sp"));
        String text1 = dName.getText();
        if(text1.equals(text)) {
        	System.out.println("both names are same");
        }
        driver.quit();
//		17	Close the browser (Do not log out)

	}

}
