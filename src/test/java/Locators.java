import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException  {
	
		
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver(); //launch firefox
		 
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		

		 // Handling dropdown we use SELECT CLASS 
		 
		 driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
		 Thread.sleep(15000);
		 driver.findElement(By.id("businessName")).sendKeys("jyoti");
		 driver.findElement(By.id("businessEmail")).sendKeys("jyotimake@gmail.com");
		 driver.findElement(By.id("bizPassword")).sendKeys("Test@123");
		 
		 Thread.sleep(5000);
		 Select select = new Select(driver.findElement(By.id("businessCountry")));
		 select.selectByVisibleText("India");
		 driver.findElement(By.id("bizOnlyToBuy")).click();
		 driver.findElement(By.id("BUSINESS_REG_FORM_SUBMIT")).click();
	}


}
