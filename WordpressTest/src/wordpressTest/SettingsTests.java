package wordpressTest;

import static org.junit.Assert.*;

import org.junit.Test;

import wordpressAutomation.AddUserPage;
import wordpressAutomation.GeneralSettingsPage;
import wordpressAutomation.RoleType;



public class SettingsTests extends WordPressTest 
{
	@Test
	public void Can_Change_NewUser_DefaultRole()
	{

		GeneralSettingsPage.goTo();
		GeneralSettingsPage.changeNewUserDefaultRole(RoleType.CONTRIBUTOR);
		AddUserPage.goTo();
		assertEquals("Default role is not changed",AddUserPage.getRole(),RoleType.CONTRIBUTOR);
	}
	
}
