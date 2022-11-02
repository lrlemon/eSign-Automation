package Test;

import org.testng.annotations.Test;

import Base.Base;
import Pages.TC_RejectedSign;
import Pages.TC_SignIn;

public class TC_RejectedSignTest extends Base{
	@Test
	public void rejectedSign() throws InterruptedException{
		driver.get(loginUrl);
		
		TC_SignIn signin = homepage.SignInHome();
		Thread.sleep(3000);
		signin.enterEmailFunction("latifur.rahman@commlinkinfotech.com.bd");
        signin.enterPasswordFunction("Asd123456@!");
        signin.loginFunction();
        Thread.sleep(10000);
        
        
        
        
        
        TC_RejectedSign rejectedsign = homepage.rejectedSignHome();
        rejectedsign.signTaskFunction();
        Thread.sleep(1000);
        rejectedsign.rejectedSignFunction();
        Thread.sleep(2000);
        rejectedsign.rejectedSignListFunction();
        //driver.close();
	}

}
