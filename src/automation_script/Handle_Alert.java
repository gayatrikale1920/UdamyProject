package automation_script;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handle_Alert {

	public static void main(String[] args) {
	 
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mypage.rediff.com/login/dologin");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
     Alert al = driver.switchTo().alert();
     al.accept();
        driver.close();
	}

}
