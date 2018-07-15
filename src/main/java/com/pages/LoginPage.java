package com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Locators which present on that page 
import com.pagedriver.Pagedriver;

public class LoginPage extends Pagedriver {

	public void userNameField(String data) {
		//sendKeysByXpath("//input[@placeholder='Username']", data);
	}

	public void passwordField(String data) {
		//sendKeysByXpath("//input[@placeholder='Password']", data);
	}

	public void loginButton() {
		clickByXpath("//span[text()='Login']");
	}
	
	
	// -------------------------------------------------------------------------------//
	public void Selectroundtrip(){
		clickWithexecuteJavaScriptByXpath("//label[@for='switch__input_2']");
	}
	public void selectfrom(){
		clickWithexecuteJavaScriptByXpath("//input[@tabindex='1']");
	}
	public void SelectCityFrom(String data){
		selectFromDropDownWithOutSelectClass("//li[@class='ui-menu-item']", data);
	}
	
	public void SelectCityTo(String data){
		selectFromDropDownWithOutSelectClass("//li[@class='ui-menu-item']", data);
	}
	public void SelectMonthPicker(String data){
		sendKeysByXpath("//span[@class='ui-datepicker-month']",data);
	}
	public void selectDatefromCalender(String data){
		selectFromDropDownWithOutSelectClass("//a[@class='ui-state-default']",data);
	}
	public void SelectToDate(String data){
		selectFromDropDownWithOutSelectClass("//a[@class='ui-state-default']",data);
	}
	public void SelectFromclass(){
		clickWithexecuteJavaScriptByXpath("//input[@id='hp-widget__paxCounter_pot']");
	}
	public void Selectclass(String data){
		clickByXpath("//input[@value='1 | Economy']");
		clickByXpath("//span[text()='Premium Economy']");
	}
	
	public void clickOnSearchButton(){
		clickByID("searchBtn");
	}
	
	
	//------------------------------------------------//
	public void SelectfromAdvertise(){
		clickWithexecuteJavaScriptByXpath("//a[@style='text-decoration: none; color: #292929; font-size: 12px;']");
	}
	public void selectbyviewSample(){
		clickWithexecuteJavaScriptByXpath("//a[@id='aviewsample1']");
	}
	//--------------------------------------------------------------//
	public  void Selectbyrent(){
		clickWithexecuteJavaScriptByXpath("//input[@id='Rent_radio']");
	}

	public void SelectRegister(){
		clickByXpath("//a[@id='aregister']");	
	}
	public void selectRegisterradiobuttonforbroker(){
		clickByXpath("//input[@id='broker']");
	}
	public void slectuserNameForRegister(String data){
		sendKeysByXpath("//input[@name='txtusername']",data);
	}
	public void Selectregisterpassword(String data){
		sendKeysByXpath("//input[@id='txtregpassword']",data);
	}
	public void Selecttsetconfirmpassword(String data){
		sendKeysByXpath("//input[@id='txtconfpass']",data);
	}
	
	public void SlectComapnyname(String data){
		sendKeysByXpath("//input[@id='textcompanyname']",data);
	}
	public void Selectagentname(String data){
		sendKeysByXpath("//input[@id='textagntname']",data);
	}
	public void SelectStatebyname(){
		selectValueFromDropDownByText("//select[@id='dropstates']","Andaman and Nicobar Islands");
	}
	public void SelectCityBYregister(){
		selectValueFromDropDownByText("//select[@id='dropcities']","Port Blair");
	}
	public void Selectregisterphonenumber(String data){
		sendKeysByXpath("//input[@name='textlandline']",data);
	}
	public void SelectregisterforMobileNumber(String data){
		sendKeysByXpath("//input[@name='textmobile']",data);
	}
	public void selectRegisterEmail(String data){
		sendKeysByXpath("//input[@name='email']",data);
	}
	public void SelectregisterCapta(String data){
		sendKeysByXpath("//input[@name='RegCaptcha']",data);
	}
	public void checkboxSelectRegister(){
		checkfromCheckBoxByXpath("//input[@id='agree']");
	}
	//---------------------------------------------------------------------------------------------//
	public void checkBuilderCheckBox() {
		
		checkfromCheckBoxByXpath("//input[@id='checkBuilder']");
	}

	public void SelectcheckListYourproperty() {
		clickByXpath("//img[@onclick='checklistyourproperty()']");
	}

	public void SelectSearchproByid() {
		clickByXpath("//a[@id='SearchProByID']");
	}

	public void SelectBYPropertyxpath(String data) {
		sendKeysByXpath("//input[@class='textBox']", data);
	}

	

	public void SelectGoButton() {
		clickByXpath("//input[@value='Go']");
	}
	public void SelectSearchProject() {
		clickByXpath("//li[@class='signin1']");
	}
	public void SelectRadioButtonFromSearchProject(){
		clickByXpath("//input[@value='2']");
	}

