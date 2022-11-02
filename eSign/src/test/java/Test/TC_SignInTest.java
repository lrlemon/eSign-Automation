package Test;

import org.testng.annotations.Test;

import Base.Base;
import Pages.TC_SignIn;

public class TC_SignInTest extends Base{
	@Test
	public void signIn() throws InterruptedException {
        driver.get(loginUrl);

        TC_SignIn signin = homepage.SignInHome();
        Thread.sleep(3000);

        signin.enterEmailFunction("latifur.rahman@commlinkinfotech.com.bd");
        signin.enterPasswordFunction("Asd123456@!"); 
        signin.loginFunction();
        Thread.sleep(10000);
        //driver.close();

    }
}
