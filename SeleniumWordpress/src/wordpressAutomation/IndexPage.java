package wordpressAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IndexPage {

	
	public static void GoTo() {
		// TODO Auto-generated method stub
		Driver.Instance.navigate().to( "http://live.guru99.com/index.php/");		
	}

	public static void selectFromDropdown(String s) {
		// TODO Auto-generated method stub
		WebElement dropdownlist = Driver.Instance.findElement(By.className("sort-by"));
		List<WebElement> options = dropdownlist.findElements(By.tagName("option"));
		for(int i=0;i<options.size();i++){
			if(options.get(i).getText().equals(s)){
				options.get(i).click();
			}
		}
		
	}

	
	public static String getTitle() {
		WebElement heading = Driver.Instance.findElement(By.className("page-title"));
		String title = heading.getText();
		return title;
		
		// TODO Auto-generated method stub
		
	}

	public enum Dropdown{
		MOBILE;
		
	}

	public static void selectLink(String link) {
		// TODO Auto-generated method stub
		Driver.Instance.findElement(By.linkText(link)).click();
		
	}
}

