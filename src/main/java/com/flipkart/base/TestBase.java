package com.flipkart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public WebDriver driver;
	FileInputStream fis;
	Properties prop;

	public void launchBrowser() {

		try {
			fis = new FileInputStream(".\\src\\main\\resources\\Config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (prop.getProperty("Browser").equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (prop.getProperty("Browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void navigateToUrl() {

		driver.get(prop.getProperty("URL"));
	}
}
