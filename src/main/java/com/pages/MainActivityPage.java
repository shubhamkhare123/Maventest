package com.pages;

import com.pagedriver.Pagedriver;

public class MainActivityPage extends Pagedriver {

	public String mainActivityButonText() {
		return getTextByXpath("//div[@class='panel-title panel-with-icon']");
	}

	public void clickoManageCompany() {
		clickByXpath("//a[@title='Manage Company']");
	}

	public void clickOnNew() {
		clickonChildFrameByXpath("//span[text()='New']");
	}

	public void companyName(String data) {
		switchToFrame(0);
		sendKeysByXpath("//input[@name='name']", data);
		switchToDefaults();
	}

	public void selectCompanyType(String data) {
		switchToFrame(0);
		selectValueFromDropDownname("//select[@name='type']", data);
		switchToDefaults();
	}
}
