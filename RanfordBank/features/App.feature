Feature: login and barnch creation
Scenario: Validate the login funcationality with  valid  data
Given  launch the site
When   Enter the UserName with  "Admin" and Password with "Admin" and click on login btn
Then   Branches should be displayed
And    Close the site


Scenario Outline: Validate the multiple set of data using excel DataSet for Branches 
Given   launch the site
When    Enter the UserName with  "Admin" and Password with "Admin" and click on login btn
Then    Branches_btn should be displayed
Then    Click on branches_btn
Then    New branches_btn should be displayed
Then    Click on newBranch_btn create the new branch with "<BranchName>" and "<Address1>" and "<Area>" and "<ZipCode>" and "<Country>" and "<State>" and "<city>" and click on submit btn

Examples: 
          |BranchName| |Address1| |Area| |ZipCode| |Country| |State| |City|
          | HDFC |   |Marathalli| |Mind Q| |54568| |INDIA|  |Karnataka| |Bangalore|
	
	
Scenario Outline: Validate the multiple set of data using excel DataSet for Roles 	
Given  launch the site
When   Enter the UserName with  "Admin" and Password with "Admin" and click on login btn
Then   Roles_btn should be displayed
Then   click on Roles_btn
Then   NewRoles btn should be displyed
And    click on NewRoles_btn create the new roles with "<RoleName>" and "<RoleDisc>" and "<RoleType>" and click on submit btn

Examples: 
           |RoleName| |RoleDisc| |RoleType|
           |Manager| |Good| | E |
           
           
Scenario Outline: Validate the multiple set of data using excel DataSet for Employee
Given  launch the site
When   Enter the UserName with  "Admin" and Password with "Admin" and click on login btn
Then   Employee_btn should be displayed
Then   Click on Employee_btn
Then   NewEmployee_btn should be displyed  
And    Click on NewEmployee_btn Create the newemployee with "<EmployeeName>" and "<LoginPwd>" and "<Role>" and "<Branch>" and click on submit btn      

Examples:
					|EmployeeName| |LoginPwd| |Role| |Branch|
					|Andru| |Andru!@2019| |manager| |HDFC|


