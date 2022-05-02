package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");

	// Start Edge Session
	WebDriver driver = new EdgeDriver();
	
	
	for (int i = 0; i < 10; i++) {
		
	
	driver.get("https://google.com");
	
	WebElement search = driver.findElement(By.name("q"));
	
	search.sendKeys("solitary man");
	
	Robot n=new Robot();
	
	n.keyPress(KeyEvent.VK_ENTER);
	n.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(2000);
	//driver.close();
	}
	}
}
