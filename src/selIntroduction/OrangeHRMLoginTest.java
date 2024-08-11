package selIntroduction;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshan\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		
//		  System.out.println("Chrome-Working Fine");
//		  ChromeDriver driver = new ChromeDriver();
		
//		 FirefoxDriver driver = new FirefoxDriver();
		
		EdgeDriver driver = new EdgeDriver();
		//Convenient
//		  driver.get("https://selenium.dev");
		  
//		  driver.close();

		  //Longer way
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(5000);
		  
		  System.out.println("Driver-Working Fine");
		  
//		  driver.close();
		  
		  //3) Provide username - Admin
//		  WebElement txtUsername = (WebElement) driver.findElements(By.name("username"));
//		  txtUsername.sendKeys("Admin");
		  
		  driver.findElement(By.name("username")).sendKeys("Admin");
//         find element find the element based on By.name locater	
		  
//		  4) Provide password - admin123
		  driver.findElement(By.name("password")).sendKeys("admin123");//admin123
		  
//		  5) Click on Submit button
		  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(7000);
		  
//		  6) Verify the title of dashboard page
//		 String act_title =  driver.getTitle();
//		 String exp_title = "OrangeHRM";
		 
//		 if (act_title.equals(exp_title)) 
//		 {
//			System.out.println("Test Passed");
//		 } 
//		 else 
//		 {
//			 System.out.println("Failed");
//		 }/
		 
//		 Lable Validation after successful login
		  
		  String act_label = " ";
		  
		  try 
		  {
			  
		  WebElement act_label_ele = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		  
		  act_label = act_label_ele.getText();
			  
		  } 
		  catch (NoSuchElementException e) 
		  {			 
			  act_label = "";
		  }
		 
		String exp_label = "Dashboard";
		
		if (act_label.equals(exp_label)) 
		{
			System.out.println("test passed");
			
		} 
		else 
		{
			System.out.println("test failed");

		}
		 
		  
//		 7) Close Browser 
//		 driver.close();	
		 
//		 System.out.println("Test Passed Successfully");
		 Thread.sleep(5000);
		 driver.quit();
		 
	}

}
