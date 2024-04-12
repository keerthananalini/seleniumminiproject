# seleniumminiproject
MINI PROJECT
TITLE: ONLINE MOBILE SEARCH
PROBLEM STATEMENT:  
Automate Search Mobile phones functionality on Online shopping Website 
Get mobiles smart phones from Amazon online store, which has: 
1.	Price less than Rs.30000
2.	Mobiles which are newly arrived
Suggested site: Amazon however you are free to choose any other legitimate shopping site.  
DETAILED DESCRIPTION:    
•	Launch the browser using the configuration settings Firefox/Chrome.
•	Read the application URL from configuration settings. (e.g. https://www.amazon.in)
•	Open the URL. User will navigate to home page of website.
•	Enter the search text in search box “mobile smartphones under 30000”
•	Application displays the follow message similar to following-
o    1-24 of over 1,000 results for "mobile smartphones under 30000"  (1-24 and 1000 numbers will change according to stock available on site that at the time of execution)
•	In the above text, validate the search string, number of pages( e.g. 1-16), number of items (over 90,000)
•	Click on “Sort by list” listbox.
•	Application should display four sort by options in the list. Check the count of options displayed.
•	Select option “Newest Arrivals”
•	Verify that  “Newest Arrivals” option got selected correctly or not.
•	Close the browser.
STEPS TO IMPLEMENT THE PROJECT:
1.	Create a maven Project  from File -> New -> other -> Java Project.
2.	Import Selenium.
3.	Setup Webdriver in Eclipse.
4.	Create a package seleniumniniproject.
5.	Create a class Amazon.
6.	Implement the test case using selenium .
7.	Validate the results and close the browser.
