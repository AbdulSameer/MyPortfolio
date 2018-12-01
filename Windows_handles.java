package abc;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handles 
{
	
public static void main(String ar[]) throws Exception

  {
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "F:\\selenium lib\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://demo.guru99.com/popup.php");
	String parentwindow=driver.getWindowHandle();
	System.out.println(parentwindow);
	
	driver.findElement(By.linkText("Click Here")).click();
	
	Set<String> allwindows=driver.getWindowHandles();
	System.out.println(allwindows);
	
	Object[] windows=allwindows.toArray();
	String window1=windows[0].toString();
	String window2=windows[1].toString();
	
	driver.switchTo().window(window2);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
	Thread.sleep(3000);
	
	driver.switchTo().window(window1);
	driver.findElement(By.className("dropdown-toggle")).click();
	Thread.sleep(2000);
	driver.quit();
  }

}
