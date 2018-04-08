import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HotelBookingTest extends SuperTestNG {

	static ClearTripObjects clearTrip;

    @Test
    public void shouldBeAbleToSearchForHotels() {
    	//Create instance of ClaerTripObjcets
    	clearTrip=PageFactory.initElements(driver, ClearTripObjects.class);

    	//Click on Hotels link
        CommonUtils.clickOnElement(clearTrip.getHotelLink());
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //Enter text in locality text box
        CommonUtils.enterIntoElement(clearTrip.getLocalityTextBox(), "Indiranagar, Bangalore");
        
        //Select option from travellers drop down
        CommonUtils.selectElementByVisibleText(clearTrip.getTravellerSelection(), "1 room, 2 adults");
        
        //Click on Search button
        CommonUtils.clickOnElement(clearTrip.getSearchButton());
    }


}
