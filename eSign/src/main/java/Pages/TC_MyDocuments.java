package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_MyDocuments {
	WebDriver driver;
	
	public By myDocumentsPath = By.xpath("//span[contains(text(),'My Documents')]");
	public By archiveSignListPath = By.xpath("//h3[contains(text(),' Archive Sign List')]");
	
	
	public TC_MyDocuments(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void myDocumentsFunction() {
		driver.findElement(myDocumentsPath).click();
	}
	
	public void archiveSignListFunction() {
		
		if(driver.findElement(archiveSignListPath).isDisplayed()){
			
			System.out.println("Archive Sign List Shown");
		}
		else {
			System.out.println("Archive Sign List Shown");
		}
	}
	
	
	
	
}
