import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // driver manager
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); // maximization screen
		driver.manage().deleteAllCookies();  // delete all cookies.
		driver.get("http://dev-admin.getcreator.in/"); // run url
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("*//input[contains(@name,'loginEmail')]")).sendKeys("jyoti@yopmail.com");
		driver.findElement(By.xpath("*//input[contains(@name,'loginPass')]")).sendKeys("123456");
		driver.findElement(By.xpath("*//button[contains(@text,'')]")).click();
		
		/* Absolute xpath don't use
		 1. performance issue
		 2. not reliable
		 3. can be changed at any time
		
		 /html/body/div/section/div/div/div/form/button
		 1)  //input[@class='actextbox']"
		 2) //input[@name='user']"
		 3) //input[contains(@class,'checkbox')]"
		 
		 // dynamic id: input
		 4) id = test_123
		 5) by.id("test_123")
		 
		 // starts-with
		  6)id = test_456
		  7)id = test_789
		  8)id = test_test_789_test
		  
		  // ends-with
		   9) id = 123_test_t
		   10) id = 6578_test_t
		   11) id = 6767_test_6767_test
		   // use this 
		    //input[contains(@id,'test_')]
		    //input[starts-with(@id,'test_')]
		    //input[ends-with(@id,'_test_t)]
		   
		   // for links: custome xpath  
		  //a[contains(text(),'my account')]
		  
		  */
		
		
		

		
	}

}
