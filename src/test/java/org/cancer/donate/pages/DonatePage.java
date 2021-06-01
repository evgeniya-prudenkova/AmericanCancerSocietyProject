package org.cancer.donate.pages;

import org.cancer.donate.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DonatePage extends CommonMethods {

    @FindBy(id = "root-container")
    public WebElement backgroundImage;

    @FindBy(xpath = "//img[@class='logo']")
    public WebElement logoImage;

    @FindBy(id="frequency_onetime")
    public WebElement btnOneTime;

    @FindBy(id="frequency_monthly")
    public WebElement btnMonthly;

    @FindBy(xpath = "//*[@id='donate_amount']/div[2]/div[1]/div")
    public List<WebElement> actualOneTimeListAmount;

    @FindBy(xpath = "//*[@id='donate_amount']/div[3]/div[1]/div")
    public List<WebElement> actualMonthlyListAmount;

    public DonatePage() {
        PageFactory.initElements(driver, this);
    }
}
