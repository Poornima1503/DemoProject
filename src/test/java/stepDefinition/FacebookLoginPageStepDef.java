package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Boolean.TRUE;
import static pageObjects.FacebookLoginPage.*;

import pageObjects.FacebookLoginPage;
import utilities.ConfigFileReader;
import static utilities.Log.info;

import static stepDefinition.Hooks.driver;

public class FacebookLoginPageStepDef {



    @Given("^I am a Chrome user$")
    public void i_am_a_chrome_user()  {

    }

    @When("^I access facebook$")
    public void i_access_facebook() throws Exception {
        ConfigFileReader cfr = new ConfigFileReader();
        driver.get(cfr.getApplicationURL("FacebookURL"));
    }

    @When("^I access Booking$")
    public void i_access_booking() throws Exception {
        ConfigFileReader cfr = new ConfigFileReader();
        driver.get(cfr.getApplicationURL("BookingURL"));
    }

    @Then("^I see facebook$")
    public void i_see_facebook()  {

    }

    @When("^I access Facebook home page$")
    public void i_access_Facebook_home_page() throws Exception {
        ConfigFileReader cfr = new ConfigFileReader();
        driver.get(cfr.getApplicationURL("FacebookURL"));

    }
   @Then("^I see \"([^\"]*)\" exists$")
    public void i_see_fieldName_exists(String fieldName){
       PageFactory.initElements(driver, FacebookLoginPage.class);
        Assert.assertEquals(true,FacebookLoginPage.isWebElementExists(fieldName));
       info(fieldName+" is verified");

   }


    @When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void i_enter(String fstName, String surNam,String email, String newpswd,String dob, String gender) {
        PageFactory.initElements(driver, FacebookLoginPage.class);
        FacebookLoginPage.SignUp(fstName,surNam,email,newpswd,dob,gender);
    }

    @When("^I click \"([^\"]*)\" button$")
    public void i_click_button(String arg1) {
    }

    @Then("^I see new account created succesfully$")
    public void i_see_new_account_created_succesfully() {
    }



}
