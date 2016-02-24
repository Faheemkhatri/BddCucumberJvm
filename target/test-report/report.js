$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SpreePaxotechlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Spree project login functionality",
  "description": "",
  "id": "spree-project-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1845789469,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "2. As a valid user, user should be able to login and buy a product.",
  "description": "",
  "id": "spree-project-login-functionality;2.-as-a-valid-user,-user-should-be-able-to-login-and-buy-a-product.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user can browse to an application",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user land on home page \"Spree Demo Site\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user can click on login link",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "enter \"faheemkhatri@yahoo.com\" as email address",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "enter \"student1\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user logged on to the application",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "select item \"Ruby on Rails Tote\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "update quantity on cart page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "click on check out button",
  "keyword": "And "
});
formatter.match({
  "location": "SpreePaxovisionloginSteps.user_can_browse_to_an_application()"
});
formatter.result({
  "duration": 3360119939,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Spree Demo Site",
      "offset": 24
    }
  ],
  "location": "SpreePaxovisionloginSteps.user_land_on_home_page(String)"
});
formatter.result({
  "duration": 33543859,
  "status": "passed"
});
formatter.match({
  "location": "SpreePaxovisionloginSteps.user_can_click_on_login_link()"
});
formatter.result({
  "duration": 89900210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "faheemkhatri@yahoo.com",
      "offset": 7
    }
  ],
  "location": "SpreePaxovisionloginSteps.enter_as_email_address(String)"
});
formatter.result({
  "duration": 2125324634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "student1",
      "offset": 7
    }
  ],
  "location": "SpreePaxovisionloginSteps.enter_as_password(String)"
});
formatter.result({
  "duration": 152808039,
  "status": "passed"
});
formatter.match({
  "location": "SpreePaxovisionloginSteps.click_on_login_button()"
});
formatter.result({
  "duration": 1508836099,
  "status": "passed"
});
formatter.match({
  "location": "SpreePaxovisionloginSteps.user_logged_on_to_the_application()"
});
formatter.result({
  "duration": 23490700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ruby on Rails Tote",
      "offset": 13
    }
  ],
  "location": "SpreePaxovisionloginSteps.select_item(String)"
});
formatter.result({
  "duration": 2774163760,
  "status": "passed"
});
formatter.match({
  "location": "SpreePaxovisionloginSteps.update_quantity_on_cart_page()"
});
formatter.result({
  "duration": 36050465,
  "status": "passed"
});
formatter.match({
  "location": "SpreePaxovisionloginSteps.click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 2594243339,
  "status": "passed"
});
formatter.match({
  "location": "SpreePaxovisionloginSteps.click_on_check_out_button()"
});
formatter.result({
  "duration": 2096214744,
  "status": "passed"
});
formatter.after({
  "duration": 15335,
  "status": "passed"
});
});