package pagelibary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewBranch {

	
	@FindBy(id="txtbName")
	public static WebElement branchName;
	
	@FindBy(id="txtAdd1")
	public static WebElement address1;
	
	@FindBy(id="Txtadd2")
	public static WebElement address2;
	
	@FindBy(id="txtadd3")
	public static WebElement address3;
	
	@FindBy(id="txtArea")
	public static WebElement area;
	
	@FindBy(id="txtZip")
	public static WebElement zipCode;
	
	@FindBy(id="lst_counrtyU")
	public static WebElement country;
	
	@FindBy(id="lst_stateI")
	public static WebElement state;
	
	@FindBy(id="lst_cityI")
	public static WebElement city;
	
	@FindBy(id="btn_insert")
	public static WebElement submit;
	
	
	
	
	
	
	
	
	
}
