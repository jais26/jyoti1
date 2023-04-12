import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateBackAndForward {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // driver manager
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); // maximization screen
		driver.manage().deleteAllCookies();  // delete all cookies.
		driver.get("http://www.google.com/"); // run url
		
		driver.navigate().to("http://www.amazon.com/");
		driver.navigate().back();   // click to forward icon
		Thread.sleep(2000);
		driver.navigate().forward(); // click to back icon
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
