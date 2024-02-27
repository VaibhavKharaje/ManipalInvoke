package Testng.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invokechrome {
	
	@Test
	public void c() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.selenium.dev");
	}

}
