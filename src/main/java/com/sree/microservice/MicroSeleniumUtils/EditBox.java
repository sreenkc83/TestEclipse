package com.sree.microservice.MicroSeleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditBox {

	private String locatorType;
	private String locatorDescription;
	private String dataValue;

	@Autowired
	private GlobalProperties glb;

	private WebDriver driver;

	public String getLocatorType() {
		return locatorType;
	}

	public void setLocatorType(String locatorType) {
		this.locatorType = locatorType;
	}

	public String getLocatorDescription() {
		return locatorDescription;
	}

	public void setLocatorDescription(String locatorDescription) {
		this.locatorDescription = locatorDescription;
	}

	public String getDataValue() {
		return dataValue;
	}

	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

	public EditBox() {
		super();
	}

	public boolean setValue(String locatorType, String locatorDescription, String dataValue) {
		By useLocator = null;		
		if (locatorType.equalsIgnoreCase("id")) {
			useLocator = By.id(locatorDescription);
		} else
			return false;
		glb.driver.findElement(useLocator).sendKeys(dataValue);
		return true;
	}

}
