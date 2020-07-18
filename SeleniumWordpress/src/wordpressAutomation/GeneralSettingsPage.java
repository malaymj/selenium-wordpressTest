package wordpressAutomation;

public class GeneralSettingsPage {

	
	public static void goTo() {
		// TODO Auto-generated method stub
		Driver.Instance.navigate().to(Driver.getBaseAddress() +"wp-admin/options-general.php");
	}

	public static void changeNewUserDefaultRole(RoleType role) {
		// TODO Auto-generated method stub
		switch(role)
		{
		case  CONTRIBUTOR:
			
		default:
			break;
		}
		
	}
	
	
}
