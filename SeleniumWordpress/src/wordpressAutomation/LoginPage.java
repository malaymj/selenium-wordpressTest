package wordpressAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{

	public static void GoTo()
	{
		// TODO Auto-generated method stub
		Driver.Instance.navigate().to(Driver.baseAddress + "wp-login.php");
		WebDriverWait wait = new WebDriverWait(Driver.Instance, 5);
		//wait.until(arg0)
		//WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("localhost:4462/wp-login.php");	
	}

	public static LoginCommand LoginAs(String userName)

	{
		// TODO Auto-generated method stub
		return new LoginCommand(userName);
	}
	
	public static class LoginCommand
	
	{
		private String userName;
		private String password;
		public LoginCommand(String userName)
		{
			this.userName = userName;
		}
		public LoginCommand WithPassword(String password)
		{
			// TODO Auto-generated method stub
			this.password = password;
			return this;
		}
		public void Login()
		{
			// TODO Auto-generated method stub
			WebElement loginInput = Driver.Instance.findElement(By.id("user_login"));
			loginInput.sendKeys(userName);
			
			WebElement loginPassword = Driver.Instance.findElement(By.id("user_pass"));
			loginPassword.sendKeys(password);
			
			WebElement loginButton = Driver.Instance.findElement(By.id("wp-input"));
			loginButton.click();
			
			
		}
	}

}
