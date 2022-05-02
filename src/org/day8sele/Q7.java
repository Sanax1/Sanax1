package org.day8sele;

import java.io.IOException;

import org.day7selenium.All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q7 extends All {
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		// d.manage().window().maximize();
		d.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		d.switchTo().frame("login_page");

		d.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]")).sendKeys("forevershankar");

		WebElement button = d.findElement(By.xpath("//a[text()='CONTINUE']"));
		button.click();
		Thread.sleep(510);
		// d.switchTo().frame("login_page");
		d.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("1234354");
		;
		d.findElement(By.xpath("//a[@ondblclick=\"return fLogon()\"]")).click();
		screenshot(d, "q7.png");
		Thread.sleep(1110);
		d.close();

		// a[@ondblclick="return fLogon()"]
	}

}
