package Programmes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsEx {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Rakesh\\drivers\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://jqueryui.com/droppable/");
Thread.sleep(3000);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
driver.switchTo().frame(0);
Actions a = new Actions(driver);
WebElement drag = driver.findElement(By.xpath(" //*[@id=\"draggable\"]/p"));
WebElement drop = driver.findElement(By.xpath(" //*[@id=\"droppable\"] "));
a.dragAndDrop(drag, drop).build().perform();
     Thread.sleep(1000);        
driver.navigate().to("http://jqueryui.com/droppable/");
driver.switchTo().frame(0);
Thread.sleep(1000);
WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

a.dragAndDropBy(slide, 400, 0).build().perform();
driver.close();





}
}
