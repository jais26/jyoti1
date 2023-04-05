import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class test {

	public static void main(String[] args) throws InterruptedException {
		

		
			
			
			
		
			 WebDriver driver = new FirefoxDriver(); //launch firefox
			 
//			 Screen s=new Screen();
//			 s.click();
//			 s.rightClick("test.png");
//	         s.find("test.png");  
//			 s.doubleClick("test.png");
//			 s.exists("test.png");
//			 s.type("test.png","hiii!!!");
//			 s.wheel("test.png",25,0);
//			 s.dragDrop("test.png","test1.png");
//			 s.hover("test.png");
//			 s.paste("test.png","test");
			 Thread.sleep(2000);
			 driver.manage().window().maximize();
			
			 driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F"); // enter url
			 Thread.sleep(15000); 
			 driver.findElement(By.xpath("(//input[@name='accountcreate'])[1]")).click();
			 
			 Thread.sleep(2000);
		
	}

}
