package Testng.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	@Parameters("Browser")
	public void paramtererized(String browser)
	{
		if (browser.equals("chrome")) 
			
			
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.get("https://www.selenium.dev");
			
		}
	
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			  WebDriver driver = new EdgeDriver();
		    driver.get("https://www.selenium.dev");
		}

}
