package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}

}
