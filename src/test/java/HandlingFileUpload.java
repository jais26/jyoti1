import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver(); 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/"); 
	
		// for uploadin path we need to upload file path
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Cliffex-Lead\\Downloads\\images.jpg");
	
	}
	
	

}
