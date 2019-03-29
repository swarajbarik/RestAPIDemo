Feature: Discrete Flow With Route Definition Id Without NCM
Description: This feature will cover the end to end flow of Route

Scenario Outline: Test Scenario
	Then Create a work order without route <workOrderName>
	And Clockon each operation and complete
	Then Get work order to verify the status
	Then Validate process order created in SOADB
	Examples:
	|routeName| workOrderName |
	|Test SIT Route 6.98| Test SIT WO 96.36 |
	
	
	