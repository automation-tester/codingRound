import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FlightBookingTest extends SuperTestNG {

	static ClearTripObjects clearTrip;
    @Test
    public void testThatResultsAppearForAOneWayJourney() {
    	//Create instance of ClaerTripObjcets
    	clearTrip=PageFactory.initElements(driver, ClearTripObjects.class);

        CommonUtils.waitFor(2000);
        CommonUtils.clickOnElement(clearTrip.getOneWayRadioButton());

        CommonUtils.clearTextBox(clearTrip.getFromTextBox());
        CommonUtils.enterIntoElement(clearTrip.getFromTextBox(), "Bangalore");
        
        //wait for the auto complete options to appear for the origin
        CommonUtils.waitFor(2000);
        List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
        originOptions.get(0).click();
        
        CommonUtils.clearTextBox(clearTrip.getToTextBox());
        CommonUtils.enterIntoElement(clearTrip.getToTextBox(), "Delhi");

        //wait for the auto complete options to appear for the destination
        CommonUtils.waitFor(2000);
        
        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
        destinationOptions.get(0).click();

        CommonUtils.clickOnElement(clearTrip.getDatePicker());

        //all fields filled in. Now click on search
        CommonUtils.clickOnElement(clearTrip.getSearchFlights());

        CommonUtils.waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(CommonUtils.isElementPresent(clearTrip.getSummary()));

        //close the browser
        driver.quit();

    }  
}
