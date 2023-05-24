package week4.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Download and set the path 
		ChromeDriver driver=new ChromeDriver();
		// Step 2: Launch the chromebrowser
		driver.get("https://en-gb.facebook.com/");
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 6: Click on Create New Account button
		WebElement createNewButton = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
		createNewButton.click();
		// Step 7: Enter the first name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Arun");
		// Step 8: Enter the last name
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("S");
		// Step 9: Enter the mobile number
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("7339226761");
		// Step 10: Enter the password
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("QWER1234$");
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select day1=new Select(day);
		day1.selectByVisibleText("26");
		WebElement month = driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Apr");
		WebElement year = driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2001");
		// Step 12: Select the radio button "Female" 
        //( A normal click will do for this step) 
		WebElement sex = driver.findElement(By.xpath("//label[text()='Female']"));
		sex.click();
		
	}

}
