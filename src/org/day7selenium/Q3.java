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

public class Q3 {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://toolsqa.com/selenium-training?q=headers");
		d.manage().window().maximize();
		Thread.sleep(1010);
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		TakesScreenshot tk = (TakesScreenshot) d;

		WebElement print = d.findElement(By.xpath("//div[@class=\"col-12 col-md-6 col-lg-7\"]"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", print);
		WebElement print1 = d.findElement(By.xpath("//div[@class=\"certificate__advantage--text\"]"));
		Object out = js.executeScript("return arguments[0].getAttribute('value')", print1);
		System.out.println(out);
	
			
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\screen shot day 7\\seday7q3.png");
		FileUtils.copyFile(src, des);
		
		d.close();
		
		
	}
}
