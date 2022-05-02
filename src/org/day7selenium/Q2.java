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

public class Q2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		JavascriptExecutor js = (JavascriptExecutor) d;
		TakesScreenshot tk = (TakesScreenshot) d;

		d.get("https://toolsqa.com/");
		d.manage().window().maximize();

		// WebElement target = d.findElement(By.xpath("//a[text()='Latest Articles']"));
		WebElement target = d.findElement
				(By.xpath("//div[@aria-label='Carousel Navigation']"));
		js.executeScript("arguments[0]"
				+ ".scrollIntoView(false)", target);

		Thread.sleep(1000);
		File sssrc = tk.getScreenshotAs
				(OutputType.FILE);
		File sdes = new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\screen shot day 7\\seday7q2.png");

		FileUtils.copyFile(sssrc, sdes);
		Thread.sleep(1000);
		d.close();

	}

}
