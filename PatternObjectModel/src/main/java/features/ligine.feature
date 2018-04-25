Feature: Login for Leaftaps

Background:
And Enter username as DemoSalesManager
And Enter password as crmsfa
And click login button
And click crmsfa
And click Leads

@smoke
Scenario Outline: Edit lead

#Given browser
And click find leads
And Enter first name as<fname>
And click submitt button
And click first result
And click Edit button
And Edit first name as <efname>
When Click Submitt button

Examples:
|fname|efname|
|Aron44|Aron444|

@regression
Scenario Outline: Edit lead2

#Given browser
And find leads
And Enter first name as <f1name>
And Edit first name as <efname1>
When Edit last name as <elanme2>
When Edit Company name as <ecname2>
When Click Submitt button

Examples:
|f1name|efname1|elname2|ecname3|
|david5|david|miller|testleaf|