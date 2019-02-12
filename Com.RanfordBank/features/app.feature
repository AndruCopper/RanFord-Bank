Feature: Login and Branch Creation
Scenario: Validate the login funcationality with Valid Data
Given Launch the site
When  Enter the UserName "<Admin>"and Password"<Admin>" and click on Login btn
Then  Admin page should Displayed
And   close the site

