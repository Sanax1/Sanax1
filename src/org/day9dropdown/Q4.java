package org.day9dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4 {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
	WebDriver d = new EdgeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	Thread.sleep(1010);
	d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(1010);
	WebElement yr = d.findElement(By.id("month"));
	yr.click();
	Select s = new Select(yr);
	List<WebElement> options = s.getOptions();

	for (WebElement webElement : options) {

		System.out.println(webElement.getText());
	}

	Thread.sleep(1010);

	d.close();
	
	
	
	
	
}	
	
	
	
	
	
	

}
