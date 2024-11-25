package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public WebDriverWait wait;
	public ExtentSparkReporter reporter; 
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeSuite
	public void report() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("AdactinHotel Test Resul");
		reporter.config().setDocumentTitle("Login Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "DivyaKumari");
	}
	
	
	
public TestBase() {
	       try {
			prop = new Properties();
			FileInputStream ip= new FileInputStream(
	"\\Users\\mdivk\\eclipse-workspace\\FinalProjectAdactinTestScript\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}


public static void initial() {
		
		String browsername= prop.getProperty("browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get(prop.getProperty("url"));
		
	}
	
	public void elementClickWait(WebElement ele, int duration) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		}

	

}
