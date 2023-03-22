package com.timetracking.actitime.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.HomePage;
import POM.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility wUtils=new WebDriverUtility();
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Data base connection has been established");
	}

	@BeforeClass
	public void bcConfig() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("The Browser has been launched");
		wUtils.implicitWait(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("The URL has been navigated");
	}
	
	@BeforeMethod
	public void bmConfig() {
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		System.out.println("The Login was successfull");
	}
	
	@AfterMethod
	public void amConfig() {
		HomePage home=new HomePage(driver);
		home.logoutAction();
		System.out.println("The Logout was successfull");
	}
	
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("The Browser has been Closed");
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("Data base connection has been Closed");
	}

}
