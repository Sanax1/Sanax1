package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day3q3 {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		
		WebDriver d=new EdgeDriver();
		
		d.get("http://demo.automationtesting.in/Register.html");
		
		WebElement fname = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		fname.sendKeys("shankar");
		
WebElement lname = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		lname.sendKeys("nagarajan");
		
		WebElement add = d.findElement(By.xpath("//textarea[@rows=\"3\"]"));
		add.sendKeys("no6nagarachinagar\nsolarpudur\nerode");
		
		
		
		WebElement email = d.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("forevershankar@gmail.com");
		
		WebElement phone = d.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9543134766");
		
		d.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		d.findElement(By.id("checkbox1")).click();
		

		
	}
	
	
	
}
