package pfe.log240.selenium.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {
	
	WebDriver driver;
	
	public void invokebrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexis\\Desktop\\PFE\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://localhost:8009/");
			//demanderNouveauCompteEpargne();
			//afficherInfoCompte();
			//faireDepotCompteEpargne();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void demanderNouveauCompteEpargne(){
		try {
			driver.findElement(By.linkText("Login Here")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("abc123");
			Thread.sleep(3000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Go TO Customer Page")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Choose an Account")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Saving Account")).click();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void afficherInfoCompte(){
		try {
			driver.findElement(By.linkText("Login Here")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("abc123");
			Thread.sleep(3000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(6000);
			driver.findElement(By.linkText("Go TO Customer Page")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Saving Account : 1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("info")).click();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void faireDepotCompteEpargne(){
		try {
			driver.findElement(By.linkText("Login Here")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("abc123");
			Thread.sleep(3000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(6000);
			driver.findElement(By.linkText("Go TO Customer Page")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Saving Account : 1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("amount")).sendKeys("1000");
			Thread.sleep(3000);
			driver.findElement(By.className("btn")).click();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.invokebrowser();
	}

}
