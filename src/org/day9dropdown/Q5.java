package org.day9dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/r.php?msclkid=76a4eeffa55011ecab218238edb1438e");
		Thread.sleep(1010);
		WebElement yr = d.findElement(By.id("day"));
		yr.click();
		Select s = new Select(yr);
		List<WebElement> options = s.getOptions();
		
		

		for (WebElement webElement : options) {
				String da= webElement.getAttribute("value");
				int i = Integer.parseInt(da);
			if ((i% 2)==0) {
				System.out.println(i);
			}	
		}

		Thread.sleep(1010);

		d.close();

	}

}
