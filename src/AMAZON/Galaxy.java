package AMAZON;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;


public class Galaxy {
	
	

	@Test
	public void galaxy() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); // This is enough!
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions actions = new Actions(driver);
		
		
		 driver.get("https://www.amazon.com/");
		 driver.findElement(By.xpath("//div[@id='icp-nav-flyout']/button")).click();
		 driver.findElement(By.xpath("//div[@class='icp-mkt-change-lnk']")).click();
		 driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
		
		 driver.findElement(By.xpath("//a[@id='icp-dropdown_8']")).click();
		 
		 Thread.sleep(5);
		 driver.findElement(By.xpath("//span[@id='icp-save-button']")).click();
		 
		 Set<String>windows=driver.getWindowHandles();
		 Iterator<String>name=windows.iterator();
		 String parentID=name.next();
		 String chikdID=name.next();
		 
		 driver.switchTo().window(chikdID);
		 
		 
         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Galaxy");
         driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
         driver.findElement(By.xpath("//button[@name='submit.addToCart']")).click();
         String price=driver.findElement(By.xpath("//span[@class='a-price']")).getText();
         System.out.println(price);
        
         
         
        

	}

}



