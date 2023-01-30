package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public void precondition() {
		launchBrowser();
		windowMaximize();
	}
	@After
	public void postcondition() {
		quitBrowser();
	}
}
