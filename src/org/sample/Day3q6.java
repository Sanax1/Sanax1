package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3q6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\shankar_sanax\\\\eclipse-workspace\\\\Test\\\\driver\\\\msedgedriver.exe");

		WebDriver d = new EdgeDriver();

		d.get("https://www.redbus.in/");

		d.manage().window().maximize();
		WebElement button = d.findElement(By.xpath("//div[@class=\"icon-down icon ich dib icon-down_WO_BAL\"]"));
		button.click();

		// d.findElement(By.xpath(""));

		Actions ac = new Actions(d);
	//	d.manage().window().setSize(new Dimension(300, 500));
		
		ac.moveToElement(d.findElement(By.id("signInLink"))).click(d.findElement(By.id("signInLink"))).perform();
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		
		
		
	
		WebElement mobile = d.findElement(By.xpath("//input[@id=\'mobileNoInp\']"));
		
		js.executeScript("arguments[0].setAttribute('value','9543134766')", mobile);
		
		/*mobile.click();
		mobile.sendKeys("9543134766");
		*/
		
		

	}
}
