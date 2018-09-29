package com.sree.microservice.MicroSeleniumUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:Global.properties")
@ConfigurationProperties
public class GlobalProperties {

	@Autowired
	private Web_Common comm;

	private static String BrowserType;
	public static WebDriver driver;

	public String getBrowserType() {
		System.out.println("sreenu - borwser type is " + BrowserType);
		return BrowserType;
	}

	public void setBrowserType(String browserType) {
		BrowserType = browserType;
	}

	public static WebDriver getDriver() {
		// comm.getDriver();
		if (driver == null) {
			if (BrowserType.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
				GlobalProperties.driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
				GlobalProperties.driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public void setDriver(WebDriver driver) {
		GlobalProperties.driver = driver;
	}

}