	public void SelectFromState() {
		selectValueFromDropDownByText("//select[@id='dropprojectstate']", "Andaman and Nicobar Islands");
	}

	public void SelectFromCity() {
		selectValueFromDropDownByText("//select[@id='selectsearchprojectcity']", "Port Blair");
	}

	public void SelectSearchButtonFromProject() {
		clickByXpath("//a[@class='searchBtnSmall']");
	}
	public void SelectSearchAgent(){
		clickByXpath("//a[@id='tdsearchagent']");
	}
	public void SelectAgentSearchAgentState(){
		selectValueFromDropDownByText("//select[@id='dropagentstate']","Uttar Pradesh");
	}
	public void SelectAgentSearchAgentCity(){
		selectValueFromDropDownByText("//select[@id='selectcitysearchagent']","Almora");
	}
	public void SelectAgentSearchButtonFromAgent() {
		clickByXpath("//a[@class='searchBtnSmall']");
	}
	public void SelectCheckBoxBYSearchAgent(){
		clickByXpath("//input[@id='chkResidentialApartment']");
	}
	public void SelectCheckchkIndependentHouseVilla(){
		clickByXpath("//input[@id='chkIndependentHouse/Villa']");
	}
	public void ShopShowroomBYSearchAgent(){
		clickByXpath("//input[@id='chkCommercialShops/Showrooms']");
	}
	public void SelectHomeForSearchAgent(){
		clickByXpath("//li[@class='home_link']");
	}
	public void SelectCheckBoxBYRent(){
		clickByXpath("//input[@id='checkRent']");
	}
	public void SelectSearchByBuyerTenant(){
		clickByXpath("//a[@id='tdsearchbuyertenant']");
	}
	public void SelectBuyerTenantState(){
		selectValueFromDropDownByText("//select[@id='dropbuyerstate']","Andhra Pradesh");
	}
	public void SelectBuyerTenantCity(){
		selectValueFromDropDownByText("//select[@id='selectsearchbuyercity']","Adilabad");
	}
	public void SelectBuyerTenantAmount(){
		selectValueFromDropDownByText("//select[@name='Selectbudget']","Below 7 Lacs");
	}
	//java Script Executer//
	public void SelectSearchButtonBuyerTenant(){
		clickWithexecuteJavaScriptByXpath("//a[@class='searchBtnSmall']");
		//clickByXpath("//a[@class='searchBtnSmall']");
	}
	public void SelectSearchPg(){
		clickWithexecuteJavaScriptByXpath("//a[@id='tdsearchpg']");
		//clickByXpath("//a[@id='tdsearchpg']");//
	}
	
	 public void SelectSearchPgRadioButton(){
		 clickByXpath("//input[@value='2']");
	 }
	public void SelectSearchPgState(){
		selectValueFromDropDownByText("//select[@id='droppgstate']","Andaman and Nicobar Islands");
	}
	
	public void SelectSearchFromSearchPgFromCity(){
		selectValueFromDropDownByText("//select[@id='droppgcity']","Port Blair");
	}
	public void SelectSearchButtonSearchPg(){
		clickByXpath("//a[@class='searchBtnSmall']");
	}
 
	public void selectRadioButtonForBuy() {
		clickByXpath("//a[@rel='buy_radio']");
	}

	public void SelectRadioButtonByRent() {
		clickByID("//input[@id='Rent_radio']");
	}

	public void selectFromDelhiNcr() {
		clickByXpath("//a[@href='property-in-Delhi']");
	}

	public void selectFramHouseFromDropDown() {
		selectValueFromDropDownByText("//select[@id='dropsearchpropertytype']", "Farm House");
	}

	public void selectResidentialLandFromDropDown() {
		selectValueFromDropDownByText("//select[@id='dropsearchpropertytype']", "Residential Land");
	}

	public void selectstudioApartmentfromdropDown() {
		selectValueFromDropDownByText("//select[@id='dropsearchpropertytype']", "Studio Apartment");
	}

	public void selectServicedApartmentsfromdropdown() {
		selectValueFromDropDownByText("//select[@id='dropsearchpropertytype']", "Serviced Apartments");
	}

	public void selectOfficeinITParkfromdropdown() {
		selectValueFromDropDownByText("//select[@id='dropsearchpropertytype']", "Office in IT Park");
	}

	public void selectWareHouseFromDropDown() {
		selectValueFromDropDownByText("//select[@id='dropsearchpropertytype']", "Ware House");
	}

	public void selectDelhiNorthFromDropDown() {
		selectValueFromDropDownByText("//select[@id='dropstates2']", "Delhi North");
	}

	public void SelectBudgetFromDropDown() {
		selectValueFromDropDownByText("//select[@id='SelectBudgetForProperty']", "40 to 90 Thousand");
	}

	public void SelectSearchButton() {
		clickByXpath("//a[@class='searchButton']");
	}

}
