package week4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
//		1. Load url "https://acme-test.uipath.com/login"
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
//		2. Enter email as "kumar.testleaf@gmail.com"
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
//		3. Enter Password as "leaf@12"
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
//		4. Click login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
//		5. Get the title of the page and print
		String pagetitle = driver.getTitle();
		System.out.println("pagetitle="+pagetitle);
//		6. Click on Log Out
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
		logOut.click();
//		7. Close the browser (use -driver.close())
		driver.close();

	}

}