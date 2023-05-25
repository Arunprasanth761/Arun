package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectComponents {

	public static void main(String[] args) throws InterruptedException {

		    ChromeDriver driver = new ChromeDriver();
		    driver.get("http://www.leafground.com/select.xhtml");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		    // Box1 - Tool
		    WebElement tool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		    Select toolInput = new Select(tool);
		    toolInput.selectByIndex(1);

		    // Box2 - Country
		    WebElement country = driver.findElement(By.id("j_idt87:country_label"));
		    country.click();
		  
		    WebElement countryIP = driver.findElement(By.xpath("//li[@data-label='India']"));
		    countryIP.click();
		  

		    // Box3 - City
		    Thread.sleep(3000);
		    WebElement city = driver.findElement(By.id("j_idt87:city_label"));
		    city.click();
		    String city1 = driver.findElement(By.xpath("//ul[@id='j_idt87:city_items']/li[2]")).getText();
		    String city2 = driver.findElement(By.xpath("//ul[@id='j_idt87:city_items']/li[3]")).getText();
		    String city3 = driver.findElement(By.xpath("//ul[@id='j_idt87:city_items']/li[4]")).getText();
		    if ((city1.contains("Bengaluru"))&&(city2.contains("Chennai"))&&(city3.contains("Delhi"))) {
		    	System.out.println("they are in India");
				
			}


		    // Box4 - Course
		    WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
		    course.sendKeys("Playwright");
		    driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[4]")).click();
		    Thread.sleep(3000);

		    // Box5 - Language
		    WebElement lang = driver.findElement(By.id("j_idt87:lang_label"));
		    lang.click();
		    Thread.sleep(3000);
		    WebElement langIP = driver.findElement(By.xpath("//li[text()='English']"));
		    langIP.click();

		    // Box6 - OddLanguage
		    Thread.sleep(3000);
		    WebElement OddLang = driver.findElement(By.id("j_idt87:value_label"));
		    OddLang.click();
		    
		    WebElement OddLangIP = driver.findElement(By.id("j_idt87:value_3"));
		    OddLangIP.click();

	}

}
