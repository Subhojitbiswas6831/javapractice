package Framework;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.FaasTriggerValues;

public class FilterSTreams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//String name = sc.nextLine();
		driver.findElement(By.id("search-field")).sendKeys("rice");
		List<WebElement> column1 = driver.findElements(By.xpath("//tr/td[1]"));

		List<WebElement> filteredList = column1.stream().filter(s -> s.getText().equalsIgnoreCase("Rice"))
				.collect(Collectors.toList());
		Assert.assertEquals(column1.size(), filteredList.size());
		

	}

}
