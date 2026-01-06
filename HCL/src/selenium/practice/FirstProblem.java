package selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstProblem {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinefeestechnocrats.in/LoginStudent.aspx?type=F");
		driver.findElement(By.id("Login1_UserName")).sendKeys("0567AL221005");
		driver.findElement(By.id("Login1_Password")).sendKeys("17062004");
		driver.findElement(By.name("Login1$LoginButton")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		Thread.sleep(10000);
		String currUrl = driver.getCurrentUrl();
		List<WebElement> fees = driver.findElements(
		        By.xpath("//table[@id='ctl00_cPanel_rdMiscHead']//label")
		);
		System.out.println("---- Miscellaneous Fees ----");

		for (WebElement fee : fees) {
		    System.out.println(fee.getText());
		}
		
		for (WebElement fee : fees) {
		    String text = fee.getText();   // e.g. Graduation Ceremony@ 1000.00
		    String amount = text.split("@")[1].trim();
		    System.out.println("Amount: " + amount);
		}

		
		System.out.println(currUrl);
		driver.quit();
	}
}
