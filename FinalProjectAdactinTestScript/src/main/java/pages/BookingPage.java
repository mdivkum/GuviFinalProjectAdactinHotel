package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class BookingPage extends TestBase{
	
	public BookingPage () {
		
		PageFactory.initElements(driver, this);
				
		}
		  // @FindBy(how = How.XPATH, using="//select[@id='location']")
		      WebElement drp=driver.findElement(By.id("location"));
		      Select drpdown=new Select(drp);
		      
		     @FindBy (id = "hotels")
			  WebElement hotels;

		    @FindBy (id = "room_type")
			WebElement room;
			
			@FindBy (id = "room_nos")
			WebElement numberofrooms;
			
			@FindBy ( id = "datepick_in")
			WebElement checkindate;
			
			@FindBy (id = "datepick_out")
			WebElement checkoutdate;
			
			@FindBy (id = "adult_room")
			WebElement adultsperroom;
			
			@FindBy ( id = "child_room")
			WebElement childerns;
			
			@FindBy ( id = "Submit")
			WebElement search;
			
			public void loc(int index) {
				drpdown.selectByIndex(index);
			}
			public void selecthotels(int index) {
		       
				Select drop = new Select(hotels);
				drop.selectByIndex(index);
				hotels.click();
			}
			
			/*public void hoteldropdown(int index) {
				
				Select drop = new Select(hotels);
				drop.selectByIndex(index);
			}*/
			
			public void selectrooms(int index) {
			
				Select drop = new Select(room);
				drop.selectByIndex(index);	
				room.click();
			}
			
			public void selectnofrooms(int index) {

				Select drop = new Select(numberofrooms);
				drop.selectByIndex(index);	
				numberofrooms.click();
			}
			
			public void selectcheckindate(String index) {
				
				
				checkindate.sendKeys(index);
				
			}
			
			public void selectcheckoutdate(String index) {
					
				checkoutdate.sendKeys(index);
			}
			
			public void selectadultrooms(int index) {
				Select drop = new Select(adultsperroom);
				drop.selectByIndex(index);	
				adultsperroom.click();
			}
			
			public void selectchildrooms(int index) {
				Select drop = new Select(childerns);
				drop.selectByIndex(index);
				childerns.click();
			}
			
			public void clicksearch() {
				search.click();
			}	

}
