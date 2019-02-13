package pagelibary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEmployee {

	
	@FindBy(id="txtUname")
	public static WebElement employeeName;
	
	@FindBy(id="txtLpwd")
	public static WebElement loginPwd;
	
	@FindBy(id="lst_Roles")
	public static WebElement role;
	
	@FindBy(id="lst_Branch")
	public static WebElement branch;
	
	@FindBy(id="BtnSubmit")
	public static WebElement submit;
}
