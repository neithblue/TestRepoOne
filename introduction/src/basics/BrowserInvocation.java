package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInvocation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");

		// System.setProperty("webdriver.ie.driver",
		// "C:\\apps\\IEDriverServer.exe");
		// WebDriver driverIE = new InternetExplorerDriver();
		// driverIE.get("http://www.qaclickacademy.com");
	}

}
