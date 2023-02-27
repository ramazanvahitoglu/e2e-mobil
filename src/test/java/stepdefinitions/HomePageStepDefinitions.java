package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Allpages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageStepDefinitions {

    Allpages allpages=new Allpages();
    @Given("Alltricks anasayafa git")
    public void alltricks_anasayfasina_git(){
       Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));
        allpages.sayfayiGec.click();
        try{
            allpages.No.click();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    @Given("Profil sekmesine geç")
    public void profil_sekmesine_geç() {
        allpages.profilClick.click();
        allpages.monProfil.click();
    }
    @Then("Adresim kismina emaili gir")
    public void adresim_kismina_emaili_gir() {
        allpages.email.sendKeys("exemplex456dadasd@gmail.com");
        try{
            if (Driver.getAppiumDriver().getPageSource().indexOf("Yes")!=-1){
                allpages.No.click();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        allpages.suivantClick.click();
    }

    @Then("Bilgilerini doldur.")
    public void bilgileriniDoldur() {
        ReusableMethods.scrollDownJavascript(0,500);
        allpages.firstname.sendKeys("gdhgasddgdhjsfsdf");
        allpages.lastname.sendKeys("dhfhjasdafgsfd");
        allpages.password.sendKeys("gdfgdasdfgsdfdsf");
        allpages.saveButton.click();
    }
}
