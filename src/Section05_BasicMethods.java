import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section05_BasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Selenium code goes here
		
		// Step 1: invoke .exe file (browser can not be invoked externally 
		// -- must use .exe provided to Selenium by manufacturer)
		// chromedriver.exe was downloaded from the Selenium web site
		// use // (first one is an escape character
		System.setProperty("webdriver.chrome.driver", "//Users//trevorbenyack//Library//Mobile Documents//com~apple~CloudDocs//Coding//Selenium//Web Drivers//chromedriver");
		
		// Step 2: Create web driver object for Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// This opens the website in the Chrome browser
		driver.get("http://www.google.com");
		
		// Validates if page title is correct
		System.out.println(driver.getTitle());
		
		// validates whether landed on correct url
		System.out.println(driver.getCurrentUrl()); 
		
		// Gets page source
		System.out.println(driver.getPageSource());
		
		// redirects driver to yahoo
		driver.get("http://www.yahoo.com");
		
		// navigates driver to previous page
		driver.navigate().back();
		
		// navigates driver forward
		driver.navigate().forward();
		
		// closes current browser
		// this is recommended after test is completed b/c multiple windows can consume resources
		driver.close();
		
		// closes _all_ browser programs opened by selenium
		// used for when dealing with child (pop-up) windows
		driver.quit();
	}

}
