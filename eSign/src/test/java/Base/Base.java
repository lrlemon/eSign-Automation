package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.Homepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Homepage homepage;
	
	public static String loginUrl = "https://dms.ecipher.co/login";
	
	
	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		homepage = new Homepage(driver);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}

