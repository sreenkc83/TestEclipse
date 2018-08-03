package com.sree.microservice.MicroSeleniumUtils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Web_Common {

	@Autowired
	private GlobalProperties glb;

	public void getDriver() {
		if (glb.driver == null) {
			if (glb.getBrowserType().equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
				glb.setDriver(new ChromeDriver());
			} else {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
				glb.setDriver(new ChromeDriver());
			}
		}
	}

	public void LaunchBrowser() {
		glb.getDriver();
	}
	
	public void NavigateToURL(String URL) {
		glb.driver.get("http://www.google.com");
	}
	
}
