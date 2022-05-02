package org.day9dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(1010);
		
		WebElement contry = d.findElement(By.xpath("//select[@name=\"country\"]"));
		Select ss=new Select(contry);
		
		List<WebElement> options = ss.getOptions();
		
		for (WebElement webElement : options) {
			String t = webElement.getText();
			
			System.out.println(t);
		}
		
		
		
		
		
		
		
		d.close();
	}
}