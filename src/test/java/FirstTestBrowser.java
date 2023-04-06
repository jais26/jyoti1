import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestBrowser {

	public static void main(String[] args) {
	
		
	/*	WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.operadriver().setup();
		WebDriverManager.chromiumdriver().setup();
		WebDriverManager.iedriver().setup(); */
		
		// using web driver manager we can directly acces any browser
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver(); //launch firefox
		 driver.get("https://google.com"); // enter url
		 String title = driver.getTitle(); // get title
		 System.out.println(title); // print title
		 // validation point
		 if(title.equals("Google")) {
			 
		  System.out.println("Correct title"); 
	}
		 else {
			 System.out.println("In-correct title");
		 }
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.quit(); // to close from browser automatically after run
	
	}

}
