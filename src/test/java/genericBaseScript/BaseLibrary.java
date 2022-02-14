package genericBaseScript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseLibrary {
	public WebDriver webdriver;
	public EventFiringWebDriver driver;
	public FileInputStream file;
	public Properties property;
		
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser) throws Exception
	{
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-popup-blocking");
		options.addArguments("disable-extensions");
		options.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
					webdriver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\geckodriver.exe");
					webdriver=new FirefoxDriver();
		}
		driver=new EventFiringWebDriver(webdriver);
		webdriver.manage().window().maximize();
		
		file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\env.properties");
		property = new Properties();
		property.load(file);
		
		driver.get(property.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("pageOpen");
		String parent=webdriver.getWindowHandle();
		
		driver.findElement(By.linkText("Login")).click();
		driver.switchTo().window(parent);
		// Enter UserName
		 driver.findElement(By.id("username")).sendKeys(property.getProperty("username"));
		// Enter Password
		 driver.findElement(By.id("password")).sendKeys(property.getProperty("password"));
		 //Click on Login
		 driver.findElement(By.id("Login")).click();
		 //driver.navigate();
}
@AfterTest	
public void closeBrowser()
{
driver.quit();
}
}
