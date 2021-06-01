$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/donate.feature");
formatter.feature({
  "name": "Donate Home Page Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Donate Home Page Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "verify title \"Donate Today | The American Cancer Society\" is enabled – true",
  "keyword": "Then "
});
formatter.match({
  "location": "org.cancer.donate.steps.DonateSteps.verify_title_is_displayed_true(java.lang.String,java.lang.Boolean)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify background image \"url(\\\"https://acsdonateqaimages.azureedge.net/media/ACS18_029545_Michelle_Quint_Opt.png\\\")\" is displayed - true",
  "keyword": "And "
});
formatter.match({
  "location": "org.cancer.donate.steps.DonateSteps.verify_background_image_is_displayed_true(java.lang.String,java.lang.Boolean)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify logo image is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "org.cancer.donate.steps.DonateSteps.verify_logo_image_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify text \"Give the gift of cancer research and patient support.\" is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "org.cancer.donate.steps.DonateSteps.verify_text_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on One Time and verify the following values are displayed",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "org.cancer.donate.steps.DonateSteps.click_on_One_Time_and_verify_the_following_values_are_displayed(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Monthly and verify the following values are displayed",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "org.cancer.donate.steps.DonateSteps.click_on_Monthly_and_verify_the_following_values_are_displayed(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Donate Home Page Verification");
formatter.after({
  "status": "passed"
});
});