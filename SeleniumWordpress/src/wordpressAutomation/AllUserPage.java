package wordpressAutomation;

import org.openqa.selenium.By;

public class AllUserPage {


	public static boolean DoesUsernameExistAs(String userToCheck) {
		// TODO Auto-generated method stub
		return Driver.Instance.findElement(By.id(userToCheck)) != null;
	}

}
