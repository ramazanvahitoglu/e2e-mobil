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
    //@FindBy (id = "didomi-notice-agree-button")
    public WebElement sayfayiGec;

    @FindBy (xpath = "//a[@class='close-btn']")
    public WebElement No;

    @FindBy (xpath = "//span[@class='allfont allfont-perso']")
    public WebElement profilClick;

    @FindBy (xpath = "(//ul[@class='menu_level_1']//li/a)[1]")
    public WebElement monProfil;

    @FindBy (xpath = "//*[@id='email']")
    //@FindBy (id = "email")
    public WebElement email;

    @FindBy (xpath = "//button[@class='ant-btn atds-btn']")
    public WebElement suivantClick;

    @FindBy(xpath = "//input[@id='lastname']")
    //@FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='firstname']")
    //@FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='password']")
    //@FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='ant-btn atds-btn']")
    public WebElement saveButton;

    /*
    sürüm farkından dolayı AndroidFindBy olarak tanımlamamız gerekebilir.
    @AndroidFindBy (xpath = "")
    public WebElement ikon2;
     */

}
