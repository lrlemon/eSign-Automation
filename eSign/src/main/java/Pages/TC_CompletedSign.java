package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_CompletedSign {
	WebDriver driver;
	
	public By signTaskPath =By.xpath("//span[contains(text(),'Sign Task')]");
	public By completedSignPath = By.xpath("//a[contains(text(),'Completed Sign')]");
	public By viewButtonPath = By.xpath("//button[contains(text(),'View')]");
	public By backToCompletedListPath = By.xpath("//button[@class='btn btn-secondary']");
	public By downloadButtonPath = By.xpath("//button[contains(text(),'Download')]");
	public By deleteButtonPath = By.xpath("//button[contains(text(),'Delete')]");
	
	
	
	
	
	public TC_CompletedSign(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void signTaskFunction(){
        driver.findElement(signTaskPath).click();
    }
	
	public void completedSignFunction() {
		System.out.println("Completed Sign start....");
		driver.findElement(completedSignPath).click();
	}
	
	public void viewBbuttonFunction() {
		driver.findElement(viewButtonPath).click();
	}
	
	public void backToCompletedListFunction() {
		driver.findElement(backToCompletedListPath).click();
	}
	
	public void downloadButtonFunction() {
		driver.findElement(downloadButtonPath).click();
	}
	
	public void deleteButtonFunction() {
		if(driver.findElement(deleteButtonPath).isEnabled()) {
			System.out.println("Delete Button is Enable");
		}
		else {
			System.out.println("Delete Button not Enable");
		}
		System.out.println("End the Completed Sign!!!!!");
	}
	
	
	
	
	
	
}
