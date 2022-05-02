package org.day7selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q4 {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("http://www.greenstechnologys.com/");

		TakesScreenshot tk = (TakesScreenshot) d;
		JavascriptExecutor js = (JavascriptExecutor) d;

		js.executeScript("arguments[0].scrollIntoView(false)",
				d.findElement(By.xpath("//span[text()='Greens " + "technology Perumbakkam']")));

		File ss = tk.getScreenshotAs(OutputType.FILE);
		File ssdes = new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\screen shot day 7\\q4.png");
		FileUtils.copyFile(ss, ssdes);

		Thread.sleep(1010);
		d.close();

	}

}
