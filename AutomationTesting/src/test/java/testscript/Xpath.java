package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	
	public void relativeXpath() {
		//tagname[@attribute='value']
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement enterdate1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showdate2=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement showdate1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement enterdate2=driver.findElement(By.xpath("//input[@id='single-input-field2']"));
	}
	
	public void text() {
		//tagname[text()='value']
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement gettotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement showdate=driver.findElement(By.xpath("//button[text()='Show Date']"));
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		WebElement startdownload=driver.findElement(By.xpath("//button[text()='Start Download']"));
	}
	
	public void containsAttribute() {
		//tagname[contains(@attribute,'value')]
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement input1=driver.findElement(By.xpath("//input[contains(@id,'input-field')]"));
		WebElement input2=driver.findElement(By.xpath("//input[contains(@id,'put-field2')]"));
		WebElement button1=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		WebElement button2=driver.findElement(By.xpath("//button[contains(@id,'two')]"));
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entervaluea=driver.findElement(By.xpath("//input[contains(@id,'a')]"));
	}
	
	public void containsText() {
		//tagname[contains(text(),'value')]
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessage=driver.findElement(By.xpath("//button[contains(text(),'Show Mes')]"));
		WebElement gettotal=driver.findElement(By.xpath("//button[contains(text(),'Get To')]"));
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement showdate=driver.findElement(By.xpath("//button[contains(text(),'Show Dat')]"));
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		WebElement startdownload=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
	}
	
	public void stratswithAttribute() {
		//tagname[starts-with(@attribute,'value']
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entervalue=driver.findElement(By.xpath("//button[starts-with(@id,'button-on')]"));
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		WebElement downloadbutton=driver.findElement(By.xpath("//button[starts-with(@id,'download')]"));
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement button1=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement button2=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
	}
	public void startswithText() {
		//tagname[starts-with(text(),'value')]
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement gettotal=driver.findElement(By.xpath("//button[starts-with(text(),'Get To')]"));
		WebElement showmessage=driver.findElement(By.xpath("//button[starts-with(text(),'Show Mes')]"));
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement showdate=driver.findElement(By.xpath("//button[starts-with(text(),'Show Dat')]"));
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		WebElement startdownload=driver.findElement(By.xpath("//button[starts-with(text(),'Start')]"));
	}
	
	public void and() {
		//tagname[@attribute='value' and @attribute='value']
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field' and @placeholder='Message']"));
		WebElement button1=driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		WebElement button2=driver.findElement(By.xpath("//button[@id='button-two' and @type='button']"));
		WebElement entervalue=driver.findElement(By.xpath("//input[@id='value-a' and @placeholder='Enter Value']"));

	}
	
	public static void main(String[] args) {
		Xpath obj=new Xpath();
		obj.browserInitialization();
		obj.stratswithAttribute();
		System.out.println("Method 1 executed");
		obj.startswithText();
		System.out.println("Method 2 executed");
		obj.and();
		System.out.println("Method 3 executed");
	}

}
