package com.bdd.example.stepdefinations;

import com.bdd.example.DiscountService;
import org.junit.Assert;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.*;

public class DiscountServiceTest {
	DiscountService service = null;
	String percentage = "";
    private Integer int1;

	@Given("^Execute DiscountService Business$")
	public void execute_DiscountService_Business() throws Throwable {
		service = new DiscountService();
	}

	@When("if i will enter {int}")
	public void if_i_will_enter(int amount) throws Throwable {
		percentage = service.getDiscount(amount);
	}

	@Then("^we should get ten percentage discount$")
	public void we_should_get_ten_percentage_discount() throws Throwable {
		Assert.assertEquals("10%", percentage);
	}

	@Then("^we should get fifteen percentage discount$")
	public void we_should_get_fifteen_percentage_discount() throws Throwable {
		Assert.assertEquals("15%", percentage);
	}

	@Then("^we shouldn't get any percentage$")
	public void we_shouldn_t_get_any_percentage() throws Throwable {
		Assert.assertEquals("NA", percentage);
	}
}

