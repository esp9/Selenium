package selIntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		 
		
		WebDriver driver = new ChromeDriver();
		
		//Open App
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize(); // maximize browser window
		
		//search box 
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.manage().window().maximize();
		
		//search box 
		driver.findElement(By.name("submit_search")).click();
		
		//link text
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		Thread.sleep(7000);
		
		driver.close();
		
		
	}

}
