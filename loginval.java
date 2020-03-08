package Seliniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.write.Label;

public class loginval {
	WebDriver driver; 
	@BeforeTest
	public void m1() {
		System.out.println("before test executed");
		 
	}
	@Test(priority=1)	
	public void log() {
		System.setProperty("webdriver.chrome.driver", "E:\\automation selinium\\chromedriver.exe");
		 driver=new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
			
		 driver.findElement(By.linkText("Sign in")).click();  
		 
		//driver.getCurrentUrl();
	
		 
	}
	@Test(priority=2)
	public void createacc() throws InterruptedException {
		//driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		 driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("nansaikri@gmail.com");
		 Thread.sleep(200);
		driver.findElement(By.xpath("//*[@name='SubmitCreate']")).click();
		driver.navigate().forward();
	//String S=driver.getCurrentUrl();
		Thread.sleep(4000);
		 WebElement radio1 = driver.findElement(By.xpath("//*[@id='id_gender1']"));
		 WebElement radio2 = driver.findElement(By.xpath("//*[@id='uniform-id_gender2']"));
			radio2.click();
		

		 Thread.sleep(200);
		 driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("polamarasetty");
		 Thread.sleep(200);
			driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Revathi");
			 Thread.sleep(500);
		
			 driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("10l31a0580");
			 driver.findElement(By.id("days")).sendKeys("9");
			 driver.findElement(By.id("months")).sendKeys("july");
			 driver.findElement(By.id("years")).sendKeys("1992");
			 Thread.sleep(4000);
			 WebElement CHB1=driver.findElement(By.xpath("//*[@id='newsletter']"));
			 WebElement CHB2=driver.findElement(By.xpath("//*[@id='optin']"));
			 CHB2.click();
			 driver.findElement(By.xpath("//*[@id='company']")).sendKeys("syntel");
			 driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Flat 206");
			 driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("Street2");
			 driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Visakhapatnam");
			 driver.findElement(By.id("id_state")).sendKeys("California");
			 driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("00000");
			 driver.findElement(By.xpath("//*[@id='other']")).sendKeys("nothing");
			 driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("987654321");
			 driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("5234376");
			 driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("reva");
			 driver.findElement(By.xpath("//*[@name='submitAccount']")).click();
			 Thread.sleep(7000);
				
				//Password testin
				if(
						 driver.findElement(By.xpath("//*[@id='my-account']")).isDisplayed())
				{
					System.out.println("login Succesful");
					driver.findElement(By.linkText("Sign out")).click(); 
					
				}
				
				else
				{
					System.out.println("login unsuccesful");
				}
			 
			 
			 
			 
			
	}
	
	@Test(priority=3)
	public void login() throws InterruptedException   {
		 //driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("polamarasettirevathi@gmail.com");
		 driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("10l31a0580");
				 driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
				 driver.navigate().forward();
				 driver.findElement(By.linkText("Women")).click();
				 driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")).click();
				 driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
				
		Thread.sleep(500);
		driver.close();
	}

}
