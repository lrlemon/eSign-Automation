package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_SelfSign {
	WebDriver driver;
	
	public By signTaskPath =By.xpath("//span[contains(text(),'Sign Task')]");
	public By newSelfSignPath = By.xpath("//a[contains(text(),'New Self Sign')]");
	public By pdfUploadPath = By.xpath("//input[@type='file']");
	public By nextButtonPath = By.xpath("//a[contains(text(),'Next')]");
	public By signaturePath = By.xpath("//p[contains(text(),' Signature ')]");
	public By submitButtonPath = By.xpath("//a[contains(text(),'Submit')]");
	public By approveSignaturePath = By.xpath("//button[contains(text(),' Approve The Signature')]");
	public By selectEmailPath = By.xpath("//input[@id='rbOtpChannel_0']");
	public By sendOtpPath = By.xpath("//input[@name='btnSendOtp']");
	//Zimbra mail login path
	public By mailUsernamePath = By.xpath("//input[@id='username']");
	public By mailPasswordPath = By.xpath("//input[@id='password']");
	public By mailLoginPath = By.xpath("//input[@value='Log In']");
	//again back to eSign and send otp
	public By otpFieldPath = By.xpath("//input[@name='txtPin']");
	public By verifyOtpButtonPath = By.xpath("//input[@name='btnVerifyPin']");
	public By ekycPasswordPath = By.xpath("//input[@id='txtPassword']");
	public By passVerifyButtonPath = By.xpath("//input[@id='btnVerifyPassword']");
	
	
	
	
	
	
	
	public TC_SelfSign(WebDriver driver){
        this.driver=driver;
    }

    public void signTaskFunction(){
        driver.findElement(signTaskPath).click();
    }
    
    public void newSelfSignFunction() {
    	System.out.println("Self Sign Start......");
    	driver.findElement(newSelfSignPath).click();
    }
    
    public void pdfUploadFunction(String pdf) {
    	driver.findElement(pdfUploadPath).sendKeys(pdf);
    }
    
    public void nextButtonFunction() {
    	driver.findElement(nextButtonPath).click();
    	System.out.println("Documnet Upload Completed");
    }
    
    public void signatureFunction() {
    	driver.findElement(signaturePath).click();
    }
    
    public void submitButtonFunction() {
    	driver.findElement(submitButtonPath).click();
    }
    
    public void approveSignatureFunction() {
    	driver.findElement(approveSignaturePath).click();
    	System.out.println("Approved the Signature");
    }
    
    public void selectEmailFunction() {
    	driver.findElement(selectEmailPath).click();
    }
    
    public void sendOtpFunction() {
    	driver.findElement(sendOtpPath).click();
    }
    
    //Zimbra mail function
    public void mailUsernameFunction(String mailUsername) {
    	driver.findElement(mailUsernamePath).sendKeys(mailUsername);
    }
    
    public void mailPasswordFunction(String mailPassword) {
    	driver.findElement(mailPasswordPath).sendKeys(mailPassword);
    }
    
    public void mailPasswordFunction() {
    	driver.findElement(mailLoginPath).click();
    }
    
    public void otpFieldFunction(String otpNum) {
    	driver.findElement(otpFieldPath).sendKeys(otpNum);
    }
    
    public void verifyOtpButtonFunction() {
    	driver.findElement(verifyOtpButtonPath).click();
    }
    
    public void ekycPasswordFunction(String ekycPass) {
    	driver.findElement(ekycPasswordPath).sendKeys(ekycPass);
    }
    
    public void passVerifyButtonPathFunction() {
    	driver.findElement(passVerifyButtonPath).click();;
    	System.out.println("End the Self Sign!!!!!");
    }
    
    
    
    
    
}
