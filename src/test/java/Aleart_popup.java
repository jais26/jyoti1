import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aleart_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver(); 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); // to check what text is written on alert or popup
		
		// we need test by applying validations using conditions
		String test = alert.getText();
		if(test.equals("please enter a valid user name")) {
			System.out.println("correct alert message");
		}else {
			System.out.println("in-correct alert message");
		}
		
	
		alert.accept();  // click on ok btn
	   // alert.dismiss(); //  clck on cancel btn
	
	
	}

}
