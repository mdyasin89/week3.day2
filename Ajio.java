package week3.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		// print the brand list
		String strLength = driver.findElement(By.className("length")).getText();
		System.out.println("Number of items " + strLength);
		System.out.println("list of Brands");
		List<WebElement> noOfbrands = driver.findElements(By.className("brand"));
		int countNoOfbrands = noOfbrands.size();
		System.out.println("Total number of Brand is " + countNoOfbrands);
		for (WebElement eachBrand : noOfbrands) {
			String brandName = eachBrand.getText();
			System.out.println("Brand" + brandName);
		}
		// print the bags list
		List<WebElement> noOfbags = driver.findElements(By.className("nameCls"));
		int countNoOfbags = noOfbags.size();
		System.out.println("Total number of Bags is " + countNoOfbags);
		System.out.println("Name of the Bags");
		for (WebElement eachBag : noOfbags) {
			String bagName = eachBag.getText();
			System.out.println("Bag Name is " + bagName);
		}

	}

}
