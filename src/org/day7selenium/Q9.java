package org.day7selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q9 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		TakesScreenshot tk = (TakesScreenshot) d;

		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement fbar = d.findElement(By.xpath("//input[@name=\"q\"]"));
		fbar.sendKeys("iphone");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Actions ac = new Actions(d);

		ac.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Women')]"))).perform();
		Thread.sleep(3010);

		File ssrc = tk.getScreenshotAs(OutputType.FILE);
		File sdes = new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test" + "\\screen shot day 7\\Q9.png");
		FileUtils.copyFile(ssrc, sdes);

		Thread.sleep(3010);
		d.close();
	}

}
