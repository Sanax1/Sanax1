package org.day8sele;

import java.io.IOException;

import org.day7selenium.All;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q6 extends All {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		// d.manage().window().maximize();
		d.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement findElement = d.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
		findElement.click();
		d.findElement(By.xpath("//input[@id='Button2']")).click();
		screenshot(d,"q6.png");
//		d.switchTo().alert().getText();
//		d.switchTo().alert().accept();
		Alert a = d.switchTo().alert();
		Thread.sleep(610);
//		String text = a.getText();
//		System.out.println(text);
		a.accept();
//		screenshot(d,"q61.png");
		 Thread.sleep(1110);
		d.close();

	}
}
