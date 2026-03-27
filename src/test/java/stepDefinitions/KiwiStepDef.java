package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KiwiPage;
import utilities.ReusableMethods;

public class KiwiStepDef {
    KiwiPage page=new KiwiPage();

    @Given("Continue as a guest butonuna tiklanir")
    public void continue_as_a_guest_butonuna_tiklanir() throws InterruptedException {
        Thread.sleep(1000);
        page.ContinueAsAGuest.click();
    }
    @When("Acilan sayfalarda Continue ve Explore the app tiklanir")
    public void acilan_sayfalarda_continue_ve_explore_the_app_tiklanir() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 0; i < 4; i++) {
            ReusableMethods.koordinatTiklamaMethodu(550,2000,400);
        }


    }
    // yorumda olan step icin kodlar;
    // ResuableMethods.scrollWithUiScrollableAndClick(Continue);
    // ResuableMethods.scrollWithUiScrollableAndClick(Exploretheapp);


    @When("Trip type one way olarak secilir")
    public void trip_type_one_way_olarak_secilir() throws InterruptedException {
        page.secimButton.click();
        Thread.sleep(2000);
        page.OneWayButton.click();


    }
    @When("Kalkıs sehri secenegine tiklanir ve default olan sehir kaldirilir")
    public void kalkıs_sehri_secenegine_tiklanir_ve_default_olan_sehir_kaldirilir() throws InterruptedException {
        Thread.sleep(2000);
        page.FromButton.click();
        Thread.sleep(2000);
        page.ClearButton.click();

    }
    @When("Kalkıs sehri alanina Ankara yazilir ve Choose butonuna tiklanir")
    public void kalkıs_sehri_alanina_ankara_yazilir_ve_choose_butonuna_tiklanir() {


    }
    @When("Varış sehri alanina Frankfurt yazilir ve Choose butonuna tiklanir")
    public void varış_sehri_alanina_frankfurt_yazilir_ve_choose_butonuna_tiklanir() {

    }
    @When("Gidiş tarihi alanindan {int} Eylul secilir ve Set Date butonuna tiklanir")
    public void gidiş_tarihi_alanindan_eylul_secilir_ve_set_date_butonuna_tiklanir(Integer int1) {

    }
    @When("Search butonuna tiklanir")
    public void search_butonuna_tiklanir() {

    }
    @When("En ucuz ve Aktarmasiz filtrelemeleri yapilir")
    public void en_ucuz_ve_aktarmasiz_filtrelemeleri_yapilir() {

    }
    @Then("Gelen ilk bilet fiyati kaydedilir ve kullanicinin telefonuna SMS olarak gonderilir")
    public void gelen_ilk_bilet_fiyati_kaydedilir_ve_kullanicinin_telefonuna_sms_olarak_gonderilir() {

    }

}
