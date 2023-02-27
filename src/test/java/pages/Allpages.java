package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class Allpages {
    public Allpages(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(5)),this);
    }

    @FindBy (xpath = "//button[@id='didomi-notice-agree-button']")
    public WebElement acceptButton;

    @FindBy (xpath = "//a[@class='close-btn']")
    public WebElement noButton;

    @FindBy (xpath = "//span[@class='allfont allfont-perso']")
    public WebElement profilMenu;

    @FindBy (xpath = "(//ul[@class='menu_level_1']//li/a)[1]")
    public WebElement monLabel;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailTextbox;

    @FindBy (xpath = "//button[@class='ant-btn atds-btn']")
    public WebElement suivantButton;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastnameTextbox;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstnameTextbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//button[@class='ant-btn atds-btn']")
    public WebElement saveButton;

    /*
    sürüm farkından dolayı AndroidFindBy olarak tanımlamamız gerekebilir.
    @AndroidFindBy (xpath = "")
    public WebElement ikon2;
     */

}
