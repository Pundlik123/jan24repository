package seleniumupsBaselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\seleniumguru99\\alldrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		}

}
