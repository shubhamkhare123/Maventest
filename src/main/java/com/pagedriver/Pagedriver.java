package com.pagedriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagedriver {

	public static WebDriver driver;
	public static final int PASS = 1;
	public static final int FAILURE = 2;
	public static Properties properties;

	public static void loadConfigfileproperties() {
		// Created file object
		File file = new File("C:\\Users\\shailam\\workspace\\FrameworkProper\\config.properties");

		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		properties = new Properties();

		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public void startSessionActual() {
		if (properties.getProperty("browserName").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverPath"));
			driver = new ChromeDriver();

		} else if (properties.getProperty("browserName").equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", properties.getProperty("gecoDriverPath"));
			driver = new ChromeDriver();

		} else if (properties.getProperty("browserName").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.gecko.driver", properties.getProperty("edgeDriverPath"));
			driver = new ChromeDriver();

		} else {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void openUrl(String urlValue) {
		driver.get(urlValue);
	}

	public void teardown() {
		driver.close();
	}

	public void clickbyXXpath(String XpathValue) {
		List<WebElement> element = driver.findElements(By.xpath(XpathValue));
		((WebElement) element).click();
	}

	public void clickByXpath(String xpathValue) {
		// It will return webelement
		WebElement element = driver.findElement(By.xpath(xpathValue));

		// It will will wait for webelement
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(element));

		// It is clicking on webelement
		element.click();
	}

	public void clickByID(String idValue) {
		WebElement element = driver.findElement(By.id(idValue));
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void clickByCssSelector(String CssSelectorValue) {
		WebElement element = driver.findElement(By.cssSelector(CssSelectorValue));
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void clickByClassName(String classNameValue) {
		WebElement element = driver.findElement(By.className(classNameValue));
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void clickByName(String nameValue) {
		WebElement element = driver.findElement(By.name(nameValue));
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void sendKeysByXpath(String xpathValue, String data) {
		WebElement element = driver.findElement(By.xpath(xpathValue));
		WebDriverWait WebDriverWait = new WebDriverWait(driver, 20);
		WebDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(data);
	}

	public void sendKeysByCssSelector(String CssSelectorValue, String data) {
		WebElement element = driver.findElement(By.cssSelector(CssSelectorValue));
		element.clear();
		element.sendKeys(data);
	}

	public void sendKeysByID(String idValue, String data) {
		WebElement element = driver.findElement(By.id(idValue));
		WebDriverWait WebDriverWait = new WebDriverWait(driver, 20);
		WebDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(data);
	}

	public void sendKeysByname(String nameValue, String data) {
		WebElement element = driver.findElement(By.name(nameValue));
		WebDriverWait WebDriverWait = new WebDriverWait(driver, 20);
		WebDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(data);
	}

	public String getTextByXpath(String xpathValue) {
		WebElement element = driver.findElement(By.xpath(xpathValue));
		WebDriverWait WebDriverWait = new WebDriverWait(driver, 20);
		WebDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		return element.getText();
	}

	public void clickonChildFrameByXpath(String xpathValue) {
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames present in screen is " + frames.size());

		for (int i = 0; i <= frames.size(); i++) {

			driver.switchTo().frame(i);
			if (driver.findElement(By.xpath(xpathValue)).isDisplayed()) {
				System.out.println("Element found on the frame " + i);
				driver.findElement(By.xpath(xpathValue)).click();
				driver.switchTo().defaultContent();
				break;
			}

			driver.switchTo().defaultContent();
		}
	}

	public void switchToFrame(int i) {
		driver.switchTo().frame(i);
	}

	public void switchToDefaults() {
		driver.switchTo().defaultContent();
	}

	public void selectValueFromDropDownname(String nameValue, String data) {
		WebElement element = driver.findElement(By.name(nameValue));

		Select dropdown = new Select(element);
		dropdown.selectByValue(data);
	}

	public void selectValueFromDropDownbyid(String idValue, String data) {
		WebElement element = driver.findElement(By.id(idValue));

		Select dropdown = new Select(element);
		dropdown.selectByValue(data);
	}

	public void selectValueFromDropDownbyxpath(String xPathValue, String data) {
		WebElement element = driver.findElement(By.xpath(xPathValue));
		Select dropdown = new Select(element);
		dropdown.selectByValue(data);
	}

	public void selectValueFromDropDownByText(String xpathValue, String data) {
		WebElement element = driver.findElement(By.xpath(xpathValue));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(data);
	}

	public void selectValueFromDropDownByindex(String xpathValue, String data) {
		WebElement element = driver.findElement(By.xpath(xpathValue));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(data);
	}

	public void selectValueFromDropDownByValue(String xpathValue, String data) {
		WebElement element = driver.findElement(By.xpath(xpathValue));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(data);
	}

	// This created new 24-june-2018
	public void pause(int pauseDuration) {
		try {
			Thread.sleep(pauseDuration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// This created new 24-june-2018
	public void checkfromCheckBoxByXpath(String xpath) {

		WebElement element = driver.findElement(By.xpath(xpath));
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
		element.click();
	}

	// This created new 24-june-2018
	public void checkfromCheckBoxByID(String idvalue) {
		WebElement element = driver.findElement(By.id(idvalue));
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void checkfromCheckBoxBycssSelector(String cssSelectorvalue) {
		WebElement element = driver.findElement(By.id(cssSelectorvalue));
		WebDriverWait webDriverWaitwait = new WebDriverWait(driver, 20);
		webDriverWaitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	// This created new 24-june-2018
	public void selectRadioButtonByXpath(String xpathValue) {
		WebElement element = driver.findElement(By.xpath(xpathValue));
		element.click();
	}

	public void selectRadioButtonByid(String idValue) {
		WebElement element = driver.findElement(By.id(idValue));
		element.click();

	}

	public void selectRadioButtonByname(String nameValue) {
		WebElement element = driver.findElement(By.name(nameValue));
		element.click();

	}

	// ------TakeScreenShot----------------------//
	public void takeScreenshort(String testCaseID) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Selenium\\Screenshorts\\" + testCaseID + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// ----javaScriptExecuter----------------//
	public void clickWithexecuteJavaScriptByXpath(String xpathValue) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(xpathValue)));
	}

	public void clickWithexecuteJavaScriptByname(String nameValue) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.name(nameValue)));
	}

	public void clickWithexecuteJavaScriptByid(String idValue) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id(idValue)));
	}

	public void clickWithexecuteJavaScriptBycssSelector(String cssSelectorValue) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.cssSelector(cssSelectorValue)));
	}

	public void clickWithexecuteJavaScriptBypartialLinkText(String partialLinkTextValue) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.partialLinkText(partialLinkTextValue)));
	}

	public void clickWithexecuteJavaScriptBytagName(String tagNameValue) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.tagName(tagNameValue)));
	}

	public void senkeysWithexecuteJavaScriptByXpath(String xpathValue, String data) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(xpathValue)));
	}

	public void selectFromDropDownWithOutSelectClass(String xpath, String valueToSelect) {

		List<WebElement> list = driver.findElements(By.xpath(xpath));
		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains(valueToSelect)) {
				System.out.println("Inside if ");
				list.get(i).click();
				break;
			}
		}

	}

	public void selectDatefromCalender(String xpathValue, String dateValue) {

		List<WebElement> dates = driver.findElements(By.xpath(xpathValue));
		for (int i = 0; i <= dates.size() - 1; i++) {
			System.out.println(dates.get(i).getText());
			if (dates.get(i).getText().contains(dateValue)) {
				System.out.println("Inside if ");
				dates.get(i).click();
				break;
			}
		}

	}
	public void Selectclassfrom(String XpathValue,String classValue){
		List<WebElement> lists = driver.findElements(By.xpath(XpathValue));
		for (int i = 0; i <= lists.size() - 1; i++) {
			System.out.println(lists.get(i).getText());
			if (lists.get(i).getText().contains(classValue)) {
				System.out.println("Inside if ");
				lists.get(i).click();
				break;
			}
		}

	}

}
