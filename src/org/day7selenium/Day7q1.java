package org.day7selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day7q1 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");

		WebDriver d = new EdgeDriver();

		d.get("http://www.greenstechnologys.com/");

		TakesScreenshot tk = (TakesScreenshot) d;
		// JavascriptExecutor js=(JavascriptExecutor)d;

		File sssrc = tk.getScreenshotAs(OutputType.FILE);

		File ssdes = new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\screen shot day 7\\greens.png");

		FileUtils.copyFile(sssrc, ssdes);
		
		d.close();

	}
}
