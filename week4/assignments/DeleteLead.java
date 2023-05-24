package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
//      8   Click on Phone
        WebElement phone = driver.findElement(By.linkText("Phone"));
        phone.click();
//		9	Enter phone number
        WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
        phoneNumber.sendKeys("7339226761");
//		10	Click find leads button
        WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findLeadsButton.click();
//		11	Capture lead ID of First Resulting lead
        WebElement firstLead = driver.findElement(By.xpath("//a[text()='15582']"));
        System.out.println(firstLead.getText());
//		12	Click First Resulting lead
        firstLead.click();
//		13	Click Delete
       // driver.findElement(by)
//		14	Click Find leads
//		15	Enter captured lead ID
//		16	Click find leads button
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//		18	Close the browser (Do not log out)

	}

}
