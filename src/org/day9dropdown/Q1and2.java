package org.day9dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1and2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("http://demoqa.com/automation-practice-form/");
		Thread.sleep(1010);
		WebElement all = d.findElement(By.xpath("//div[text()='Select State']"));
		
		Select al = new Select(all);
		List<WebElement> options = al.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getAccessibleName());
		}
		
		int i = options.size();
//		int sum = 0;
		for (int j = 0; j < i; j++) {

			if (j % 2 == 0) {

				System.out.println();
			}			
			}
		

		Thread.sleep(1010);

		d.close();
	}

}
