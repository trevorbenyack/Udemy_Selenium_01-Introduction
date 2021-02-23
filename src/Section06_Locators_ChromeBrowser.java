import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section06_Locators_ChromeBrowser {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//trevorbenyack//Library//Mobile Documents//com~apple~CloudDocs//Coding//Selenium//Web Drivers//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		
		// FINDING ELEMENTS ON A PAGE
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		
		driver.findElement(By.name("pass")).sendKeys("password");
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
	}

}