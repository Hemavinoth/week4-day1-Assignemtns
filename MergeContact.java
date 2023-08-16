package week4day1Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		driver.findElement(By.xpath("(//table[@widgetid='ComboBox_partyIdTo'])/following::img")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> newone = new ArrayList<String>(windowHandles);

		WebDriver newwindow = driver.switchTo().window(newone.get(1));

		System.out.println(newwindow.getTitle());
		
		driver.findElement
		(By.xpath("//span[text()='Contact List']/following::table[2]//div[contains(@class,'partyId')]/a")).click();
		
		
		driver.switchTo().window(newone.get(0));
		
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//table[@widgetid='ComboBox_partyIdTo'])/following::img")).click();
		
		
		Thread.sleep(200);

		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> secondone = new ArrayList<String>(windowHandles2);
		
		driver.switchTo().window(secondone.get(1));
		
		driver.findElement(
				By.xpath("//span[text()='Contact List']/following::table[3]//div[contains(@class,'partyId')]/a"))
				.click();
		
		driver.switchTo().window(newone.get(0));
		
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("Merge Contacts"))
			
			System.out.println(driver.getTitle());
		else
			
			System.out.println("wrong page");

		
		
		
		
		
		
		
		
	}

}
