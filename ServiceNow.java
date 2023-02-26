package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		WebElement uname=driver.findElement(By.id("user_name"));
		uname.sendKeys("admin");
		WebElement pass=driver.findElement(By.id("user_password"));
		pass.sendKeys("P-qQ7@umSYz8");
		WebElement Button=driver.findElement(By.id("sysverb_login"));
		Button.click();
		WebElement inc=driver.findElement(By.id("filter"));
		inc.sendKeys("proposal");
		WebElement my=driver.findElement(By.xpath("//div[text()='My Proposals']"));
		my.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement New=driver.findElement(By.xpath("//button[text()='New']"));
		New.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
//		WebElement num=driver.findElement(By.xpath("(//div[@class='col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls'])[1]"));
//
//		String num1=num.getText();
//		System.out.println(num1);
		WebElement tt=driver.findElement(By.id("std_change_proposal.short_description"));
		tt.sendKeys("mukesh");
		WebElement sub=driver.findElement(By.xpath("(//button[text()='Submit'])[1]"));
		sub.click();
		
		WebElement create=driver.findElement(By.xpath("//td[contains(text(),'mukesh')]"));
		String nn=create.getText();
	String name = "mukesh";
		if(nn.contains(name)) {
			System.out.println("successfully created");
			
			
		}
	
		
		
	}

}
