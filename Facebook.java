package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup(); 
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("xxx");
        
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yyy");
        
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("r@gmail.com");
		
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("R@1616");
		
		WebElement daySource = driver.findElement(By.id("day"));  
		
		Select day = new Select(daySource);
		
		day.selectByVisibleText("06");
		
	    WebElement monthSource = driver.findElement(By.id("month"));
		
		Select month = new Select(monthSource);
		
		month.selectByVisibleText("Jul");
		
		WebElement yearSource = driver.findElement(By.id("year"));
		
		Select year = new Select(yearSource);
		
		year.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//input[@type = 'radio']/preceding-sibling::label[text() = 'Female']")).click();
}
}
