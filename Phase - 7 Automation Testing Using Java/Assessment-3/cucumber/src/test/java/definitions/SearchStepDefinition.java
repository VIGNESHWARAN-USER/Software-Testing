package definitions;

import org.testng.Assert;

import actions.HomeActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
	
	HomeActions ha = new HomeActions(Hooks.driver);
	String message = new String("");
	
	@When("give the search key {string} and click enter")
	public void give_the_search_key_and_click_enter(String string) {
	    message = ha.checkValidSearchKey(string);
	}

	@Then("the assertion should be as {string}")
	public void the_assertion_should_be_as(String string) {
	    Assert.assertEquals(message, string);
	}

}
