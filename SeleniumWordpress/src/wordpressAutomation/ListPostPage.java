package wordpressAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListPostPage
{
	private static Integer lastCount;
	public static Integer currentPostCount;
	public static int getCurrentPostCount()
	{
		return getPostCount();
	}
	public static Integer previousPostCount;
	public static int getPreviousPostCount()
	{
		return lastCount;
	}


	public static void GoTo(PostType postType)
	
	{
		// TODO Auto-generated method stub
		switch(postType)
		{
		case PAGE:
		Driver.Instance.findElement(By.id("menu-pages")).click();
		Driver.Instance.findElement(By.linkText("All pages")).click();
		break;
		
		case POSTS:
			break;
			
		default:
			break;
		}
		
	}
	
	public static void SelectPost(String title)
	{
		// TODO Auto-generated method stub
		WebElement postLink = Driver.Instance.findElement(By.id("Sample Page"));
		postLink.click();
		
	}
	
	public static void StoreCount() 
	{
	// TODO Auto-generated method stub
    	lastCount = getPostCount();
	    
	}
	
	private static Integer getPostCount() {
		return currentPostCount;
		// TODO Auto-generated method stub
		//code to get the post count using selenium
	}

	public static boolean DoesPostExistWithTitle(String string)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void Clear(String string) {
		// TODO Auto-generated method stub
		
	}




}



	
