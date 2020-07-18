package wordpressAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static WebDriver Instance;
	
	public static WebDriver getInstance() {
		
		return Instance;
	}

//	public static void setInstance(WebDriver instance) {
//		Instance = instance;
//	}
	
	public static String baseAddress;

	public static String getBaseAddress() {
		return "localhost:4462/";
	}

	public static void initialize()
	{
		Instance = new FirefoxDriver();
		Instance.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}


}
