import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); // driver manager
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); // maximization screen
		driver.manage().deleteAllCookies();  // delete all cookies.
		driver.get("https://jqueryui.com/droppable/"); // run url
		
		Thread.sleep(3000);
		
		// if frame not available then we don't need to write this switch frame
		driver.switchTo().frame(0); // if there frame available we need to add this and ineing based on frames available,
		
		Actions action = new Actions(driver);  // for drag and drop action
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

		// bellow is the explanation gow it works
//		action.clickAndHold(driver.findElement(By.id("draggable")))  // when we drag n drop we need to 1st click and hold mouse, so we used this
//		.moveToElement(driver.findElement(By.id("droppable"))) //after holding mouse we move to the place where we want to drag m that element so we use move to element
//		.release() // after moving we realase mouse to drop so we used realese
//		.build()
//		.perform();
		
		
	}

}
