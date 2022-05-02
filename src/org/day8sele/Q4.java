package org.day8sele;

import java.io.IOException;

import org.day7selenium.All;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q4 extends All {
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		// d.manage().window().maximize();
		d.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		d.switchTo().frame("login_page");
		screenshot(d, "q41.png");
		WebElement button = d.findElement(By.xpath("//a[text()='CONTINUE']"));
		button.click();
		Thread.sleep(510);
		Alert a = d.switchTo().alert();
		Thread.sleep(610);
		//screenshot(d, "q42.png");
		a.accept();
		//screenshot(d, "q43.png");
		Thread.sleep(1110);
		d.close();
		
		
		
		//a[text()='CONTINUE']
		//div[@class="col-sm-6 leftwrap fl"]
		//a[@class="btn btn-primary login-btn"]
	}

}
