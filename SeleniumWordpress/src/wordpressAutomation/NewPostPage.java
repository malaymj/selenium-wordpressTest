package wordpressAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewPostPage
{

	public static void GoTo()
	{
		// TODO Auto-generated method stub
		/*LeftNavigation.Posts.AddNew.Select();
		 * leftNavigation class to be made,with posts as nested class,and add new as nested to posts
		 * Select method will contain the code to identify and click
		 * Subsequently Menu selector will also be created and the select method above
		 * will only pass the identifiers as arguments and menu selector will complete the work
		 */
		WebElement menuPosts = Driver.Instance.findElement(By.id("menu.posts"));
		menuPosts.click();
		WebElement addNew = Driver.Instance.findElement(By.linkText("Add New"));
		addNew.click();	
	}

	public static CreatePostCommand CreatePost(String postTitle)
	{
		// TODO Auto-generated method stub
		return new CreatePostCommand(postTitle);
		
	}
	
	public static class CreatePostCommand
	{
		private String postTitle;
		private String body;

		public CreatePostCommand(String postTitle)
		{
			// TODO Auto-generated constructor stub
			this.postTitle = postTitle;
			
		}

		public CreatePostCommand WithBody(String body)
		{
			// TODO Auto-generated method stub
			this.body = body;
			return this;
		}

		public void Publish() throws InterruptedException
		{
			// TODO Auto-generated method stub
			WebElement titleArea = Driver.Instance.findElement(By.id("title"));
			titleArea.sendKeys("postTitle");
			Driver.Instance.switchTo().frame("content_ifr");
			Driver.Instance.switchTo().activeElement().sendKeys("body");
			Driver.Instance.switchTo().defaultContent();
			Thread.sleep(1000);
			Driver.Instance.findElement(By.id("publish")).click();

		}

		
	}

//	public static void GoTo()
//	{
//		// TODO Auto-generated method stub
//		WebElement message = Driver.Instance.findElement(By.id("message"));
//	    WebElement newPostLink = message.findElement(By.tagName("a"));
//		newPostLink.click();
//		
//	}
	
	public static Boolean IsInEditMode(){
		return Driver.Instance.findElement(By.id("icon-edit-pages"))!=null;
		
	}

	public static void GoToNewPost() {
		// TODO Auto-generated method stub
		
	}

}
