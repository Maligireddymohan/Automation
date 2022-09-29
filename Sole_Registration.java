package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	
	public class Sole_Registration {
		
			public WebDriver driver;
			public JavascriptExecutor je;
			public Actions action;
		
		 /* // User Register sole onboarding sucessfully
			 @FindBy(xpath="//button[text()='Proceed to Application']")
			 WebElement registerSuccessfully;*/
			
		  // Review page Verification
		 	 String expText="Review Information";
			 @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/div[1]")
		     WebElement reviewText;
		   
		  // verifying Edit button
			 @FindBy(xpath="//p[text()='Personal Details ']")	
			  WebElement personlDetails;
			  
			 @FindBy (xpath="//button[text()='Edit']")
			  WebElement PersonalInfoeditDetails; 
			 
		  // User updates Nationality
			 @FindBy (xpath="//select[@name='nationality']")
			 WebElement nationality;
			 
			 
		  // User Updates Home Number
			 @FindBy(name="homeNumber")
			 WebElement personalInfohomeNumber;
			 
		  // Residential Address	 
			 
		     @FindBy(xpath="//input[@class='rbt-input-main form-control rbt-input']")
		     WebElement personalInfoResidentialAddress;
		     
		  // Us Resident update
		     
		     @FindBy(xpath="//*[@id=\"Ellipse_266\"]/circle[1]")
		      WebElement usResidentUpdate ;
		     
		     @FindBy(name="usCitizenTIN")
		     WebElement taxIdentificationNumber;
			
		  // Market Preference
		     @FindBy(name="SMS")
		     WebElement markeingPreferenceSMS;
		    
		     @FindBy(name="Email")
		     WebElement marketingPreferenceEmail;
		     
		  // Contact Preference
		     
		     @FindBy(xpath="//input[@value='email']")
		     WebElement contactPreferenceEmailUncheck;
		     @FindBy(name="Telephone")
		     WebElement contactPreferenceTelephone;
		     
		  // Save Button
		     
		     @FindBy(xpath="//button[text()='Save']")
		     WebElement additionalInfosave;
		  
	/* 
	    @Given("^User register with sole onboarding suscessfully$")
	    public void user_register_with_sole_onboarding_suscessfully()  {
	    	
	    	registerSuccessfully.click();
		
	    }*/
	   
	    public String personalInfoReviewPage()  {
	    	
	    	String actText=reviewText.getText();
	    	
	    	if(expText==actText) {
	    		
	    	}
			return actText;
	 
	    }
	
	    
	    
	    public void personalInfoEditButton() {
	    	
	    	PersonalInfoeditDetails.click();
	    	//scroll upto edit button
	    	je=(JavascriptExecutor)driver;
	    	je.executeScript("arugument[0].scrollIntoView", PersonalInfoeditDetails);
	    	PersonalInfoeditDetails.click();
	    
	    }

	    public void nationalityUpdate(String Nationality) {
	       
	    	nationality.sendKeys("Nationality");
	    	action=new Actions(driver);
	    	action.sendKeys(Keys.ARROW_DOWN).perform();
	    	action.sendKeys(Keys.ENTER).perform();
	 
	    }

	    public void personalInfoHomeNumber(String HomeNumber) {
	        
	    	personalInfohomeNumber.sendKeys(HomeNumber);
	    }

	   
	    public void personalInfoResidentialAddress(String residentialAddress)  {
	       
	    	personalInfoResidentialAddress.sendKeys(residentialAddress);
	    
	    //Select required address	
	    	
	    }

	   
	    public void userUpdatesResident(String TIN)  {
	  
	    	usResidentUpdate.click();
	    	taxIdentificationNumber.sendKeys(TIN);	
	   
	    }

	    
	    public void userUpdatesMarketingPreferences()  {
	    	 if(markeingPreferenceSMS.isSelected()) {
	    		 marketingPreferenceEmail.click();
	    	 }
	    }

	  
	    public void userUpdatesContacPreferences() {
	    	
	    	if(!contactPreferenceTelephone.isSelected()) {
	        
	    	contactPreferenceEmailUncheck.click();// To uncheck the selected option
	    	contactPreferenceTelephone.click();
	    	}
	 	
	    }

	   
	    public void personalInfoSave() {
	    	
	    	additionalInfosave.click();
	    	
	    }



	}
	    