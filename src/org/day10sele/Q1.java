package org.day10sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();

		d.get("https://www.amazon.com/");

		WebElement search = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone x");

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2030);

		Actions ac = new Actions(d);
		WebElement iph = d
				.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/81SSw14XZHL._AC_UY218_.jpg']"));
		// iph.click();
		ac.moveToElement(iph).perform();
		ac.contextClick().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4030);
		 d.close();
		// d.quit();

	}
}
