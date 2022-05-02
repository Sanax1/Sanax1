package org.day8sele;

import java.io.IOException;

import org.day7selenium.All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q8 extends All {
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		// d.manage().window().maximize();
		d.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement iframe = d.findElement(By.xpath("//iframe"));
		d.switchTo().frame(iframe)	;
	//	d.switchTo().frame(d.findElement(By.xpath("//iframe[@id='Revamp_Banner_ID']")));
		d.findElement(By.xpath("//input[@id='DUMMY1']")).click();
		d.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"))
		.sendKeys("forevershankar");

		WebElement pass = d.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("q1212312");
		Thread.sleep(510);
		// d.switchTo().frame("login_page");
		WebElement login = d.findElement(By.id("VALIDATE_CREDENTIALS1"));
		screenshot(d, "Q81.png");
		login.click();
		screenshot(d, "q82.png");
		Thread.sleep(1110);
		d.close();

		// a[@ondblclick="return fLogon()"]
	}

}
