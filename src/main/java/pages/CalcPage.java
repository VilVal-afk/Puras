package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcPage {


    @FindBy(xpath = "//*[@jsname='a1lrmb']//*[@jsname='VssY5c']")
    public WebElement calcInput;

    @FindBy(xpath = "//*[@jsname='a1lrmb']//*[@jsname='VssY5c']")
    public WebElement result;

    @FindBy(xpath = "//*[@jsname='a1lrmb']//*[@jsname='VkJw6']/*")
    public WebElement saved;

    public CalcPage(WebDriver driver) {
        initElements(driver,this);
    }

    public void inputAndClick(WebDriver driver, WebElement element, String text){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().sendKeys(text).sendKeys(Keys.ENTER).build().perform();
    }
}
