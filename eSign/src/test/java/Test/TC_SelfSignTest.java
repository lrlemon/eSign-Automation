package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import Base.Base;
import Pages.TC_SelfSign;
import Pages.TC_SignIn;

public class TC_SelfSignTest extends Base {
	@Test
	public void selfSign() throws InterruptedException{
		driver.get(loginUrl);
		
		TC_SignIn signin = homepage.SignInHome();
        Thread.sleep(3000);
    
        signin.enterEmailFunction("latifur.rahman@commlinkinfotech.com.bd");
        signin.enterPasswordFunction("Asd123456@!");
        signin.loginFunction();
        Thread.sleep(10000);
        
        
        
        TC_SelfSign selfsign = homepage.selfSignHome();
        Thread.sleep(3000);   
        selfsign.signTaskFunction();
        Thread.sleep(3000);
        selfsign.newSelfSignFunction();
        Thread.sleep(10000);
        selfsign.pdfUploadFunction("C:\\\\Users\\\\lrlem\\\\Downloads\\\\SBI.pdf");
        Thread.sleep(5000);
        selfsign.nextButtonFunction();
        Thread.sleep(5000);
        selfsign.signatureFunction();
        selfsign.submitButtonFunction();
        Thread.sleep(5000);
        selfsign.approveSignatureFunction();
        Thread.sleep(5000);
        selfsign.selectEmailFunction();
        selfsign.sendOtpFunction();
        
        
        String winHandleBefore = driver.getWindowHandle();
		//Zimbra Login
		driver.switchTo().newWindow(WindowType.TAB);//open a new tab
		System.out.println("Opening a new tab...");
		driver.get("https://mail.commlinkinfotech.com.bd/#1");
		Thread.sleep(5000);
		selfsign.mailUsernameFunction("latifur.rahman@commlinkinfotech.com.bd");
		selfsign.mailPasswordFunction("L@7!f$m");
		selfsign.mailPasswordFunction();
		Thread.sleep(5000);
		
		
		//get OTP
		WebElement firstMail = driver.findElement(By.xpath("//td[@id='DWT7']/ul[@id='zl__CLV-main__rows']/li[1]/div/div[2]/div/span[2]"));
		String otp = firstMail.getText().replaceAll("[^0-9]", "").substring(0,6);
		System.out.println("Get the OTP and the OTP is "+otp);
		
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		System.out.println("Back to the first window");
		selfsign.otpFieldFunction(otp);
		Thread.sleep(2000);
		selfsign.verifyOtpButtonFunction();
		Thread.sleep(2000);
		selfsign.ekycPasswordFunction("Asdfzxcvbn123456@!");
		selfsign.passVerifyButtonPathFunction();
		System.out.println("Confirm the OTP and eKYC password");
		System.out.println("DONE!!!!!!!!!!");
		//driver.close();
        
        
        
        
        
	}

}
