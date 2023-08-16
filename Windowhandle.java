package week4day1Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowhandle {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Click and Confirm new Window Opens

		/*
		 * driver.findElement(By.xpath("//span[text()='Open']")).click();
		 * 
		 * Set<String> windowHandles = driver.getWindowHandles();
		 * 
		 * List<String> window = new ArrayList<String>(windowHandles);
		 * 
		 * driver.switchTo().window(window.get(1));
		 * 
		 * if (driver.getTitle().contains("Dashboard"))
		 * 
		 * System.out.println(driver.getTitle());
		 */

		// Find the number of opened tabs
		
		  driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		  
		  Set<String> windowHandles2 = driver.getWindowHandles();
		  
		  List<String> window2 = new ArrayList<String>(windowHandles2);
		  
		  System.out.println(window2.size());
		 

		
		
		//driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		

		}

	}


