package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BistoPojo extends BaseClass{
	public BistoPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//span[contains(text(),'Account')])[2]")
	private WebElement accountbtn;
	@FindBy(id = "phone")
	private WebElement loginphnno;
	@FindBy(id = "password")
	private WebElement loginpassword;
	@FindBy(name = "login")
	private WebElement loginbtn;
	@FindBy(xpath = "(//a[@href='https://bistrobitesdc.com'])[3]")
	private WebElement homeBtn;
	@FindBy(xpath = "(//a[@class='lte-item'])[4]")
	private WebElement dosabtn;
	@FindBy(xpath = "//h2[text()='Masala Dosa']")
	private WebElement masaladosa;
	@FindBy(id = "name")
	private WebElement regname;
	@FindBy(id = "email")
	private WebElement regemail;
	@FindBy(xpath = "(//input[@id='phone'])[2]")
	private WebElement regphnno;
	@FindBy(id = "password_reg")
	private WebElement regpassword;
	@FindBy(xpath = "(//button[@name='login'])[2]")
	private WebElement register;
	@FindBy(xpath = "//li[@class='lte-nav-search']")
	private WebElement searchbtn;
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement searchbar;
	@FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
	private WebElement cokeamt;
	@FindBy(xpath = "//h2[text()='Spanish omelet']")
	private WebElement spanishomelet;
	@FindBy(id = "priceshow")
	private WebElement soprice;
	@FindBy(xpath = "//a[@href='https://bistrobitesdc.com/aboutus']")
	private WebElement story;
	
	public WebElement getStory() {
		return story;
	}
	public WebElement getSoprice() {
		return soprice;
	}
	public WebElement getSpanishomelet() {
		return spanishomelet;
	}
	public WebElement getCokeamt() {
		return cokeamt;
	}
	public WebElement getSearchbar() {
		return searchbar;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getRegname() {
		return regname;
	}
	public WebElement getRegemail() {
		return regemail;
	}
	public WebElement getRegphnno() {
		return regphnno;
	}
	public WebElement getRegpassword() {
		return regpassword;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getDosabtn() {
		return dosabtn;
	}
	public WebElement getMasaladosa() {
		return masaladosa;
	}
	public WebElement getHomeBtn() {
		return homeBtn;
	}
	public WebElement getAccountbtn() {
		return accountbtn;
	}
	public WebElement getLoginphnno() {
		return loginphnno;
	}
	public WebElement getLoginpassword() {
		return loginpassword;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
