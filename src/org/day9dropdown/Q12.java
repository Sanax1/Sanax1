package org.day9dropdown;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(1010);
		WebElement all = d.findElement(By.id("fruits"));
		Select al = new Select(all);
		List<WebElement> options = al.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		int i = options.size();

		for (int j = 0; j < i; j++) {
			
			al.selectByIndex(j);
		}
		WebElement firstSelectedOption =
									al.getFirstSelectedOption();
		System.out.println("\nfirst selected option\n" 
								+ firstSelectedOption.getText());

		Thread.sleep(1010);
		Thread.sleep(1010);
		Thread.sleep(1010);

		d.close();
	}
}
