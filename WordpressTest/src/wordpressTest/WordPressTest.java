package wordpressTest;

import org.junit.Before;

import wordpressAutomation.Driver;
import wordpressAutomation.LoginPage;

public class WordPressTest {

	@Before
	public void Init()
	{
		Driver.initialize();
		//LoginPage.GoTo();
		//LoginPage.LoginAs("ca.sksaumya").WithPassword("0589kali").Login();
	}
}
