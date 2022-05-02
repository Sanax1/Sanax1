package org.day8sele;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		// d.manage().window().maximize();
		d.get("http://demo.automationtesting.in/Alerts.html");
		WebElement findElement = d.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		findElement.click();
		d.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
		Thread.sleep(510);
		Alert a = d.switchTo().alert();
		Thread.sleep(610);
		String text = a.getText();
		System.out.println(text);
		a.accept();

		 Thread.sleep(1110);
		d.close();

	}

}
