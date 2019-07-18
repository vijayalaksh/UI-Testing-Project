package com.UITesting;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) throws Throwable 
	{
				
		try 
		{
			
		sendMail();
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage().toString());
		}
		
		
	}
	
	public static void sendMail() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a)[7]")));
		signin.click();
		
		Set<String> AllWindowHandles = driver.getWindowHandles();		
		String window2 = (String) AllWindowHandles.toArray()[1];
		driver.switchTo().window(window2);
		 
	     WebElement emailid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		 emailid.sendKeys("neelamvermamsc");

	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	   
	    WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));  
	    pwd.sendKeys("neelamtarun@9826");	
	    
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	    WebElement compose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));
	    compose.click();
	    
	   
	    WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='to']")));
	    to.sendKeys("neelamv2602@gmail.com");
	    
	    WebElement subject =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='subjectbox']")));
	    subject.sendKeys("Test mail");
		
		WebElement mailBody = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=':hh']")));
		mailBody.sendKeys("Hi,"); 
		mailBody.sendKeys(Keys.ENTER); 
		mailBody.sendKeys("Test mail from Automation");
		mailBody.sendKeys(Keys.ENTER);
		mailBody.sendKeys("Thank You.");
		
		WebElement send = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=':g2']")));
		send.click();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();
	    WebElement singout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign out']")));
		singout.click();
		driver.quit();
		
	}

}
