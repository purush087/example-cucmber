$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "As a User I should be able to book a flight",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-book-a-flight",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1251506592,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "User should be able to book a one Way ticket",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-book-a-flight;user-should-be-able-to-book-a-one-way-ticket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User chooses to travel by flight",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters journey details",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user searches for flights",
  "keyword": "Then "
});
formatter.match({
  "location": "StartingSteps.user_is_on_Landing_Page()"
});
formatter.result({
  "duration": 8958489589,
  "status": "passed"
});
formatter.match({
  "location": "HomeTest.user_chooses_to_travel_by_flight()"
});
formatter.result({
  "duration": 608859977,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingTest.user_enters_journey_details()"
});
formatter.result({
  "duration": 6916463046,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingTest.user_searches_for_flights()"
});
formatter.result({
  "duration": 127725866,
  "status": "passed"
});
formatter.after({
  "duration": 74913996,
  "status": "passed"
});
});