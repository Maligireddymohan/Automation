package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Sole_Registration;

public class AdditionalDetailUpdate {
	
	
	public WebDriver driver;
	
	public Sole_Registration AdditionalDetails;

	
	 @When("^User should view review page$")
     public String user_should_view_review_page()  {
		 
		 driver=new EdgeDriver();
		 AdditionalDetails=new Sole_Registration();
		 driver.get("https://d3t331mvgv7oxd.cloudfront.net/");
		 return null;
			
	 }
	 
	 @When("^User cliks on edit button to update additional information$")
	 public void user_cliks_on_edit_button_to_update_additional_information() {
		 
		 AdditionalDetails.personalInfoEditButton();
		 
	 }
	 
	 @Then("^User updates Nationality as \"([^\"]*)\" $")
	 public void user_updates_nationality_as_something(String Nationality) {
		 
		 AdditionalDetails.nationalityUpdate(Nationality);
		 
	 }
	 
	 @And("^User Updates Home Number as \"([^\"]*)\"$")
	 public void user_updates_home_number_as_something(String HomeNumber) {
		 
		AdditionalDetails.personalInfoHomeNumber(HomeNumber);
	 }
	  

	 @And("^User Updates Residential Address as \"([^\"]*)\"$")
	 public void user_updates_residential_address_as_something(String residentialAddress)  {
		 AdditionalDetails.personalInfoResidentialAddress(residentialAddress);
	       
	 }
	 
	 @And("^User updates US resident as \"([^\"]*)\"$")
	 public void user_updates_us_resident_as_something(String TIN)  {
	  
		 	AdditionalDetails.userUpdatesResident(TIN);
		 	
	    }

	 @And("^User updates Marketing preferences as \"([^\"]*)\"$")
	 public void user_updates_marketing_preferences_as_something()  {
	        	
	    	AdditionalDetails.userUpdatesMarketingPreferences();
	    }

	 @And("^User updates contact preferences as \"([^\"]*)\"$")
	 public void user_updates_contact_preferences_as_something() {
		 
		 	AdditionalDetails.userUpdatesContacPreferences();
	        
	    }

	 @Then("^Click on Save button$")
	    public void click_on_save_button() {
	    	
	    	AdditionalDetails.personalInfoSave();
	    }
	}
	 
	 
	 
	
	

	
	


