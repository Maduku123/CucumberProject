package Base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class main {
	public static WebDriver driver;
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cashp\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	
	public void tearDown() {
		driver.close();
		
	}

}
