package project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Mandatory {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev140572.service-now.com\r\n");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		WebElement un=driver.findElement(By.id("user_name"));
		un.sendKeys("admin");
		WebElement pw=driver.findElement(By.id("user_password"));
		pw.sendKeys("P-qQ7@umSYz8");
		WebElement click=driver.findElement(By.id("sysverb_login"));
		click.click();
		driver.switchTo().defaultContent();
		
		WebElement fil=driver.findElement(By.id("filter"));
		fil.sendKeys("Knowledge",Keys.ENTER);
		WebElement know=driver.findElement(By.xpath("//div[text()='Knowledge']"));
		know.click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		WebElement button=driver.findElement(By.xpath("(//button[@class='btn btn-primary']/span)[1]"));
		button.click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		WebElement rr=driver.findElement(By.id("lookup.kb_knowledge.kb_knowledge_base"));
		rr.click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windowHandle1=new ArrayList<String>(windowHandle);
		driver.switchTo().window(windowHandle1.get(1));
		
		WebElement it=driver.findElement(By.linkText("IT"));
		it.click();
		
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> windowHandle3=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle3.get(0));
		
		driver.switchTo().frame(0);
		WebElement des=driver.findElement(By.id("kb_knowledge.short_description"));
		des.sendKeys("hlo bro");
		WebElement bn=driver.findElement(By.xpath("//button[text()='Submit']"));
		bn.click();
	}
	}

}
