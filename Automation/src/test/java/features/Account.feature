Feature: Application login

Background:
Given User opens chrome browser
When Browser is triggered
Then Check browser is opened

@RegTest
Scenario: Home page default Login
	Given User is on NetBanking Landing page
	When User logs into application with "jin" and password "1234"
	Then home page is populated
	And cards displayed are "true"


	