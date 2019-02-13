package pagelibary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User {

	
	@FindBy(id="lst_branchS")
	public static WebElement branch;
	
	@FindBy(id="lst_rolesS")
	public static WebElement roles;
	
	@FindBy(id="btn_search")
	public static WebElement search;
	
	@FindBy(id="btn_clear")
	public static WebElement clear;
	
	@FindBy(id="Btnuser")
	public static WebElement newUser;
	
}
