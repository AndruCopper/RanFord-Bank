package pagelibary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchesPage {

	
	@FindBy(id="'lst_countryS")
	public static WebElement country;
	
	@FindBy(id="lst_stateS")
	public static WebElement state;
	
	@FindBy(id="lst_cityS")
	public static WebElement city;
	
	@FindBy(id="btn_search")
	public static WebElement search;
	
	@FindBy(id="btn_clsearch")
	public static WebElement clear;
	
	@FindBy(xpath="//input[@id='BtnNewBR']")
	public static WebElement newBranchBtn;
	
	
	
	
}
