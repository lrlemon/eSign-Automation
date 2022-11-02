package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_SigningDashboard {
	WebDriver driver;
	
	public By signPackageManagementPath = By.xpath("//span[contains(text(),'Sign Package Management')]");
	
	
	public TC_SigningDashboard(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signPackageManagementFunction() {
		System.out.println("Signing Dashboard Start...");
		driver.findElement(signPackageManagementPath).click();
	}

}
