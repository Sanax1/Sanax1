package org.day7selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q6 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("http://greenstech.in/selenium-course-content.html");

		TakesScreenshot tk = (TakesScreenshot) d;
		JavascriptExecutor js = (JavascriptExecutor) d;

		WebElement jp = d.findElement(By.xpath("//a[text()='RPA']"));
		js.executeScript("arguments[0].scrollIntoView(false)", jp);

		File ssrc = tk.getScreenshotAs(OutputType.FILE);
		File sdes = new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test" 
		+ "\\screen shot day 7\\Q6.png");

		FileUtils.copyFile(ssrc, sdes);

			Thread.sleep(1010);
		d.close();

	}

	
}
