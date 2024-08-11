package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsDemp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//CSS with tag & id
//		drive.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		//Tag and class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		//tag & attribute
//		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
//		driver.findElement(By.cssSelector("[name='q']")).sendKeys("MacBook");
		
		//tag class & attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Macbook");
		
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		driver.close();
	}

}
