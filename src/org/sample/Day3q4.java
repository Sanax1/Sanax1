package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day3q4 {

	public static void main(String[] args, org.openqa.selenium.Point targetPosition) {
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
		
		WebDriver d=new EdgeDriver();
		
		d.get("http://greenstech.in/selenium-course-content.html");
		d.findElement(By.xpath("//div[@id='heading20']")).click();
		
		d.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']")).click();
		
		d.manage().window().setSize(new Dimension(300,500));
		/*int x = d.manage().window().getPosition().getX();
		
		
		System.out.println(x);
		targetPosition=(20.100);
		int y=Location.y;
		d.manage().window().setPosition(x - 10,y - 20);
		*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
