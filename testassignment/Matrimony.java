package week4.testassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) throws InterruptedException {
//		https://www.tamilmatrimony.in/  
//			Step 1: To open ChromeDriver
		ChromeDriver driver=new ChromeDriver();
//			Step 2: Load the Application Url as 'https://www.tamilmatrimony.in/'
		driver.get("https://www.tamilmatrimony.in/");
//			Step 3: Maximize the Browser
		driver.manage().window().maximize();
//			Step 4: Select the Matrimony profile for YourSelf
		WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
		profile.click();
		Select profile1=new Select(profile);
		profile1.selectByVisibleText("Myself");
//			Step 5: Enter Name
		driver.findElement(By.id("NAME")).sendKeys("Arun");
//			Step 6: Click on Gender
		driver.findElement(By.id("gendermale")).click();
//			Step 7: Select your Date of Birth
		WebElement day = driver.findElement(By.id("DOBDAY"));
		Select day1=new Select(day);
		day1.selectByVisibleText("26");
		WebElement month = driver.findElement(By.id("DOBMONTH"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Apr");
		WebElement year = driver.findElement(By.id("DOBYEAR"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2001");
//			Step 8: Select your Religion
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select religion1=new Select(religion);
		religion1.selectByVisibleText("Hindu");
//			Step 10: Select your Mother Tongue 
		WebElement motherTongue = driver.findElement(By.id("MOTHERTONGUE"));
		Select motherTongue1=new Select(motherTongue);
		motherTongue1.selectByVisibleText("Malayalam");
//			Step 11: Select your country 
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
//			Step 12: Enter your MobileNumber 
		WebElement mNumber = driver.findElement(By.id("M_COUNTRYCODE"));
		Select mNumber1=new Select(mNumber);
		mNumber1.selectByVisibleText("+91");
		driver.findElement(By.id("MOBILENO")).sendKeys("7339226761");
//			Step 13: Enter your E-mail ID
		driver.findElement(By.id("EMAIL")).sendKeys("arunsenthil761@gmail.com");
//			Step 14: Close the Browser
		Thread.sleep(3000);
		driver.close();

	}

}
