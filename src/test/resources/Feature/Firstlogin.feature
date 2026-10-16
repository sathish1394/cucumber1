@login
Feature: User have to validate the login funtionality in adactin page
Background:
Given User have to lanch the Adactin url through chrome browser
@smoke
Scenario Outline:User have to  validiate login funtionality valid login and valid password  
When User have to  pass the valid login and valid password and click login in Adactin 
          |sathishzab94|
           |Z42IP5|
And select hotel location, room number for adult and child and submit
Then user can close the broswer

@regression
Scenario:User have to  validiate login funtionality Invalid login and valid password  
When User have to  pass the Invalid login and valid password and click login in Adactin 
           |sathishzab9| Z42IP5|
Then user can close the broswer

@sanity
Scenario:User have to  validiate login funtionality valid login and Invalid password  
When User have to  pass the valid login and Invalid password and click login in Adactin 
           |username|sathishzab94|
           |password| Z42IP|
Then user can close the broswer

@smoke
Scenario:User have to  validiate login funtionality Invalid login and Invalid password  
When User have to  pass the Invalid login and Invalid password and click login in Adactin 
           |username| password|
           |sathishzab4|Z42IP|
Then user can close the broswer