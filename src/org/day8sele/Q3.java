package org.day8sele;

import java.io.IOException;

import org.day7selenium.All;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q3 extends All {
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		// d.manage().window().maximize();
		d.get("http://demo.automationtesting.in/Alerts.html");
		WebElement findElement = d.findElement(By.xpath("//a[@href='#Textbox']"));
		findElement.click();
		d.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(510);
		Alert a = d.switchTo().alert();
		Thread.sleep(610);
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Sanax");
		a.accept();
		screenshot(d,"q3.png");
		 Thread.sleep(1110);
		d.close();

	}


}
