package Programmes;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UploadDoc {

	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "D:\\Rakesh\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://upload.photobox.com/en/#computer");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	    File file  = new File("D:\\NaturePhootos.jpg");
	    String originalfile = file.getAbsolutePath();
	    StringSelection selection = new StringSelection(originalfile);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	    driver.findElement(By.xpath("//*[@id=\"button_desktop\"]")).click();
	    Thread.sleep(1000);
	    Robot a = new Robot();
	    a.keyPress(KeyEvent.VK_CONTROL);
	    a.keyPress(KeyEvent.VK_V);
	    a.keyRelease(KeyEvent.VK_V);
	    a.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(1000);
a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	}

}
