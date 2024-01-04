package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
public class Page01 {
    public Page01() { PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(id="nav-logo")
    public WebElement logo;
    @FindBy(id="cookieAcceptanceAll")
    public WebElement cookiePoP;
}
