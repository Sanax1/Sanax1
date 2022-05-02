package org.day8sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q1 {

	private static void screenshot(WebDriver d, String e) throws WebDriverException, IOException {
		TakesScreenshot tk = (TakesScreenshot) d;
		FileUtils.copyFile(tk.getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\ss day 9 sel\\" + e));
	}

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		// TakesScreenshot tk = (TakesScreenshot) d;
		d.get("http://demo.automationtesting.in/Alerts.html");
		WebElement findElement = d.findElement(By.xpath("//button[@onclick=\'alertbox()\']"));
		findElement.click();
		Thread.sleep(2010);
		Alert a = d.switchTo().alert();
		Thread.sleep(2010);
		a.dismiss();
		// FileUtils.copyFile(tk.getScreenshotAs(OutputType.FILE),
		// new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\ss day 9
		// sel\\Q1.png"));
		screenshot(d, "q3]\'" + ".png");// c=screen shot used as method
		Thread.sleep(2010);
		d.close();

	}

}
