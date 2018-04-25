Feature: Login for Leaftaps

Background:
And Enter username as DemoSalesManager
And Enter password as crmsfa
And click login button
And click crmsfa
And click Leads
@smoke
Scenario Outline: Create lead

#Given browser
And click create Leads
And Enter first name as <fname>
When Enter last name as <lname>
When Enter Company name as <cname>
When Click Submitt button
#Then verify leads

Examples:
|fname|lname|cname|
|Arun004|govind|test55|


@regression
Scenario Outline: Create lead2

#Given browser
And click create Leads
When Enter first name as <f1name>
When Enter last name as <l1name>
When Enter Company name as <c1name>
When Click Submitt button
#Then verify leads

Examples:
|f1name|l1name|c1name|
|Arun554|g4|test55|
|david5|mike|test66|

@sanity
Scenario Outline: Edit lead

And click find leads
And Enter first name as<fname>
And click submitt button
And click first result
And click Edit button
And Edit first name as <efname>
When Click Submitt button

Examples:
|fname|efname|
|Arun554|Aron454|

@integration
Scenario Outline: Merge lead

And click merge lead
And click first img
And type first name as <mfname>
And click find leads button
And click first result
And click second image
And type first name as <m2fname>
And click find leads button
And click first result
When click Merge button

Examples:
|mfname|m2fname|
|Arun004|Aron454|