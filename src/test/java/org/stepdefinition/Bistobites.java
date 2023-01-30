package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.BistoPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bistobites extends BaseClass{
	BistoPojo bp = new BistoPojo();

	//	Scenario1
	
	@Given("The user enters the bistobites site")
	public void the_user_enters_the_bistobites_site() {
	   launchUrl("https://bistrobitesdc.com/");
	}
	
	@When("User clicks the account button")
	public void userClicksTheAccountButton() {
	    clickBtn(bp.getAccountbtn());
	}

	@When("Give the wrong username and password")
	public void giveTheWrongUsernameAndPassword() {
	    passText("8239823321", bp.getLoginphnno());
	    passText("Ashga@1451", bp.getLoginpassword());
	}

	@When("Click the login button")
	public void clickTheLoginButton() {
		clickBtn(bp.getLoginbtn());
	}

	@Then("Check the  output")
	public void checkTheOutput() {
	    WebElement errormsg = driver.findElement(By.xpath("//ul[@class='woocommerce-error']"));
	    String text = errormsg.getText();
	    System.out.println(text);
	}

//	Scenario2
	@Given("User launches bistobites url")
	public void userLaunchesBistobitesUrl() {
		launchUrl("https://bistrobitesdc.com/login#");
	}
	
	@When("User clicks the Home button")
	public void userClicksTheHomeButton() {
	    clickBtn(bp.getHomeBtn());
	}

	@When("User clicks the dosa")
	public void userClicksTheDosa() {
	   scrollThePage(bp.getDosabtn());
		clickBtn(bp.getDosabtn());
	}

	@When("User clicks the masala dosa option")
	public void userClicksTheMasalaDosaOption() {
	    clickBtn(bp.getMasaladosa());
	}

	@Then("Check the available time")
	public void checkTheAvailableTime() {
	   WebElement avltime = driver.findElement(By.xpath("(//span[text()='Available at 08:00 AM'])[1]"));
	   String text = avltime.getText();
	   System.out.println(text);
	}
//	Scenario3
	@Given("user enters the bistobites site")
	public void userEntersTheBistobitesSite() {
	   launchUrl("https://bistrobitesdc.com/");
	}

	@When("user click the account button")
	public void userClickTheAccountButton() {
	  
		clickBtn(bp.getAccountbtn());
	}

	@When("Fill out the registration form with dummy data")
	public void fillOutTheRegistrationFormWithDummyData() {
	    passText("santa", bp.getRegname());
	    passText("santa@gmail.com", bp.getRegemail());
	    passText("787627872", bp.getRegphnno());
	    passText("santa@1234", bp.getRegpassword());
	}

	@When("Click the register button")
	public void clickTheRegisterButton() {
		clickBtn(bp.getRegister());
	}

	@Then("get the popup")
	public void getThePopup() {
//	   Alert alert = driver.switchTo().alert();
//	   String text = alert.getText();
//	   System.out.println(text);
	}

//	Scenario4
	
	@Given("user launches bistobites site")
	public void userLaunchesBistobitesSite() {
	   launchUrl("https://bistrobitesdc.com/");
	}

	@When("user clicks the search icon")
	public void userClicksTheSearchIcon() {
	   clickBtn(bp.getSearchbtn());
	}

	@Then("user search the coke and check the dollar")
	public void userSearchTheCokeAndCheckTheDollar() throws AWTException {
	    passText("coke", bp.getSearchbar());
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

//	Scenario5
	
	@Given("user launches the  site of bistobites")
	public void userLaunchesTheSiteOfBistobites() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("user click the search icon")
	public void userClickTheSearchIcon() {
		clickBtn(bp.getSearchbtn());
	}

	@When("search spanish omelet")
	public void searchSpanishOmelet() throws AWTException {
		passText("spanish omelet", bp.getSearchbar());
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("select the option and check the dollar")
	public void selectTheOptionAndCheckTheDollar() {
	    clickBtn(bp.getSpanishomelet());
	    WebElement price = bp.getSoprice();
	    String text = price.getText();
	    System.out.println("The price is: $"+text);
	    
	}
//	Scenario6
	@Given("user visits bistobites site")
	public void userVisitsBistobitesSite() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("user click our story button")
	public void userClickOurStoryButton() {
	    clickBtn(bp.getStory());
	}

	@Then("check spelling mistakes")
	public void checkSpellingMistakes() {
	    
	}

	
}
