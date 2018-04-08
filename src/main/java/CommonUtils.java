import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils extends SuperTestNG {
	
	public static void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  
        }
    }
	
	
	public static void clickOnElement(WebElement element){
		
		element.click();
	}
	
	public static void enterIntoElement(WebElement element, String text){
		element.sendKeys(text);
	}
	
	public static String textOfElemet(WebElement element)
	{
		return element.getText();
	}
	
	public static void clearTextBox(WebElement element)
	{
		element.clear();
	}
	
	public static boolean isElementPresent(WebElement element) {
        try {
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
	
	public static Timeouts implicitWait(WebDriver driver, int time){
		
		return driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	
	public static WebElement explicitWaitIfElementVisible(WebDriver driver, int time, WebElement element){
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void switchToFrameByName(String name){
		
        driver.switchTo().frame(name);
	}
	
	
	public static void switchToFrameByIndex(int index){
		
		driver.switchTo().frame(index);
	}
	
	public static void switchToFrameByElement(WebElement element){
		
		driver.switchTo().frame(element);
	}	
	
	public static void selectElementByVisibleText(WebElement element,String text){
		new Select(element).selectByVisibleText(text);
		
	}
	

}
