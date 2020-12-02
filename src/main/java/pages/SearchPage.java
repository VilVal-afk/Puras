package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {

    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
    public WebElement search;

    @FindBy(xpath = "//*[@class='gNO89b']")
    public WebElement findToGoogle;

    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }

}
