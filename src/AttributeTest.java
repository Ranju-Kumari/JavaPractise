import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AttributeTest {

	WebDriver driver;
	
	@Test
	public void testAtrribute() {
		
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.healthline.com/health/breathing-exercises-for-anxiety");
		
		List<WebElement> ele = (List<WebElement>) driver.findElements(By.xpath("//iframe[starts-with(@id,'google_ads_')])"));
		System.out.println(ele.size());
		
		for(WebElement webEle : ele) {
			System.out.println(webEle.getAttribute("name"));
		}
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
