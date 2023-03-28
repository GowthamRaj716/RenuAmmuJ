package org.stepdefinition;

import java.io.File;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before
	public void befSce1() {
		
		openChromeBrowser();
		applyImplicitWait(10);
	}
	
	@After(order = 2)
	public void aftSce(Scenario s ) {
		
		
		String str = s.getName();
		System.out.println(str);
		
		
		
//		if (s.isFailed()) {
//			
//			TakesScreenshot tk = (TakesScreenshot) driver;
//			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
//			s.embed(screenshot, "image/png");
//		}
	}

	@After(order = 1)
	public void aftSce1() {

		closeBrowser();
	}

}
