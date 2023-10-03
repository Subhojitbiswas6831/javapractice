package Framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;

public class Selenium4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver s = new ChromeDriver();
		/*
		 * s.get("https://rahulshettyacademy.com/angularpractice/"); WebElement
		 * nameeditbox = s.findElement(By.xpath("//input[@name = 'name']"));
		 * System.out.println(s.findElement(with(By.tagName("label")).above(nameeditbox)
		 * ).getText()); WebElement
		 * dob=s.findElement(By.xpath("//label[@for = 'dateofBirth']")); WebElement
		 * checkbox = s.findElement(By.xpath("//label[@class = 'form-check-label']"));
		 * 
		 * s.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		 * WebElement status =s.findElement(By.id("inlineRadio1"));
		 * System.out.println(s.findElement(with(By.tagName("label")).toRightOf(status))
		 * .getText()); s.findElement(with(By.tagName("input")).below(dob)).click();
		 */
		// handle multiple windows
		// navigate to rahulshettyacademy.com
		s.get("https://rahulshettyacademy.com/angularpractice/");
		s.switchTo().newWindow(WindowType.TAB);
		Set<String> t = s.getWindowHandles();
		Iterator<String> it = t.iterator();
		String parentwindow = it.next();

		String childwindow = it.next();
		s.get("https://rahulshettyacademy.com/");
		String coursename = s.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p/')]")).get(1)
				.getText();
		s.switchTo().window(parentwindow);
		s.findElement(By.xpath("//input[@name = 'name']")).sendKeys(coursename);
		WebElement nameElement = s.findElement(By.xpath("//input[@name = 'name']"));
		
		File file=  s.findElement(By.xpath("//input[@name = 'name']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Logo.png"));
		
		//getHieght and width 
		System.out.println(nameElement.getRect().getDimension().getHeight());
		
		
		System.out.println(nameElement.getRect().getDimension().getWidth());

	}

}
