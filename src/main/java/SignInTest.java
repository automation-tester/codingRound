import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends SuperTestNG {
	
	static ClearTripObjects clearTrip;

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
    	//Create instance of ClaerTripObjcets
    	clearTrip=PageFactory.initElements(driver, ClearTripObjects.class);
    	
    	//Click on Your Trip link
        CommonUtils.clickOnElement(clearTrip.getYourTripLink());
        
        //Click on Sign in button
        CommonUtils.clickOnElement(clearTrip.getSignInLink());

        //Here switch to new frame.
        CommonUtils.switchToFrameByName("modal_window");
        
        //Wait for the element
        CommonUtils.explicitWaitIfElementVisible(driver, 20, clearTrip.getSignInFrameLink());
        
        //Clcik on Sign in to link
        CommonUtils.clickOnElement(clearTrip.getSignInFrameLink());
        
        //Verifiy the error message display without entering username and password
        String actual = CommonUtils.textOfElemet(clearTrip.getSignInErrorMessage());
        String expected="There were errors in your submission";
        Assert.assertTrue(actual.contains(expected));
        
    }

    
    

    
   


}
