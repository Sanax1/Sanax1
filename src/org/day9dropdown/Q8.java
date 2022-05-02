package org.day9dropdown;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8 extends Q8login {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		Q8 q=new Q8();
		q.login();
		Select l=new Select(d.findElement(By.id("location")));
		l.selectByIndex(3);
//		WebElement firstSelectedOption = l.getFirstSelectedOption();
//		String sl = firstSelectedOption.getText();
		
		
		
		
		
		Thread.sleep(2022);
		d.close();

	}
}
