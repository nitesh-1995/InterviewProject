
@tag
Feature: Compose Function in Gmail
  I want to use this template Composing Email in Gmail

  @tag1
  Scenario Outline: Verify Compose Function in Gmail
    Given I open browser with url "https://accounts.google.com/" 
    And I do login to gmail with emailID "<emailId>"
    And password "<password>"
    Then I should see gmail homepage
    When I click on compose button
    Then I should see new message popup
    When I enter the email id of receipents as "<receipents>"
    And I enter subject as "<subject>"
    And I enter body as "<body>"
    And I click on send button
    Then I should get confirmation
    And I should see gmail homepage
    When I close browser
 
		Examples:
		|emailId|password|
		|xyz@gmail.com|xyz@123|
    Examples: 
      |receipents|subject|body|
      |nitesh.tadadikar1995@gmail.com|Incubyte|Automation QA test for Incubyte|
    