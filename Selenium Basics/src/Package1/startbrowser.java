package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class startbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://magento.com");
		//		String url=driver.getCurrentUrl();
		//		System.out.println(url);
		//		System.out.println(url.contains("https"));
		//		System.out.println(driver.getWindowHandle());
		//		System.out.println(driver.getWindowHandles());
		//		Point p=driver.manage().window().getPosition();
		//		//driver.manage().window().setPosition(new Point(p.x+500, p.y+500));
		//		driver.manage().window().setSize(new Dimension(100, 600));

		WebElement my_ac=driver.findElement(By.linkText("MY ACCOUNT"));
System.out.println(my_ac.getAttribute("href"));
System.out.println(my_ac.getCssValue("color"));
System.out.println(my_ac.getTagName());
System.out.println(my_ac.getText());
my_ac.click();
driver.findElement(By.xpath("//span[text()='Register']")).click();
WebElement compr=driver.findElement(By.id("customer_company_type"));
Select comp_pr=new Select(compr);
comp_pr.selectByValue("development");
comp_pr.selectByVisibleText("");


		//driver.quit();

	}

}