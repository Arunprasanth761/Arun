package week4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
 
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
//		 * 2. Enter UserName and Password Using Id Locator
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
//		 * 3. Click on Login Button using Class Locator

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
//		 * 4. Click on CRM/SFA Link
		
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();

//		 * 5. Click on contacts Button
		WebElement contactsButton = driver.findElement(By.linkText("Contacts"));
		contactsButton.click();
//		 * 
//		 * 6. Click on Create Contact
		WebElement createContact = driver.findElement(By.linkText("Create Contact"));
		createContact.click();
//		 *  
//		 * 7. Enter FirstName Field Using id Locator
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("ArunPrasanth");
//		 * 
//		 * 8. Enter LastName Field Using id Locator
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("S");
//		 * 
//		 * 9. Enter FirstName(Local) Field Using id Locator
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("Arun");
//		 * 
//		 * 10. Enter LastName(Local) Field Using id Locator
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("S");
//		 * 
//		 * 11. Enter Department Field Using any Locator of Your Choice
		WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("Testing");
//		 * 
//		 * 12. Enter Description Field Using any Locator of your choice 
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("hi bro");
//		 * 
//		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("arunsenthil761@gmail.com");
//		 * 
//		 * 14. Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state1=new Select(state);
		state1.selectByVisibleText("New York");
//		 * 
//		 * 15. Click on Create Contact
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
//		 * 
//		 * 16. Click on edit button
		WebElement edit = driver.findElement(By.className("subMenuButton"));
		edit.click();
//		 * 
//		 * 17. Clear the Description Field using .clear
		WebElement clearDes = driver.findElement(By.id("updateContactForm_description"));
		clearDes.clear();
//		 * 
//		 * 18. Fill ImportantNote Field with Any text
		WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
		importantNote.sendKeys("welcome");
//		 * 
//		 * 19. Click on update button using Xpath locator
		WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
//		 * 
//		 * 20. Get the Title of Resulting Page.
		System.out.println(driver.getTitle());

    
	}

}
