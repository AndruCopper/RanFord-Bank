package pagelibary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRole {

	
	@FindBy(id="txtRname")
	public static WebElement roleName;
	
	@FindBy(id="txtRDesc")
	public static WebElement roleDesc;
	
	@FindBy(id="lstRtypeN")
	public static WebElement roleType;
	
	@FindBy(id="btninsert")
	public static WebElement submitBtn;
}
