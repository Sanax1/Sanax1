package org.day9dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q8login  {
	
	public void login() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
	 WebDriver d = new EdgeDriver();
	d.manage().window().maximize();
	d.get("http://adactinhotelapp.com/");
	Thread.sleep(1010);
	d.findElement(By.id("username")).sendKeys("forevershankar");
	d.findElement(By.id("password")).sendKeys("123456789");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
