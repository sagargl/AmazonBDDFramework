package StepDefinitions;

import com.qa.base.TestBase;
import com.qa.pages.FlipKartLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipKartLoginStepDefinition extends TestBase {
	FlipKartLoginPage login=new FlipKartLoginPage();
	
	 public FlipKartLoginStepDefinition() {
		super();
		}
	

@Given("User Enters the FlipKart URL")
public void user_enters_the_flip_kart_url() {
	System.out.println("User is on landing page");
	 initialization();
	  
    }


@When("Sign In Button Present in Screen")
public void sign_in_button_present_in_screen() {
   System.out.println("Validate signin");
}

@Then("User Clicks on Sign In Button")
public void user_clicks_on_sign_in_button() throws InterruptedException {
	
	login.SignInAction(prop.getProperty("username"), prop.getProperty("password"));    
    }




}
