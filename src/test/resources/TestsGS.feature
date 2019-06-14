Feature: Different Elements Page Test

  Scenario: Interface testing
    Given I open site

    Then I choose Get started for free
    And Fill in the email field with random generated number of email
    And I create my Wrike account check with assertion that you are moved to the next page

    When I was move to the next page

    Then I fill in the Q&A section at the left part of page

    Then I Resend email

    When Section Follow us consists 'TWITER'
