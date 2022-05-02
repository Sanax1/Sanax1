package org.day9dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q811 {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\shankar_sanax\\eclipse-workspace\\Test\\driver\\msedgedriver.exe");
	WebDriver d = new EdgeDriver();
	d.manage().window().maximize();
	d.get("http://adactinhotelapp.com/");
	Thread.sleep(1010);
	d.findElement(By.id("username")).sendKeys("forevershankar");
	d.findElement(By.id("password")).sendKeys("123456789");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Select l=new Select(d.findElement(By.id("location")));
	//all location
	List<WebElement> options = l.getOptions();
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());}
	l.selectByIndex(3);
	Select h=new Select(d.findElement(By.id("hotels")));
	h.selectByIndex(2);
	Select rt=new Select(d.findElement(By.id("room_type")));
	//all room type
	List<WebElement> options2 = rt.getOptions();
	for (WebElement webElement : options2) {
		String text = webElement.getText();
		System.out.println(text);
	}
	rt.selectByIndex(3);
	//adult room tupe
	WebElement art = d.findElement(By.id("adult_room"/*type*/));
	Select artt=new Select(art);
	List<WebElement> options3 = artt.getOptions();
	for (WebElement webElement : options3) {
		System.out.println(webElement.getText());
	}artt.selectByIndex(4);
	Thread.sleep(2022);
d.close();
	}
}
