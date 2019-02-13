package module;

import pagelibary.AdminPage;

public class Branches {

	
	public static void branches_dis()
	{
		if(AdminPage.branches.isDisplayed())
		{
			System.out.println("branches should displyed click on branches btn");
		}
	}
	
	public static void branches_click()
	{
		AdminPage.branches.click();
	}
}
