package package2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//		driver.get("http://www.echoecho.com/javascript4.htm");
		//				driver.findElement(By.name("B1")).click();
		//		System.out.println(driver.switchTo().alert().getText());
		//
		//driver.switchTo().frame("login_page");
		//driver.switchTo().frame(driver.findElement(By.xpath("")));
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("santostest");
		driver.get("http://naukri.com");
		Set<String> winids=driver.getWindowHandles();
//		for (String winid:winids){
//			driver.switchTo().window(winid);
//			
//			
//			}
		
Object[] ids=winids.toArray();
driver.switchTo().window(ids[0].toString());
System.out.println(driver.getTitle());
	}

}
