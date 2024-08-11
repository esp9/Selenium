package selIntroduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new EdgeDriver();
		
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

}
