import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // driver manager
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); // maximization screen
		driver.manage().deleteAllCookies();  // delete all cookies.
		driver.get("http://www.ajtak.in/"); // run url
		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("*//input[contains(@name,'loginEmail')]")).sendKeys("jyoti@yopmail.com");
//		driver.findElement(By.xpath("*//input[contains(@name,'loginPass')]")).sendKeys("123456");
//		driver.findElement(By.xpath("*//button[contains(@text,'')]")).click();
//		
		// 1. get the total count of links on the page
		// 2.get the text of each link on the page
		
		List<org.openqa.selenium.WebElement> linkList = driver.findElements(By.tagName("a"));   // a for all links
		// List <WebElement> linkList = (List<WebElement>) driver.findElement(By.tagName("buttons"));   // a for all buttons
        // 		List <WebElement> linkList = (List<WebElement>) driver.findElement(By.tagName("input"));   // a for all links
        
		System.out.println(linkList.size()); // size of linklist:
		
		for(int i=0; i<linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		
		
	}

}
