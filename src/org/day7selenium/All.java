package org.day7selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class All {

	
	
		
		
	public static void screenshot(WebDriver d, String e) throws WebDriverException, IOException {
		TakesScreenshot tk = (TakesScreenshot) d;
		FileUtils.copyFile(tk.getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\ss day 9 sel\\" + e));
	}
	
	
	
}
