package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		
//		01) Launch  Chrome browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
//		add  implicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		02) Load https://www.abhibus.com/
        driver.get("https://www.abhibus.com/");
//		03) Click on Bus
//		04) Type "Chennai" in the FROM text box
//       05) Click the first option from the pop up box
        driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 ui-autocomplete-input'])[1]")).sendKeys("Chennai");
        driver.findElement(By.xpath("(//li[text()='Chennai'])[1]")).click();
     	
//		06) Type "Bangalore" in the TO text box
        driver.findElement(By.id("destination")).sendKeys("Bangalore");
//		07) Click the first option from the pop up box
        driver.findElement(By.xpath("(//li[text()='Bangalore'])[1]")).click();
//		08) Select tomorrow's date in the Date field
        driver.findElement(By.id("datepicker1")).click();
        driver.findElement(By.xpath("//a[text()='1']")).click();
//		09) Click Search Buses
        driver.findElement(By.xpath("//a[text()='Search']")).click();
//		09) Print the name of the first resulting bus (use .getText())
        String result = driver.findElement(By.xpath("(//div[@class='search-column1'])[1]/h2")).getText();
        System.out.println(result);
//		10) Choose SLEEPER in the left menu from Bus Type
        driver.findElement(By.id("Bustypes4")).click();
//		11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
        String seats = driver.findElement(By.xpath("(//div[@class='search-column2-col1'])[1]/p")).getText();
        System.out.println(seats);
//		12) Click SelectSeat
        driver.findElement(By.xpath("(//a[@class='btn-seatselect book1']/span)[1]")).click();
//		13) Choose any one Available seat
        driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[1]")).click();
//		14) Print Seats Selected ,Total Fare
        String noOfSeats = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
        System.out.println("No Of Seats : "+ noOfSeats );
        String fare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
        System.out.println("fare : "+ fare );
//		15) Select Boarding Point  and Dropping Point
        WebElement bPoint = driver.findElement(By.id("boardingpoint_id"));
        Select boardingPoint = new Select(bPoint);
        boardingPoint.selectByVisibleText("Shollinganallaur-21:16");
        WebElement dPoint = driver.findElement(By.id("droppingpoint_id"));
        Select droppingPoint=new Select(dPoint);
        droppingPoint.selectByVisibleText("Electronic City Toll Gate-05:07");
//		16) Get the Title of the page(use .getTitle())
        String title = driver.getTitle();
        System.out.println(title);
//		17) Close the browser
        driver.quit();


	}

}
