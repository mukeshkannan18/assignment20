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

public class ServicenowCaller {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev140572.service-now.com\r\n");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement un=driver.findElement(By.id("user_name"));
		un.sendKeys("admin");
		WebElement pw=driver.findElement(By.id("user_password"));
		pw.sendKeys("P-qQ7@umSYz8");
		WebElement clk=driver.findElement(By.id("sysverb_login"));
		clk.click();
		driver.switchTo().defaultContent();
		
//		driver.switchTo().frame(0);
		WebElement fil=driver.findElement(By.id("filter"));
		fil.sendKeys("All",Keys.ENTER);
		WebElement call=driver.findElement(By.xpath("//div[text()='Callers']"));
		call.click();
		driver.switchTo().defaultContent();

		
		driver.switchTo().frame(0);

		WebElement nn=driver.findElement(By.xpath("//button[text()='New']"));
		nn.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement fn=driver.findElement(By.id("sys_user.first_name"));
		fn.sendKeys("mukesh");
		WebElement ln=driver.findElement(By.id("sys_user.last_name"));
		ln.sendKeys("kannan");
		WebElement mail=driver.findElement(By.id("sys_user.email"));
		
		mail.sendKeys("mukeshkannansubbaiah18@gmail.com");
		WebElement phone=driver.findElement(By.id("sys_user.phone"));
		phone.sendKeys("iPhone");
		WebElement phone2=driver.findElement(By.id("sys_user.mobile_phone"));
		phone2.sendKeys("Vivo");
		WebElement click=driver.findElement(By.id("lookup.sys_user.title"));
		click.click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windowHandle1=new ArrayList<String>(windowHandle);
		driver.switchTo().window(windowHandle1.get(1));
		
		WebElement kk=driver.findElement(By.linkText("Vice President"));
		kk.click();
		
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> windowHandle3=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle3.get(0));
		
		driver.switchTo().frame(0);
		WebElement ii=driver.findElement(By.id("sysverb_insert_bottom"));
		ii.click();
		
		WebElement successfull=driver.findElement(By.xpath("//div[@class='outputmsg_text']"));
		System.out.println(successfull.getText());

	}

}


