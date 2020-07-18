package wordpressTest;


import static junit.framework.Assert.*;

import org.junit.Test;

import wordpressAutomation.ListPostPage;
import wordpressAutomation.NewPostPage;
import wordpressAutomation.PostType;

public class AllPostsTests extends WordPressTest{
	
	@SuppressWarnings("deprecation")
	@Test
	public void Added_Posts_Show_Up() throws Exception
	{
		//Go to posts ,get post count,store
		ListPostPage.GoTo(PostType.POSTS);
		ListPostPage.StoreCount();
		
		
		//Add a new post
		NewPostPage.GoTo();
		NewPostPage.CreatePost("This is a new post for testing All posts")
		           .WithBody("this is the body for all posts page")
		           .Publish();
		
		
		//Go to posts,get new post count
		ListPostPage.GoTo(PostType.POSTS);
		
		assertEquals("The current count is not correct",ListPostPage.getPreviousPostCount() +1, ListPostPage.getCurrentPostCount());
		
		//ListPostPage.StoreCurrentCount();
		
		//Check for added post
		assertEquals("new added post does not exist", ListPostPage.DoesPostExistWithTitle("This is a new post for testing new posts"));
		
		
		//Trash post(clean up)
		ListPostPage.Clear("This is a new post for testing new posts");
	}

}
