package wordpressAutomation;

import java.util.List;

import org.openqa.selenium.By;

public class DashboardPage {

	public static boolean IsAt;
	
	public boolean getIsAt()
	{
		List h2s = Driver.Instance.findElements(By.tagName("h2"));
		if (h2s.size() > 0)
			{
				return h2s.get(0) == "Dashboard";
			}	
		return false;
		
	}

}