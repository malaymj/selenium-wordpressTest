package wordpressAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewUserPage
{

	public static void GoTo() {
		// TODO Auto-generated method stub
		Driver.Instance.navigate().to(Driver.baseAddress + "wp-admin/user-new.php");
		WebDriverWait wait = new WebDriverWait(Driver.Instance, 5);
		//wait.until();
		
	}

	public static NewUserPageCommand CreateNewUsername(String userName) {
		// TODO Auto-generated method stub
		
		return new NewUserPageCommand(userName);
	}
	
	public static class NewUserPageCommand
	{

		private String userName;
		private String emailId;

		public NewUserPageCommand(String userName) {
			// TODO Auto-generated constructor stub
			this.userName = userName;
			
		}

		public NewUserPageCommand WithEmail(String emailId) {
			// TODO Auto-generated method stub
			this.emailId = emailId;
			return this;
		}

		public void AddNew() 
		{
			// TODO Auto-generated method stub
			WebElement user = Driver.Instance.findElement(By.id("user_login"));
			user.sendKeys(userName);
			WebElement emailId = Driver.Instance.findElement(By.id("email"));
			emailId.sendKeys(this.emailId);
			WebElement addNewUser = Driver.Instance.findElement(By.id("createusersub"));
			addNewUser.click();
		
		}
		
		
	}

	public static void GoToAllUsers()
	{
		// TODO Auto-generated method stub
		Driver.Instance.navigate().to(Driver.baseAddress + "wp-admin/users.php");
		WebDriverWait wait = new WebDriverWait(Driver.Instance, 5);
		//wait.until(arg0);	
	}



}
