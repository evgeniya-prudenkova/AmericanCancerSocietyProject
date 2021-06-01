package org.cancer.donate.utils;

import org.cancer.donate.testbase.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class CommonMethods extends PageInitializer {

    static Properties prop;

    /**
     * This method reads any given property file
     *
     * @param filePath
     * @return Properties
     */
    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    /**
     * This method will return single value based on the specified key
     *
     * @param key
     * @return String
     */
    public static String getPropertyValue(String key) {
        return prop.getProperty(key);
    }

    /**
     * This method will return an object of Explicit Wait with time set to 20 sec
     *
     * @return WebDriverWait
     */
    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
        return wait;
    }

    /**
     * This method will wait until the given element becomes clickable
     *
     * @param element
     */
    public static void waitForClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * This method will wait until the given element becomes visible
     *
     * @param element
     */
    public static void waitForVisible(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method will wait until the given element becomes clickable and then click
     *
     * @param element
     */
    public static void click(WebElement element) {
        waitForClickable(element);
        element.click();
    }

    /**
     * This method will validate if the title is enabled or not
     *
     * @param title
     * @return True if the title is enabled, false otherwise
     */
    public static boolean isTitleEnabled(String title) {
        return driver.findElement(By.xpath("//title[.='" + title + "']")).isEnabled();
    }

    /**
     * This method will validate if the text is displayed or not
     *
     * @param text
     * @return True if the text is displayed, false otherwise
     */
    public static boolean isTextDisplayed(String text) {
        return driver.findElement(By.xpath("//*[text()='" + text + "']")).isDisplayed();
    }

    /**
     * This method will validate if the element is displayed or not
     *
     * @param element
     * @return True if the element is displayed, false otherwise
     */
    public static boolean elementIsDisplayed(WebElement element) {
        waitForVisible(element);
        return element.isDisplayed();
    }

    /**
     * This method will return value for given CSS attribute
     *
     * @param element
     * @param cssAttribute
     * @return
     */
    public static String getCSSValue(WebElement element, String cssAttribute) {
        return element.getCssValue(cssAttribute);
    }

    /**
     * This method will return the text from a List of WebElement as a List of String
     *
     * @param listOfWebElements
     * @return List of String
     */
    public static List<String> getTextFromListOfWebElement(List<WebElement> listOfWebElements) {

        List<String> listOfTextFromWebElements = new ArrayList<>();
        for (WebElement webElement : listOfWebElements) {
            listOfTextFromWebElements.add(webElement.getText());
        }
        return listOfTextFromWebElements;
    }

    /**
     * This method will take screenshot
     *
     * @param fileName
     * @return
     */
    public static byte[] takeScreenshot(String fileName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
        File file = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp(" yyyy-MM-dd-HH-mm-ss") + ".png";
        try {
            FileUtils.copyFile(file, new File(destinationFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     * This method will get Time Stamp as unique name for screenshot
     *
     * @param pattern
     * @return
     */
    public static String getTimeStamp(String pattern) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
