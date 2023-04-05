import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MouseMovmentCncept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

      
        
        FirefoxOptions options = new FirefoxOptions(); // used to disable notification popup
        HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
        HashMap<String, Object> profile = new HashMap<String, Object>();
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        
        conentSettings.put("notifications",1);
        profile.put("managed_default_content_settings", conentSettings);
        prefs.put("profile", profile);
       // options.setExperimentalOption("prefs",prefs);
        options.setBinary("prefs");
        WebDriver driver = new FirefoxDriver();
        
//          options.addArguments("disable-notifications"); // used to disable notification popup
//          options.addArguments("disable-geolocation"); // used to disable geolocation popup
//          options.addArguments("disable-media-stream"); // used to disable media stream popup micke/camera
//           

		driver.manage().window().maximize(); //maximize window
		driver.get("https://www.spicejet.com/"); // enter url
		Thread.sleep(5000);

		
		
//		// Action class used to mause movment
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.className("Add-ons"))).build().perform();
	}

}
