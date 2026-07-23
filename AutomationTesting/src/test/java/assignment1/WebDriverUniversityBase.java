package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUniversityBase {
	public WebDriver driver;
	
	public void initializeBrowser() {
		driver=new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() {
		driver.close();
		//driver.quit();
	}
	
	public static void main(String[] args) {
		WebDriverUniversityBase obj=new WebDriverUniversityBase();
		obj.initializeBrowser();

	}

}
