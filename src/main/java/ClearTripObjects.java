import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClearTripObjects extends SuperTestNG{
	
//////////////////////////////////////////////////SignInTest//////////////////////////////////////////////////////////////////////////////////////	
	//Your tips link
		@FindBy(linkText="Your trips")
		private WebElement yourTripLink;
				
		public WebElement getYourTripLink(){
			return yourTripLink;
		}
		
		//signIn link
		@FindBy(id="SignIn")
		private WebElement signInLink;
						
		public WebElement getSignInLink(){
			return signInLink;
		}
		
		//signIn link in frame
		@FindBy(xpath="//button[@class='primary']")
		private WebElement signInFrameLink;
								
		public WebElement getSignInFrameLink(){
			return signInFrameLink;
		}
		
		//signIn error message
		@FindBy(id="errors1")
		private WebElement signInErrorMessage;
										
		public WebElement getSignInErrorMessage(){
			return signInErrorMessage;
		}
	
////////////////////////////////////////////////////HotelBookingTest//////////////////////////////////////////////////////////////////////////////
		
		//Hotels link
		@FindBy(linkText = "Hotels")
	    private WebElement hotelLink;
		
		public WebElement getHotelLink(){
			return hotelLink;
		}
		
		//Tags text box
	    @FindBy(id = "Tags")
	    private WebElement localityTextBox;
	    public WebElement getLocalityTextBox(){
			return localityTextBox;
		}
	    
	    //Search button
	    @FindBy(id = "SearchHotelsButton")
	    private WebElement searchButton;
	    public WebElement getSearchButton(){
			return searchButton;
		}

	    //travelers dropdown
	    @FindBy(id = "travellersOnhome")
	    private WebElement travellerSelection;
	    public WebElement getTravellerSelection(){
			return travellerSelection;
		}
	    
////////////////////////////////////////////////////FlightBookingTest//////////////////////////////////////////////////////////////////////////////

	  //OneWay radio button
	  @FindBy(id = "OneWay")
	  private WebElement oneWayRadioButton;
	  		
	  public WebElement getOneWayRadioButton(){
		  return oneWayRadioButton;
	  }
	  
	  //from text box
	  @FindBy(id = "FromTag")
	  private WebElement fromTextBox;
	  		
	  public WebElement getFromTextBox(){
		  return fromTextBox;
	  }
	  
	  //to text box
	  @FindBy(id = "ToTag")
	  private WebElement toTextBox;
	  		
	  public WebElement getToTextBox(){
		  return toTextBox;
	  }
	  
	  //search flights button
	  @FindBy(id = "SearchBtn")
	  private WebElement searchFlights;
	  		
	  public WebElement getSearchFlights(){
		  return searchFlights;
	  }
	  
	  //searchsummary
	  @FindBy(className = "searchSummary")
	  private WebElement summary;
	  		
	  public WebElement getSummary(){
		  return summary;
	  }
	  
	  //date picker
	  @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	  private WebElement datePicker;
	  		
	  public WebElement getDatePicker(){
		  return datePicker;
	  }
	  
	  
}
