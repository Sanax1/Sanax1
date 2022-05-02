package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day3q7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\\\\\\\Users\\\\\\\\shankar_sanax\\\\\\\\eclipse-workspace\\\\\\\\Test\\\\\\\\driver\\\\\\\\msedgedriver.exe");

		WebDriver d = new EdgeDriver();

		d.get("https://www.cleartrip.com/trains");

		WebElement too = d.findElement(By.xpath("//input[@title=\'From station\']"));
		Thread.sleep(1000);
				too.click();too.sendKeys("Erode");
		WebElement from = d.findElement(By.xpath("//input[@title=\"To station\"]"));
				from.click();from.sendKeys("Gohad Road");
		WebElement clas = d.findElement(By.xpath("//select[@title=\"Class\"]"));
			clas.click();
		WebElement fclass = d.findElement(By.xpath("//option[@value=\"1A\"]"));
			fclass.click();
		
		WebElement date = d.findElement(By.id("dse-quicksearch"));
		date.click();date.sendKeys("13/3/2022");
		
		
		
		Thread.sleep(10000);
		d.close();
	}

}
