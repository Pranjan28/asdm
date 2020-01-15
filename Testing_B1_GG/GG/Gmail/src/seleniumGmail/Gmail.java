package seleniumGmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&dsh=S17128306%3A1579089509540741&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement fname = driver.findElement(By.id("firstName"));
		WebElement lname = driver.findElement(By.id("lastName"));
		WebElement usrname = driver.findElement(By.name("Username"));
		WebElement pass = driver.findElement(By.name("Passwd"));
		WebElement cpass = driver.findElement(By.name("ConfirmPasswd"));
		WebElement next = driver.findElement(By.id("accountDetailsNext"));
		
		fname.sendKeys("Garima");
		lname.sendKeys("Gupta");
		usrname.sendKeys("GG12345h2");
		pass.sendKeys("gggg@1234");
		cpass.sendKeys("gggg@1234");
		next.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.wait(100000);

		// Run a test
		// String message = messageElement.getText();
		String successMsg = "Welcome to foo. You logged in successfully.";
		System.out.println(successMsg);
		// Assert.assertEquals (message, successMsg);

		// Conclude a test
		driver.quit();

		
		
	
	}
	

}
 