package week4.testassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
//		1.https://www.facebook.com/ ;
//		Step 1: To open the ChromeDriver
		ChromeDriver driver=new ChromeDriver();

//			Step 2: Load the Application Url as 'https://www.facebook.com/'
		driver.get("https://www.facebook.com/");
//			Step 3: Maximize the Browser
		driver.manage().window().maximize();
//			Step 4: Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(@data-testid,'open')]")).click();
//			Step 5: Enter first name
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Arun");
//			Step 6: Enter last name
		driver.findElement(By.name("lastname")).sendKeys("S");
//			Step 7: Enter your mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("7339226761");
//			Step 8: Enter your password
		driver.findElement(By.name("reg_passwd__")).sendKeys("qwer1234");
//			Step 9: Select  date
		WebElement day = driver.findElement(By.id("day"));
		Select day1=new Select(day);
		day1.selectByVisibleText("26");
//			Step 10: Select month
		WebElement month = driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Apr");
//			Step 11: Select year
		WebElement year = driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2001");
//			Step 12: Click on your Gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();
//			Step 13: Close your Browser
		Thread.sleep(3000);
		driver.close();

	}

}
