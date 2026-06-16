package definitions;

import java.util.List;

import org.testng.Assert;

import actions.AddressAction;
import actions.HomeActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressStepDefinitions {
	
	HomeActions ha = new HomeActions(Hooks.driver);
	AddressAction aa = new AddressAction(Hooks.driver);
	

	@Given("the user is logged-in")
	public void the_user_is_logged_in() {
	    Helper.login();
	}

	@Given("the user is on address page")
	public void the_user_is_on_address_page() {
	   aa.clickAddressBookLink();
	}

	@When("the user clicks the new address button")
	public void the_user_clicks_the_new_address_button() {
	    aa.clicknewAddressButton();
	}

	@When("the user fills the form fields")
	public void the_user_fills_the_form_fields(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> data = dataTable.asLists().get(0);
		
		aa.fillFormFileds(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6));
	}

	@When("the user clicks the continue button")
	public void the_user_clicks_the_continue_button() {
	    aa.clickContinueButton();
	}

	@Then("the success message should be displayed as {string}")
	public void the_success_message_should_be_displayed_as(String string) {
	    String message =  aa.getGreetMessage();
	    
	    Assert.assertEquals(message, string);
	}
}
