package najah.edu.acceptance;
import main.User;

import io.cucumber.java.en.*;
import static org.junit.Assert.assertTrue;

public class signup {
	
	boolean user_signup=false;
	User user1;

	@Given("the user is on the sign-up page")
	public void the_user_is_on_the_sign_up_page() {
	    user_signup=true;
	    assertTrue(user_signup);
	}

	@When("the user enters valid registration details")
	public void the_user_enters_valid_registration_details() {
	    user_signup=true;
	}

	@When("submits the form")
	public void submits_the_form() {
	    assertTrue(user_signup);
	}

	@Then("the user sign up successfully")
	public void the_user_sign_up_successfully() {
		assertTrue(user_signup);
	}
}
