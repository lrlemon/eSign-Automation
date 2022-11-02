package Test;

import org.testng.annotations.Test;

import Base.Base;
import Pages.TC_CompletedSign;
import Pages.TC_SignIn;

public class TC_CompletedSignTest extends Base{
	@Test
	public void completedSign() throws InterruptedException{
		driver.get(loginUrl);
		
		TC_SignIn signin = homepage.SignInHome();
		Thread.sleep(3000);
		signin.enterEmailFunction("latifur.rahman@commlinkinfotech.com.bd");
        signin.enterPasswordFunction("Asd123456@!");
        signin.loginFunction();
        Thread.sleep(10000);
        
        
        
        
        TC_CompletedSign completedsign = homepage.completedSignHome();
        completedsign.signTaskFunction();
        completedsign.completedSignFunction();
        Thread.sleep(5000);
        completedsign.viewBbuttonFunction();
        Thread.sleep(15000);
        completedsign.backToCompletedListFunction();
        Thread.sleep(2000);
        completedsign.downloadButtonFunction();
        Thread.sleep(2000);
        completedsign.deleteButtonFunction();
        //driver.close();
	}

}
