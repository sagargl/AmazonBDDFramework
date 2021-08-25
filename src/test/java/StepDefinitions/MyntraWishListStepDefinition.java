package StepDefinitions;

import com.qa.base.TestBase;
import com.qa.pages.MyntraWishList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyntraWishListStepDefinition extends TestBase{
	MyntraWishList wish=new MyntraWishList();
	

	@When("User Clicks on the MenHover Screen")
	public void user_clicks_on_the_men_hover_screen() {
	    initialization();
	    boolean value=wish.MenHover();
	    
	}

	@Then("User Clicks on Sweaters")
	public void user_clicks_on_t_shirts() throws InterruptedException {
	   wish.SweatersClick();
	}

}
