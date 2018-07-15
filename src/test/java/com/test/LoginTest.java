package com.test;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pagedriver.Pagedriver;
import com.pages.LoginPage;
import com.pages.MainActivityPage;

public class LoginTest extends Pagedriver{

	@BeforeTest
	public void startSession() {
		loadConfigfileproperties();
		startSessionActual();
		openUrl(properties.getProperty("url"));
	}

	@AfterTest
	public void closeSession() {
		teardown();
	}

	@AfterMethod
	public void checkStatus(ITestResult result) {
		System.out.println("Test Cases status is " + result.getStatus());
		if (ITestResult.FAILURE == result.getStatus()) {
			takeScreenshort(result.getName());
		}
	}

	// @Test(priority = 1)
	public void loginTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage();
		MainActivityPage mainActivityPage = new MainActivityPage();
		loginPage.userNameField(properties.getProperty("username"));
		loginPage.passwordField(properties.getProperty("password"));
		loginPage.loginButton();
		Assert.assertEquals(mainActivityPage.mainActivityButonText(), "Main Activity");
	}

	// @Test(priority = 2)
	public void dropdown() throws InterruptedException {

		MainActivityPage mainActivityPage = new MainActivityPage();
		mainActivityPage.clickoManageCompany();
		mainActivityPage.clickOnNew();
		mainActivityPage.companyName("xyz");
		mainActivityPage.selectCompanyType("Manufacturing");

	}

	// @Test(priority = 1)
	public void dropdown1() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.SelectSearchproByid();
		pause(10000);
		LoginPage.SelectBYPropertyxpath("123");
		pause(1000);
		LoginPage.SelectGoButton();
		pause(1000);

	}

	// @Test(priority = 2)
	public void searchproject() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.SelectSearchProject();
		pause(1000);
		LoginPage.SelectRadioButtonFromSearchProject();
		LoginPage.SelectFromState();
		pause(1000);
		LoginPage.SelectFromCity();
		pause(1000);
		LoginPage.SelectSearchButtonFromProject();
		pause(1000);
	}

	// @Test(priority = 3)
	public void SearchAgent() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.SelectSearchAgent();
		pause(1000);
		LoginPage.SelectAgentSearchAgentState();
		pause(1000);
		LoginPage.SelectAgentSearchAgentCity();
		pause(1000);
		LoginPage.SelectAgentSearchButtonFromAgent();
		pause(1000);
		LoginPage.SelectCheckBoxBYRent();
		pause(1000);
		LoginPage.SelectCheckchkIndependentHouseVilla();
		pause(1000);
		LoginPage.ShopShowroomBYSearchAgent();
		pause(1000);
		LoginPage.SelectHomeForSearchAgent();
	}

	// @Test(priority = 4)
	public void SelectBuyerTenant() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.SelectSearchByBuyerTenant();
		pause(1000);
		LoginPage.SelectBuyerTenantState();
		pause(1000);
		LoginPage.SelectBuyerTenantCity();
		pause(1000);
		LoginPage.SelectBuyerTenantAmount();
		pause(1000);
		LoginPage.SelectSearchButtonBuyerTenant();
		pause(1000);
	}

	// @Test(priority = 5)
	public void SelectSearchPg1() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.SelectSearchPg();
		pause(1000);
		LoginPage.SelectSearchPgRadioButton();
		LoginPage.SelectSearchPgState();
		pause(1000);
		LoginPage.SelectSearchFromSearchPgFromCity();
		pause(1000);
		LoginPage.SelectSearchButtonSearchPg();
		pause(1000);
	}

	// @Test(priority=6)
	public void SelectRegister() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.SelectRegister();
		pause(1000);
		LoginPage.selectRegisterradiobuttonforbroker();
		pause(1000);
		LoginPage.slectuserNameForRegister("sunny");
		pause(1000);
		LoginPage.Selectregisterpassword("password");
		pause(1000);
		LoginPage.Selecttsetconfirmpassword("passwor");
		pause(1000);
		LoginPage.SlectComapnyname("maxxton");
		pause(1000);
		LoginPage.Selectagentname("manish joshi");
		pause(1000);
		LoginPage.SelectStatebyname();
		pause(1000);
		LoginPage.SelectCityBYregister();
		pause(1000);
		LoginPage.Selectregisterphonenumber("9026578765");
		pause(1000);
		LoginPage.SelectregisterforMobileNumber("8860788640");
		pause(1000);
		LoginPage.selectRegisterEmail("shubhambca182@gmqmail.com");
		pause(1000);
		LoginPage.SelectregisterCapta("6454");
		pause(1000);
		LoginPage.checkboxSelectRegister();
		pause(1000);
	}

	// @Test(priority=7)
	public void selectcity() {
		LoginPage Login = new LoginPage();
		Login.Selectbyrent();
		pause(10000);
	}

	// @Test(priority=8)
	public void COntactuswith() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.SelectfromAdvertise();
		LoginPage.selectbyviewSample();
		pause(10000);
	}

	@Test(priority = 9)
	public void make() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.Selectroundtrip();
		pause(1000);
		LoginPage.selectfrom();
		pause(1000);
		LoginPage.SelectCityFrom("Doha, Qatar");
		pause(1000);
		LoginPage.SelectCityTo("Goa, India");
		pause(1000);
		LoginPage.selectDatefromCalender("22");
		pause(1000);
		LoginPage.SelectToDate("29");
		pause(1000);
		LoginPage.Selectclass("Premium Economy");
		pause(1000);
		LoginPage.clickOnSearchButton();
		pause(20000);
	}

}
