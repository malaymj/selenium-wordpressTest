package wordpressAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MobilePage {

	public static boolean IsSorted;

	public static String getTitle() {
		// TODO Auto-generated method stub
		String title = Driver.Instance.getTitle();
		return title;
		
		
	}

	public static void SortBy(String s) {
		// TODO Auto-generated method stub
		WebElement dropdownlist = Driver.Instance.findElement(By.className("sort-by"));
		List<WebElement> options = dropdownlist.findElements(By.tagName("option"));
		for(int i=0;i<options.size();i++){
			if(options.get(i).getText().equals(s)){
				options.get(i).click();
			}
		}
		
	}

	public static boolean isIsSorted() {
		
		return true;
	}

}
