Feature: Application login

@RegressionTest
	Scenario: Home page default Login
	Given User is on NetBanking Landing page
	When User logs into application with "faddu786@" and password "pass"
	Then home page is populated
	And cards displayed are "true"

@MobileTest2
	Scenario: Home page default Login
	Given User is on NetBanking Landing page
	When User logs into application with "john" and password "2222"
	Then home page is populated
	And cards displayed are "false"
	
@MobileTest
	Scenario: Home page default Login
	Given User is on NetBanking Landing page
	When User signs up from Login Page
	| Jenny | 1235 | fawad@fawad.com | Australia | VIC |
	| Jenkins | 1333| fawad@fawsfad.com | Australia | SA  |
	Then home page is populated
	And cards displayed are "true"

@WebTest
	Scenario Outline: Home page default Login
	Given User is on NetBanking Landing page
	When User logs in to application with <username> and password <password>
	Then home page is populated
	And cards displayed are "false"
	
	Examples:
	| username | password |
	| user 1   | pass1    |
	| user 2   | pass2    |
	| user 3   | pass3    |
	| user 4   | pass4    |
	| user 5   | pass5    |
	
	