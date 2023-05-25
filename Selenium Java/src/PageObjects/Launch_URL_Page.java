package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Launch_URL_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "URL")
	public static WebElement URL;

public void verify_URL(String data){
		Assert.assertEquals(URL,URL);
}

public void enter_URL(String data){
		driver.get(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}