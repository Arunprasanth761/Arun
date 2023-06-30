package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
//		01) Launch Chrome  
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
//	02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
//	     add  implicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	03) Type "Bags" in the Search box
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
//	04) Choose the 	 item in the result (bags for boys)
        driver.findElement(By.xpath("//span[text()=' for boys']")).click();
//	05) Print the total number of results (like 50000)
        String result1 = driver.findElement(By.xpath("(//h1[@class='a-size-base s-desktop-toolbar a-text-normal']/div/div/div/div)[1]")).getText();
		System.out.println(result1);
//	    1-48 of over 50,000 results for "bags for boys"
//	06) Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
//	    (like American Tourister, Generic)
//	07) Choose New Arrivals (Sort)
		WebElement sort = driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative']"));
		Select sort1=new Select(sort);
		sort1.selectByVisibleText("Newest Arrivals");
//	08) Print the first resulting bag info (name, discounted price)
		String firstbag = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).getText();
		System.out.println(firstbag);
		String offer = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']/span)[2]")).getText();
		System.out.println(offer);
//	09) Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
