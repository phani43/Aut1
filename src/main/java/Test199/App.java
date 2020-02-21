package Test199;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
        
   	 String exePath = "F:\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", exePath);
	 
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("disable-infobars"); 
	 
	 WebDriver driver = new ChromeDriver(options);
	 
	 driver.get("http://localhost:4200/#/login"); 
	 driver.manage().window().maximize();
	 
	 WebElement un = driver.findElement(By.id("username"));	
	 WebElement pw = driver.findElement(By.id("password"));	
	 
	 un.sendKeys("admin");					
     pw.sendKeys("lincoln");
     //Thread.sleep(4000);
     
     driver.findElement(By.id("loginBtn")).click();
     Thread.sleep(4000);
    }
}
