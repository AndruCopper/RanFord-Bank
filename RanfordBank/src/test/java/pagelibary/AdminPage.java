package pagelibary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

	
	@FindBy(xpath="//img[@src='images/Branches_but.jpg']")
	public static WebElement branches;
	
	@FindBy(xpath="//img[@src='images/Roles_but.jpg']")
	public static WebElement roles;
	
	@FindBy(xpath="//img[@src='images/Users_but.jpg']")
	public static WebElement user;
	
	@FindBy(xpath="//img[@src='images/emp_btn.jpg']")
	public static WebElement employee;
	
	
	
	
}
