package wordpressAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PostPage
{

	public static String Title;

	public static String getTitle()
	{
		WebElement title = Driver.Instance.findElement(By.className("entry-title"));
		if(title != null)
		{
			return title.getText();
		}
		return "";
		
	}

}
