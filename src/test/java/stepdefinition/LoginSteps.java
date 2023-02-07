package stepdefinition;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
@Given("user is on login page")
public void user_is_on_login_page()  {
DriverFactory.getDriver().get("https://qa-access-key-corp.falabella.tech/auth/realms/stg-Jarvis/protocol/openid-connect/auth?client_id=jarvis-console-stg-falabella&redirect_uri=https%3A%2F%2Ffalabella-jarvis-staging.web.app%2Fapplication%2Fsettlements-front&response_type=code&scope=openid&state=9a030829bf13407db6b4faae37b4da58&code_challenge=bQ_U3oqnFXlk2Jwe86E-xfh18cdEqeSVJjKdMEy-dlk&code_challenge_method=S256&response_mode=query");
 System.out.println("I am on login page");
}

@When("^user checks the falabellaImage$")
public void user_checks_the_falabellaimage()  {
 boolean test=loginPage.isForgotPasswordLinkExists();
 if(test)
 {
	 System.out.println("I have opened the jarvis link");
 }
}

@Then("^user gets the title of the page$")
public void user_gets_the_title_of_the_page() {
    
}

@And("^user enters email id \"([^\"]*)\"$")
public void user_enters_email_id_something(String strArg1)  {
 loginPage.enterUserName(strArg1);
}

@And("^user enters password \"([^\"]*)\"$")
public void user_enters_password_something(String strArg1){
	loginPage.enterPassword(strArg1);
}

@And("^user clicks on Sign in button$")
public void user_clicks_on_sign_in_button() {
	loginPage.clickOnSignInButton();
}

@And("^title of the page is \"([^\"]*)\"$")
public void title_of_the_page_is_something(String strArg1)  {
  System.out.println("I am inside");
}
}
