package org.cancer.donate.steps;

import org.cancer.donate.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DonateSteps extends CommonMethods {

    @ParameterType(value = "true|false")
    public Boolean booleanValue(String value) {
        return Boolean.valueOf(value);
    }

    @Then("verify title {string} is enabled – {booleanValue}")
    public void verify_title_is_displayed_true(String title, Boolean booleanValue) {
        Assert.assertEquals(booleanValue, isTitleEnabled(title));
    }

    @Then("verify background image {string} is displayed - {booleanValue}")
    public void verify_background_image_is_displayed_true(String backgroundImageURL, Boolean booleanValue) {
        Assert.assertEquals(booleanValue, elementIsDisplayed(donatePage.backgroundImage));
        Assert.assertEquals(getCSSValue(donatePage.backgroundImage, "background-image"), backgroundImageURL);
    }

    @Then("verify logo image is displayed")
    public void verify_logo_image_is_displayed() {
        Assert.assertTrue(elementIsDisplayed(donatePage.logoImage));
    }

    @Then("verify text {string} is displayed")
    public void verify_text_is_displayed(String text) {
        Assert.assertTrue(isTextDisplayed(text));
    }

    @Then("click on One Time and verify the following values are displayed")
    public void click_on_One_Time_and_verify_the_following_values_are_displayed(DataTable dataTable) {

        click(donatePage.btnOneTime);
        List<String> expectedListAmountText = dataTable.asList();
        Assert.assertEquals("Data does NOT matched", expectedListAmountText,
                getTextFromListOfWebElement(donatePage.actualOneTimeListAmount));
    }

    @Then("click on Monthly and verify the following values are displayed")
    public void click_on_Monthly_and_verify_the_following_values_are_displayed(DataTable dataTable) {

        click(donatePage.btnMonthly);
        List<String> expectedListAmountText = dataTable.asList();
        Assert.assertEquals("Data does NOT matched", expectedListAmountText,
                getTextFromListOfWebElement(donatePage.actualMonthlyListAmount));
    }
}
