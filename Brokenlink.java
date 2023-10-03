package Framework;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.FaasTriggerValues;

public class Brokenlink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver bl = new ChromeDriver();
		bl.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*
		 * String
		 * url=bl.findElement(By.xpath("//a[contains(@href,'soap')]")).getAttribute(
		 * "href");
		 * 
		 * System.out.println(url); URL u = new URL(url); HttpURLConnection uc =
		 * (HttpURLConnection) new URL(url).openConnection();
		 * uc.setRequestMethod("HEAD"); uc.connect(); int code = uc.getResponseCode();
		 */

		WebElement footer = bl.findElement(By.id("gf-BIG"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		SoftAssert sa = new SoftAssert();
		// List <WebElement> links=bl.findElements(By.xpath("//li[@class ='gf-li']/a"));
		// System.out.println(links);
		for (WebElement Link : links) {
			String uRLname = Link.getAttribute("href");
			HttpURLConnection url = (HttpURLConnection) new URL(uRLname).openConnection();
			url.setRequestMethod("HEAD");
			url.connect();
			int code = url.getResponseCode();
			sa.assertFalse(code >400, "the link: " + Link.getText() + " is broken at code " + code);

		}
		sa.assertAll();
	}

}
