Feature: Audit page scenarios 
 Background:
  Given User has already logged in Jarvis
 |username|password|
 |qa-settlements@jarvis.osmos.services|FbSettlements@2022|
																	

Scenario: verify audit tab
    Given user clicks on settlement audit tab
    And user clicks on audit tab
    When user clicks on the audit dropdown
    And select <sellerOrderLineId>
    And click on search
    Then transactions related to that sellerOrderLineId should be displayed
    
