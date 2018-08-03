package com.sree.microservice.MicroSeleniumUtils;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralUtilsController {

	@Autowired
	private EditBox editBox;

	@Autowired
	private Web_Common comm;

	@Autowired
	private GlobalProperties glb;

	private WebDriver driver;
	
	@GetMapping(value = "/sendkeys/{locatorType}/{locatorDescription}/{dataValue}")
	public boolean editBox_SetData(@PathVariable String locatorType, @PathVariable String locatorDescription,
			@PathVariable String dataValue) {
		comm.getDriver();
		comm.LaunchBrowser();
		comm.NavigateToURL("");
		editBox.setValue("id", "lst-ib", "csre");
		return true;
	}

}
