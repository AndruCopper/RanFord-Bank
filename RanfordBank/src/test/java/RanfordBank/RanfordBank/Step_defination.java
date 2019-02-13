package RanfordBank.RanfordBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import module.Branches;
import module.Login_m;
import pagelibary.AdminPage;
import pagelibary.BranchesPage;
import pagelibary.LoginPage;

public class Step_defination {

WebDriver driver;
@Given("^launch the site$")
public void launch_the_site() throws Throwable {
   
}

@When("^Enter the UserName with  \"([^\"]*)\" and Password with \"([^\"]*)\" and click on login btn$")
public void enter_the_UserName_with_and_Password_with_and_click_on_login_btn(String username, String password) throws Throwable {
	PageFactory.initElements(driver, LoginPage.class);
	Login_m.login_exe(username,password);
}

@Then("^Branches should be displayed$")
public void branches_should_be_displayed() throws Throwable {
	PageFactory.initElements(driver, AdminPage.class);
	Branches.branches_click();
}

@Then("^Close the site$")
public void close_the_site() throws Throwable {
    driver.close();
}

@Then("^Branches_btn should be displayed$")
public void branches_btn_should_be_displayed() throws Throwable {
   
}

@Then("^Click on branches_btn$")
public void click_on_branches_btn() throws Throwable {
    PageFactory.initElements(driver, AdminPage.class);
    AdminPage.branches.click();
}

@Then("^New branches_btn should be displayed$")
public void new_branches_btn_should_be_displayed() throws Throwable {
   
}

@Then("^Click on newBranch_btn create the new branch with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and click on submit btn$")
public void click_on_newBranch_btn_create_the_new_branch_with_and_and_and_and_and_and_and_click_on_submit_btn(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
    BranchesPage.newBranchBtn.click();
    
}

@When("^Enter the username with  \"([^\"]*)\" and Password with \"([^\"]*)\" and click on login btn$")
public void enter_the_username_with_and_Password_with_and_click_on_login_btn(String arg1, String arg2) throws Throwable {
    
}

@Then("^Roles_btn should be displayed$")
public void roles_btn_should_be_displayed() throws Throwable {
    
}

@Then("^click on Roles_btn$")
public void click_on_Roles_btn() throws Throwable {
   
}

@Then("^NewRoles btn should be displyed$")
public void newroles_btn_should_be_displyed() throws Throwable {
    
}

@Then("^click on NewRoles_btn create the new roles with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and click on submit btn$")
public void click_on_NewRoles_btn_create_the_new_roles_with_and_and_and_click_on_submit_btn(String arg1, String arg2, String arg3) throws Throwable {
    
}

@Then("^Employee_btn should be displayed$")
public void employee_btn_should_be_displayed() throws Throwable {
    
}

@Then("^Click on Employee_btn$")
public void click_on_Employee_btn() throws Throwable {
    
}

@Then("^NewEmployee_btn should be displyed$")
public void newemployee_btn_should_be_displyed() throws Throwable {
   
}

@Then("^Click on NewEmployee_btn Create the newemployee with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and click on submit btn$")
public void click_on_NewEmployee_btn_Create_the_newemployee_with_and_and_and_and_click_on_submit_btn(String arg1, String arg2, String arg3, String arg4) throws Throwable {
   
}


	
}
