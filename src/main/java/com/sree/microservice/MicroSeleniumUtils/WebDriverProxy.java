package com.sree.microservice.MicroSeleniumUtils;

import org.openqa.selenium.WebDriver;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="MicroSelenium-Driver",url="localhost:8082")
public interface WebDriverProxy {

	//@GetMapping("/driver/get")
	//public WebDriver getDriver();
	
	@GetMapping("/driver/set/{drivertype}")
	public WebDriver setDriver(@PathVariable("drivertype") String drivertype);
		
}
