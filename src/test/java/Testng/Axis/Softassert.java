package Testng.Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	
	
	@Test
	public void testofassert() throws InterruptedException {
		SoftAssert st=new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(500);
		  driver.manage().window().maximize();
		  String actualtitle = driver.getTitle();
		  String expectedTitle = "Orange";
		  st.assertEquals(actualtitle,expectedTitle);
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  driver.close();
		  
	}

}
