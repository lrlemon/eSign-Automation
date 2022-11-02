package Test;

import org.testng.annotations.Test;

import Base.Base;
import Pages.TC_SignIn;
import Pages.TC_SigningDashboard;

public class TC_SigningDashboardTest extends Base{
	@Test
	public void myDocuments() throws InterruptedException{
		driver.get(loginUrl);
		
		TC_SignIn signin = homepage.SignInHome();
		Thread.sleep(3000);
		signin.enterEmailFunction("latifur.rahman@commlinkinfotech.com.bd");
        signin.enterPasswordFunction("Asd123456@!");
        signin.loginFunction();
        Thread.sleep(10000);
        
        
        TC_SigningDashboard signingdashboard = homepage.signingDashboardHome();
        signingdashboard.signPackageManagementFunction();
        //driver.close();
        
	}

}
