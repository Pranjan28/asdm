import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.junit.Assert;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

		// Create an instance of the driver
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

		// Navigate to a web page
		driver.get("http://www.facebook.com");

		// Perform actions on HTML elements, entering text and submitting the form
		WebElement usernameElement1 = driver.findElement(By.name("firstname"));
		WebElement usernameElement2 = driver.findElement(By.name("lastname"));
		WebElement emailElement1 = driver.findElement(By.name("reg_email__"));
		WebElement emailConfirmElement1 = driver.findElement(By.name("reg_email_confirmation__"));
		WebElement passwordElement = driver.findElement(By.name("reg_passwd__"));
		//WebElement radiofemale = driver.findElement(By.id("u_0_9"));
		WebElement radiomale = driver.findElement(By.id("u_0_a"));

		WebElement formElement = driver.findElement(By.id("u_0_13"));
		
		Select dayElement = new Select(driver.findElement(By.id("day")));

		usernameElement1.sendKeys("Arnold");
		usernameElement2.sendKeys("Schwargnegger");
		emailElement1.sendKeys("yo@yo.com");
		emailConfirmElement1.sendKeys("yo@yo.com");
		passwordElement.sendKeys("twilightZone");
		radiomale.click();
		dayElement.selectByVisibleText("12");  
		
		formElement.click(); // submit by form element
		
		//WebElement header = driver.findElements();
		
		// Anticipate web browser response, with an explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.wait(100000);

		// Run a test
		// String message = messageElement.getText();
		String successMsg = "Welcome to foo. You logged in successfully.";
		// Assert.assertEquals (message, successMsg);

		// Conclude a test
		driver.quit();

	}
}
