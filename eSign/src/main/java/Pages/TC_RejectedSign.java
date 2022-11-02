package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_RejectedSign {
	WebDriver driver;
	
	
	public By signTaskPath =By.xpath("//span[contains(text(),'Sign Task')]");
	public By rejectedSignPath = By.xpath("//a[contains(text(),'Rejected Sign')]");
	public By rejectedSignListPath = By.xpath("//h3[contains(text(),' Rejected Sign List')]");
	
	
	public TC_RejectedSign(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signTaskFunction(){
        driver.findElement(signTaskPath).click();
    }
	
	public void rejectedSignFunction() {
		System.out.println("Rejected Sign Start.....");
		driver.findElement(rejectedSignPath).click();
	}
	
	public void rejectedSignListFunction() {
		
		if(driver.findElement(rejectedSignListPath).isDisplayed()) {
			
			System.out.println("Rejected Sign List Shown");
		}
		else {
			System.out.println("Rejected Sign List Not Shown");
		}
		System.out.println("End the Rejected Sign!!!!!");
	}
	
	
	
	
	
	
}
