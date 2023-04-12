import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovmentCncept {
	
	public static void main(String[] args) throws InterruptedException {
		
	    // allow or block browser notifications script
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		conentSettings.put("geolocation",1);  // index 0 , 1 for allow, 2 for block
		profile.put("managed_default_content_settings", conentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);	
	    options.addArguments("----disable-notifications"); 
		options.addArguments("--disable-geolocation");  // use for loaction acces
		//options.addArguments("--disable-mic/camera"); // we can use this for mic or camera access
			
		WebDriverManager.chromedriver().setup(); // driver manager
		WebDriver driver = new ChromeDriver(options); //launch chrome
		
		driver.manage().window().maximize(); // maximization screen
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/"); // run url
		
		
		//checking for mousemovment useing action movetoelement
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/a/div/div")).click();
		
	
	}
	
}