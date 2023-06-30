package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Pvr {

	public static void main(String[] args) throws InterruptedException {
//		01) Launch the Url  https://www.pvrcinemas.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			02) Click  on Movie Library
//			03) Select the City -->chennai
		driver.findElement(By.xpath("//div[contains(text(),'Movie Library')]")).click();
//			04) Select the Genre-->Animation
		WebElement gen = driver.findElement(By.name("genre"));
		Select genere =new Select(gen);
		genere.selectByVisibleText("ANIMATION");
//			05) Select the Language-->english
		WebElement lan = driver.findElement(By.name("lang"));
		Select language =new Select(lan);
		language.selectByVisibleText("ENGLISH");
//			06) Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
//			07) Click on first resulting animation movie
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']//div[1])[1]")).click();
//			08) Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
//			09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		WebElement cName = driver.findElement(By.name("cinemaName"));
		Select cinemaName =new Select(cName);
		cinemaName.selectByVisibleText("PVR Velachery Chennai");
		WebElement time = driver.findElement(By.name("timings"));
		Select timings =new Select(time);
		timings.selectByIndex(1);
		driver.findElement(By.name("noOfTickets")).sendKeys("1");
		driver.findElement(By.name("name")).sendKeys("Arun Prasanth");
		driver.findElement(By.name("email")).sendKeys("arunsenthil761@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("7339226761");
		WebElement food = driver.findElement(By.name("food"));
		Select food1 =new Select(food);
		food1.selectByIndex(1);
		driver.findElement(By.name("comment")).sendKeys("NA");
//			10) Click on copy to self 
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
//			11) Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
//			12) Click cancel 
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
//			13) Close the OTP dialog
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
//			14) Verify the ttile of the page
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
