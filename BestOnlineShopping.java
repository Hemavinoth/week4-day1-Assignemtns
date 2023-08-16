package week4day1Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BestOnlineShopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/HemalathaA/eclipse-workspace/TestLeaf");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.findElement(By.xpath("(//div[@class='product-image'])[1]")).click();

		// Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("637002");

		WebElement findElement = driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']//input"));

		driver.executeScript("arguments[0].click();", findElement);

		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

		WebElement findElement1 = driver.findElement(By.xpath("//a[text()='View Cart']"));

		driver.executeScript("arguments[0].click();", findElement1);

		driver.findElement(By.id("checkout")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		System.out.println(text);

		alert.accept();

	}

}
