package Test;

import org.testng.annotations.Test;

import Base.Base;
import Pages.TC_MyDocuments;
import Pages.TC_SignIn;

public class TC_MyDocumentsTest extends Base {
	@Test
	public void myDocuments() throws InterruptedException{
		driver.get(loginUrl);
		
		TC_SignIn signin = homepage.SignInHome();
		Thread.sleep(3000);
		signin.enterEmailFunction("latifur.rahman@commlinkinfotech.com.bd");
        signin.enterPasswordFunction("Asd123456@!");
        signin.loginFunction();
        Thread.sleep(10000);
        
        
        TC_MyDocuments mydocuments = homepage.myDocumentsHome();
        mydocuments.myDocumentsFunction();
        Thread.sleep(2000);
        mydocuments.archiveSignListFunction();
        //driver.close();
        
        
        
        
        
	}

}
