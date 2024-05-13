package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class SearchMerchantPage extends SeleniumWrapper {
	
	private WebDriver driver;
	private SeleniumWrapper wrapper;
	
	public SearchMerchantPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		this.wrapper= new SeleniumWrapper(driver);
	}
	
	
	private By getSearchField = By.xpath("//input[@type=\"text\"]");
	
	private By getEyeIcon = By.xpath("(//button[@type=\"button\"])[7]");
	
	private By getPosConfiguration = By.xpath("(//*[.='Pos Configuration'])[1]");
	
	private By getInventoryTab = By.xpath("(//*[.='Inventory'])[1]");
	
	private By getCreateInvBtn = By.xpath("(//button[@type=\"button\"])[3]");
	
	
	private By getNameonPosField = By.xpath("//input[@name=\"posName\"]");
	
	
	private By getPriceField = By.xpath("//input[@name=\"price\"]");
	
	
	private By getQuantityField = By.xpath("//input[@name=\"quantity\"]");
	
	private By getSubCategoryRadioBtn = By.xpath("//input[@value=\"10386\"]");
	
	private By getTaxRateCheckBox = By.xpath("//input[@value=\"4385\"]");
	
	private By getProductTypeRadioBtn = By.xpath("//input[@value=\"cover\"]");
	
	private By getSubMenuCheckBox = By.xpath("//input[@value=\"10577\"]");
	
	private By getConfirmCreateInvBtn = By.xpath("(//*[.='Create'])[1]");
	
	private By getSaveMakeLiveBtn = By.xpath("(//*[.='Save & Make Live'])[2]");
	
	private By getBergTab = By.xpath("(//*[.='Berg Config'])[1]");
	
	private By getCreateBergBtn = By.xpath("(//*[.='Create'])[3]");
	
	private By getBergModelRequireErrMsg = By.xpath("//*[.='berg Model is required']");
	
	private By getPortNumberRequireErrMsh = By.xpath("//*[.='Port Number is Required']");
	
	private By getIPAddressRequireErrMSg = By.xpath("//*[.='Ip Address is required']");
	
	private By getRingNumberRequireErrMsg = By.xpath("//*[.='Ring Number is required']");
	
	private By getCreateBtn = By.xpath("(//*[.='Create'])[3]");
	
	private By getBergModel = By.xpath("//*[.='AB1504']");
	
	private By getSomethingWentWrongErrMsg = By.xpath("//*[.='Some thing went wrong.']");
	
	private By getBergModelInputField = By.xpath("//div[@aria-haspopup=\"listbox\"]");
	
	private By getPortNumberInputField = By.xpath("//input[@name=\"port\"]");
	
	private By getIpAddressInputField = By.xpath("//input[@name=\"ipAddress\"]");
	
	private By getRingNumberInputField = By.xpath("//input[@name=\"ringNumber\"]");
	
	
	
	public void clickingOnBegTab() {
		wrapper.clickElement(getBergTab);
	}
	public void clickOnCreateBergBtn() {
		wrapper.clickElement(getCreateBergBtn);
	}
	
	public boolean verifyBergModelRequireErrMsg(String expectedText) {
		return wrapper.verifyText(getBergModelRequireErrMsg, expectedText);
	}
	public boolean verifyPortNumberRequireErrMsh(String expectedText) {
		return wrapper.verifyText(getPortNumberRequireErrMsh, expectedText);
	}
	public boolean verifyIPAddressRequireErrMSg(String expectedText) {
		return wrapper.verifyText(getIPAddressRequireErrMSg, expectedText);
	}
	public boolean verifygetRingNumberRequireErrMsg(String expectedText) {
		return wrapper.verifyText(getRingNumberRequireErrMsg, expectedText);
	}
	
	public void clickingOnCreateBergBtn() {
		wrapper.clickElement(getCreateBtn);
	}
	public void selectBergModal() {
		wrapper.clickElement(getBergModel);
	}
	
	public boolean verifySomethingWentWrongErrMsg(String expectedText) {
		return wrapper.verifyText(getSomethingWentWrongErrMsg, expectedText);
	}
	
	public void clickOnBergModelField() {
		wrapper.clickElement(getBergModelInputField);
	}
	
	public void enterPortNumber(String portNumber) {
		wrapper.typeText(getPortNumberInputField, portNumber);
	}
	
	public void enterIpAddress(String ipAddress) {
		wrapper.typeText(getIpAddressInputField, ipAddress);
	}
	
	public void enterRingNumber(String ringNumber) {
		wrapper.typeText(getRingNumberInputField, ringNumber);
	}
	
	
	public void searchMerchantName(String merchantName) {
		wrapper.typeText(getSearchField, merchantName);
		
	}
	
	public void clickOnEyeIcon() {
		wrapper.clickElement(getEyeIcon);
	}
	
	public void clickOnPOSConfiguration() {
		wrapper.clickElement(getPosConfiguration);
	}
	
	public void clickOnInventoryTab() {
		wrapper.clickElement(getInventoryTab);
	}
	
	public void clickOnCreateInvBtn() {
		wrapper.clickElement(getCreateInvBtn);
	}
	
	public void enterPOSName(String posName) {
		wrapper.typeText(getNameonPosField, posName);
	}
	
	public void enterPrice(String price) {
		wrapper.typeText(getPriceField, price);
	}
	
	public void enterQuantity(String quantity) {
		wrapper.typeText(getQuantityField, quantity);
	}

	public void selectSubCategory() {
		wrapper.clickElement(getSubCategoryRadioBtn);
	}
	
	public void selectTaxRate() {
		wrapper.clickElement(getTaxRateCheckBox);
	}
	
	public void selectProductType() {
		wrapper.clickElement(getProductTypeRadioBtn);
	}
	public void selectSubmenu() {
		wrapper.clickElement(getSubMenuCheckBox);
	}
	public void clickOnConformCreateMerchantBtn() {
		wrapper.clickElement(getConfirmCreateInvBtn);
	}
	public void clickOnSaveMakeLiveBtn() {
		wrapper.clickElement(getSaveMakeLiveBtn);
	}
	
	
	
	
	public void createInventoryItems() throws IOException, ParseException {
		searchMerchantName(wrapper.getTestData("CreateInventory.SearchField"));
		clickOnEyeIcon();
		clickOnPOSConfiguration();
		clickOnInventoryTab();
		clickOnCreateInvBtn();
		enterPOSName(wrapper.getTestData("CreateInventory.POSName"));
		enterPrice(wrapper.getTestData("CreateInventory.Price"));
		enterQuantity(wrapper.getTestData("CreateInventory.Quantity"));
		selectSubCategory();
		selectTaxRate();
		selectTaxRate();
		selectProductType();
		selectSubmenu();
		clickOnConformCreateMerchantBtn();
		clickOnSaveMakeLiveBtn();
	}
	
	
	
}
