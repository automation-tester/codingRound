import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sun.javafx.PlatformUtil;

public class SuperTestNG {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void preCondition() {
		//Set chrome driver path
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "./exeFiles/chromedriver_mac.exe");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "./exeFiles/chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "./exeFiles/chromedriver_linux.exe");
        }
        //create instance of chrome driver
        driver = new ChromeDriver();
        
        //Launch Clear trip URL
        driver.get("https://www.cleartrip.com/");
        
        //Implcit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //Maximize the window
        driver.manage().window().maximize();
    }
	
	@AfterMethod
	public static void postCondtion(){
		//Close all the browsers
		driver.quit();
	}
	
	

}
