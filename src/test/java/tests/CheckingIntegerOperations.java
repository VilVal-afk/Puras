package tests;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalcPage;
import pages.SearchPage;

public class CheckingIntegerOperations {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static CalcPage calcPage;

    @BeforeAll
    public static void getDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        calcPage = new CalcPage(driver);
    }

    @Test
    public void checkingIntegerOperation() throws InterruptedException {
        driver.get("http://google.com");
        searchPage.search.sendKeys("Калькулятор");
        Thread.sleep(100);
        searchPage.findToGoogle.click();
        calcPage.inputAndClick(driver, calcPage.calcInput, "(1 + 2) × 3 - 40 / 5 =");
        Assert.assertEquals(calcPage.saved.getText(), "(1 + 2) × 3 - 40 ÷ 5 =");
        Assert.assertEquals(calcPage.result.getText(), "1");
    }

    @AfterAll
    public static void closeBrowser() {
        driver.close();
    }
}
