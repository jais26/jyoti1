import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // driver manager
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); // maximization screen
		driver.manage().deleteAllCookies();  // delete all cookies.
		driver.get("http://dev.getcreator.in/"); // run url
		
		// Implicit wait is used where, if any website is heavy or taking too much time to load full page, then we can use implicit wait
		
		// it is dyanamic like if page loads in 10 sec bt we have added 30 sec then rest 20 sec will be ignored that's y we use this
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // it is fro pageloading time 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // useing that is some button is not available after loading and taking timw to load few deatils then we use implicit wait
		
		
	}

}
