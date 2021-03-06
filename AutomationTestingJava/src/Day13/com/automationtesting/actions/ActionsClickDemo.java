package Day13.com.automationtesting.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		// Normal Click using Actions Class
		WebElement submitButton = driver.findElement(By.xpath("//*[@id='submitbtn']"));
		Actions action = new Actions(driver);
		action.moveToElement(submitButton).click().perform();
		
		// count the number of elements
		List<WebElement> buttons = driver.findElements(By.xpath("//button"));
		int buttonCount = buttons.size();
		System.out.println("Total Number of Buttons: "+ buttonCount);
	}
}
