import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
	
	public int randomId() {
		
		int id=(int) (Math.random()*10000);
		System.out.println(id);
		return id;
			
		}

	public static void main(String[] args) throws InterruptedException {
		RegisterTest register= new RegisterTest();
		int uniqueId=register.randomId();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Bruce");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Wayne");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("BruceWayne"+uniqueId+"@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("0412345678");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String confirmationMessage=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(confirmationMessage);

	}

}
