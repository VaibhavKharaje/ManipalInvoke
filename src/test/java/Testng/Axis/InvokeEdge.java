package Testng.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvokeEdge {
	
	@Test
	public void k() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
	    driver.get("https://www.selenium.dev");

	}

}
