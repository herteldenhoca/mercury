package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HrMercuryPage {
public  HrMercuryPage() {
    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement usernameTextBox;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordTextBox;
    @FindBy(css = "button[name='LoginSubmit']")
    public WebElement loginButton;
    @FindBy(xpath = "(//img[@class='ListPhoto'])[1]")
    public WebElement accessDogrulama;
}
