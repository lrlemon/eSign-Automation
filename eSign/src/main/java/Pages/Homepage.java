package Pages;

import org.openqa.selenium.WebDriver;

public class Homepage {
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public TC_SignIn SignInHome() {
		return new TC_SignIn(driver);
	}
	
	public TC_SelfSign selfSignHome() {
		return new TC_SelfSign(driver);
	}
	
	public TC_CompletedSign completedSignHome() {
		return new TC_CompletedSign(driver);
	}
	
	public TC_RejectedSign rejectedSignHome() {
		return new TC_RejectedSign(driver);
	}
	
	public TC_MyDocuments myDocumentsHome() {
		return new TC_MyDocuments(driver);
	}
	
	public TC_SigningDashboard signingDashboardHome() {
		return new TC_SigningDashboard(driver);
	}



}
