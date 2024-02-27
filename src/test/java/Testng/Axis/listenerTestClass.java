package Testng.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(listnerClass.class)
public class listenerTestClass {
	
	@Test
	public void invokechrome() {
		
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		
	
		
		driver.get("https://www.selenium.dev/");
		
		
		
		
		
		
	}
	
	
	

}
