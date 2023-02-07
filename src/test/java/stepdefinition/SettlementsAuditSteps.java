package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.pages.SettlementsAuditPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettlementsAuditSteps {
	LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	SettlementsAuditPage settlementsAuditPage;
	  @Given("^User has already logged in Jarvis$")
	    public void user_has_already_logged_in_jarvis(DataTable datatable )  {
		  List<Map<String, String>> credList=datatable.asMaps();
		String username=  credList.get(0).get("username");
		String password=credList.get(0).get("password");
		DriverFactory.getDriver().get("https://qa-access-key-corp.falabella.tech/auth/realms/stg-Jarvis/protocol/openid-connect/auth?client_id=jarvis-console-stg-falabella&redirect_uri=https%3A%2F%2Ffalabella-jarvis-staging.web.app%2Fapplication%2Fsettlements-front&response_type=code&scope=openid&state=9a030829bf13407db6b4faae37b4da58&code_challenge=bQ_U3oqnFXlk2Jwe86E-xfh18cdEqeSVJjKdMEy-dlk&code_challenge_method=S256&response_mode=query");
		settlementsAuditPage=loginPage.loginWithUsernamePWD(username, password);
		
	       
	    }
    @Given("^user clicks on settlement audit tab$")
    public void user_clicks_on_settlement_audit_tab()  {
    	
    	settlementsAuditPage.clickOnAuditMenu();
    	settlementsAuditPage.clickOnAuditTab();
        
    }

    @When("^user clicks on the event dropdown$")
    public void user_clicks_on_the_event_dropdown()  {
     
    }

    @When("^user clicks on the audit dropdown$")
    public void user_clicks_on_the_audit_dropdown() {	
   settlementsAuditPage.clickOnAuditDropdown();
    }

    @Then("^events related to that sellerOrderLineId should be displayed$")
    public void events_related_to_that_sellerorderlineid_should_be_displayed() {
      
    }

    @Then("^transactions related to that sellerOrderLineId should be displayed$")
    public void transactions_related_to_that_sellerorderlineid_should_be_displayed() {
       
    }

    @And("^select (.+)$")
    public void select(String sellerOrderLineId)  {
        
    }

    @And("^click on search$")
    public void click_on_search()  {
       
    }

    @And("^user clicks on audit tab$")
    public void user_clicks_on_audit_tab()  {
       
    }

}
