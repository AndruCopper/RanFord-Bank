package module;

import pagelibary.LoginPage;

public class Login_m {

	public static void login_exe(String UN,String pwd)
	{
		LoginPage.userName.sendKeys(UN);
		LoginPage.password.sendKeys(pwd);
		LoginPage.loginBtn.click();
	}
}
