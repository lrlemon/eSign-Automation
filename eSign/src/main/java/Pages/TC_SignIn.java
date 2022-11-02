package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_SignIn {
	WebDriver driver;
	
	public By emailPath = By.xpath("//input[@name='username']");
	public By passwordPath = By.xpath("//input[@name='password']");
	public By signInButtonPath = By.xpath("//button[@type='submit']");
	
	
	public TC_SignIn(WebDriver driver){
        this.driver=driver;
    }

    public void enterEmailFunction(String text) {
    	System.out.println("Sign In start....");
        driver.findElement(emailPath).sendKeys(text);
    }

    public void enterPasswordFunction(String pass) {
        driver.findElement(passwordPath).sendKeys(pass);
    }

    public void loginFunction() {
        driver.findElement(signInButtonPath).click();
        System.out.println("End the Sign In");
    }
}
