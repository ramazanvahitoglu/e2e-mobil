package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Allpages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageStepDefinitions {

    Allpages allpages=new Allpages();
    Faker faker=new Faker();
    String email=faker.internet().emailAddress();
    String firstname=faker.name().firstName();
    String lastname=faker.name().lastName();
    String password=faker.internet().password();

    @Given("Alltricks anasayafa git")
    public void alltricks_anasayfasina_git(){
       Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));
        allpages.acceptButton.click();
        try{
            if (Driver.getAppiumDriver().getPageSource().indexOf("Yes")!=-1){
                allpages.noButton.click();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    @Given("Profil sekmesine geç")
    public void profil_sekmesine_geç() {
        allpages.profilMenu.click();
        allpages.monLabel.click();
    }
    @Then("Adresim kismina emaili gir")
    public void adresim_kismina_emaili_gir() {
        allpages.emailTextbox.sendKeys(email);
        try{
            if (Driver.getAppiumDriver().getPageSource().indexOf("Yes")!=-1){
                allpages.noButton.click();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        allpages.suivantButton.click();
    }

    @Then("Bilgilerini doldur.")
    public void bilgileriniDoldur() {
        ReusableMethods.scrollDownJavascript(0,500);
        allpages.firstnameTextbox.sendKeys(firstname);
        allpages.lastnameTextbox.sendKeys(lastname);
        allpages.passwordTextbox.sendKeys(password);
        allpages.saveButton.click();
        //allpages.alltcicksLogo.click();
        //allpages.velosImg.click();
    }
}
