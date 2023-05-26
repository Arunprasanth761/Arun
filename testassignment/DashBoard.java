package week4.testassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DashBoard {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Dashboard")) {
			System.out.println("tittle verified");

		}
		driver.get("http://www.leafground.com/button.xhtml");
		Thread.sleep(3000);
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if (enabled == false) {
			System.out.println("button is disabled");
		}
		WebElement elements = driver.findElement(By.xpath("//form[@id='menuform']/ul/li[3]"));
		elements.click();
		driver.findElement(By.xpath("//li[@id='menuform:j_idt39']/ul/li[3]")).click();
		Thread.sleep(3000);
		WebElement tool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		Select toolInput = new Select(tool);
		toolInput.selectByIndex(1);

		WebElement country = driver.findElement(By.id("j_idt87:country_label"));
		country.click();

		WebElement countryIP = driver.findElement(By.xpath("//li[@data-label='India']"));
		countryIP.click();

		Thread.sleep(3000);
		WebElement city = driver.findElement(By.id("j_idt87:city_label"));
		city.click();
		String city1 = driver.findElement(By.xpath("//ul[@id='j_idt87:city_items']/li[2]")).getText();
		String city2 = driver.findElement(By.xpath("//ul[@id='j_idt87:city_items']/li[3]")).getText();
		String city3 = driver.findElement(By.xpath("//ul[@id='j_idt87:city_items']/li[4]")).getText();
		if ((city1.contains("Bengaluru")) && (city2.contains("Chennai")) && (city3.contains("Delhi"))) {
			System.out.println("they are in India");

		}

		WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
		course.sendKeys("Playwright");
		driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[4]")).click();
		Thread.sleep(3000);

	}

}
