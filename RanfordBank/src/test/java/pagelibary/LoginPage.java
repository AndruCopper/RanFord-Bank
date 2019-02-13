package pagelibary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="txtuId")
	public static WebElement userName;
	
	@FindBy(id="txtPword")
	public static WebElement password;
	
	@FindBy(id="login")
	public static WebElement loginBtn;
}
