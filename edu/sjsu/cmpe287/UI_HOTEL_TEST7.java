package edu.sjsu.cmpe287;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UI_HOTEL_TEST7 extends UiAutomatorTestCase {
	
	public void testDemo() throws UiObjectNotFoundException {  
		
		// Simulate a short press on the HOME button.
		getUiDevice().pressHome();
		
		//we want to simulate a user bringing up the All Apps screen.
		UiObject allAppsButton = new UiObject(new UiSelector().description("Apps"));
		
		// Simulate a click to bring up the All Apps screen.
		allAppsButton.clickAndWaitForNewWindow();
		
		// In the All Apps screen, the Settings app is located in the Apps tab.
		UiObject appsTab = new UiObject(new UiSelector().text("Apps"));
		
		// Simulate a click to enter the Apps tab.
		appsTab.click();
		   

		// In the apps tabs, we can simulate a user swiping until they come to the Settings app icon. 
		UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
		   
		// Set the swiping mode to horizontal (the default is vertical)
		appViews.setAsHorizontalList();
		
		// Create a UiSelector to find the Settings app and simulate      
	    // a user click to launch the app. 
		UiObject tripAdvisorApp = appViews.getChildByText(new UiSelector()
		.className(android.widget.TextView.class.getName()), "TripAdvisor");
		
		//click the app of "TripAdvisor"
		tripAdvisorApp.clickAndWaitForNewWindow();		
		
		//click "Hotel"
		UiObject hotelItem = new UiObject(new UiSelector().className("android.widget.LinearLayout")
				.childSelector(new UiSelector().className("android.widget.LinearLayout"))
				.childSelector(new UiSelector().text("Hotels")) );		
		
		hotelItem.clickAndWaitForNewWindow();
		
		//click "Select a Location"
		UiObject selectLocation = new UiObject(new UiSelector().className("android.widget.RelativeLayout")
				.childSelector(new UiSelector().text("Location")));	
		selectLocation.clickAndWaitForNewWindow();
		
		//set location to search hotel		
		UiObject locaitonInput = new UiObject(new UiSelector().className("android.widget.RelativeLayout")
				.childSelector(new UiSelector().index(1)));		
		String location = "San Diego";		
		locaitonInput.clearTextField();		
		locaitonInput.setText(location);		
						
		//select the first one 
		UiObject firstLocaiton = new UiObject(new UiSelector().className("android.widget.ListView")
				.childSelector(new UiSelector().index(1)).childSelector(new UiSelector().text(location)));		
		firstLocaiton.clickAndWaitForNewWindow();
		
		//Click search button		
		UiObject searchButton = new UiObject(new UiSelector().className("android.widget.Button").text("Search"));	
		searchButton.clickAndWaitForNewWindow();
	
		//=============Service of Sort =============
		//click Filter/sort
		UiObject filterButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/filterSortText"));	
		filterButton.clickAndWaitForNewWindow();
		
	   
		//click By Ranking
		UiObject rankButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/sortLayout").text("By ranking"));	
		rankButton.clickAndWaitForNewWindow();
		
		//click By Ranking
        sleep(2000);
		UiObject byrankButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/item").index(2));	
		byrankButton.click();
		
		//click By price
        sleep(2000);
		UiObject bypriceButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/item").index(1));	
		bypriceButton.click();
		
        sleep(2000);
        getUiDevice().pressBack(); 
		
        
        //=============Service of filter =============
        //click Price        
        UiObject priceButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/priceLayout"));	
		priceButton.clickAndWaitForNewWindow();
        
        //click $$$
        UiObject price3 = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/list")
				.childSelector(new UiSelector().index(4)));					
		price3.clickAndWaitForNewWindow();
		
		//click button DONE
		UiObject Done = new UiObject(new UiSelector().
					resourceId("com.tripadvisor.tripadvisor:id/action_done"));				
		Done.clickAndWaitForNewWindow();
		
		
		//click Hotel Class      
        UiObject classButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/class_item"));	
		classButton.clickAndWaitForNewWindow();
        
        //click class
        UiObject class4 = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/list")
				.childSelector(new UiSelector().index(3)));					
		class4.clickAndWaitForNewWindow();
		
		//click button DONE		
		Done.clickAndWaitForNewWindow();
		
		//click search button
		UiObject Search = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/searchButton"));				
		Search.clickAndWaitForNewWindow(); 		
		
		//Click Map to show the search result in the map
		UiObject mapView = new UiObject(new UiSelector().className("android.widget.TextView").text("Map"));	
		mapView.clickAndWaitForNewWindow();
	
		//Click one hotel object
		UiObject hotelView = new UiObject(new UiSelector().className("android.view.View")
						.childSelector(new UiSelector().index(7)));
		hotelView.clickAndWaitForNewWindow();
		sleep(1000);
		
		//Click in for the select hotel
		getUiDevice().click(369,426);
					
	
		//=============== service of Room Tips ================
		//scroll down
		sleep(2000);
		UiScrollable scrollView = new UiScrollable(new UiSelector().
	        	resourceId("com.tripadvisor.tripadvisor:id/scrollView"));    
	    scrollView.scrollForward();
	    scrollView.scrollForward();
	    scrollView.scrollForward();
	    scrollView.scrollForward();
	    
	    UiObject tipsButton = new UiObject(new UiSelector().
        		resourceId("com.tripadvisor.tripadvisor:id/hotelRoomTipsLayout"));
	    tipsButton.clickAndWaitForNewWindow();
		sleep(2000);
        getUiDevice().pressBack();
        
        
        
		//=============== service of Show Price ================
	    scrollView.scrollBackward();
	    scrollView.scrollBackward();
	    scrollView.scrollBackward();
	    scrollView.scrollBackward();
	    
	    //click the ShowPrice Button
		UiObject showPriceButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/metaInfoLayout")
				.childSelector(new UiSelector().index(0))
				.childSelector(new UiSelector().index(0))
				.childSelector(new UiSelector().text("Show Prices")));	    
		showPriceButton.clickAndWaitForNewWindow();
		
	    //click the EnterDate Button
		UiObject enterDate = new UiObject(new UiSelector().className("android.widget.RelativeLayout")
				.childSelector(new UiSelector().text("Check in / Check out")));	    
		enterDate.clickAndWaitForNewWindow();
		
		//select Date
		UiObject dateIn = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/calendar")
				.childSelector(new UiSelector().index(27)));
		dateIn.click();
		UiObject dateOut = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/calendar")
				.childSelector(new UiSelector().index(30)));
		dateOut.click();
		
		//click button Done
		UiObject doneButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/doneButton"));
		
		//???? need click at the end 
		//doneButton.clickAndWaitForNewWindow();
		     
 
    	/*

        // =============== service of Call================
        sleep(2000);
        UiObject callButton = new UiObject(new UiSelector().
        		resourceId("com.tripadvisor.tripadvisor:id/toolbarCallLayout"));
        callButton.clickAndWaitForNewWindow();
        
   
        //to back to app
        sleep(2000);
        getUiDevice().pressBack();
        getUiDevice().pressBack();  
		
        
        // =============== service of Hotel website ================
        UiScrollable scrollView = new UiScrollable(new UiSelector().
        		resourceId("com.tripadvisor.tripadvisor:id/scrollView"));
        
        scrollView.scrollForward();
        scrollView.scrollForward();
        scrollView.scrollForward();
        scrollView.scrollForward();
        scrollView.scrollForward();
        scrollView.scrollBackward();
        scrollView.scrollBackward();
        scrollView.scrollBackward();
        scrollView.scrollBackward();
        
        UiObject websiteButton = new UiObject(new UiSelector().
        		resourceId("com.tripadvisor.tripadvisor:id/websiteLayout")
        		.childSelector(new UiSelector().text("Visit Website")));
       websiteButton.clickAndWaitForNewWindow();
       sleep(7000);
       getUiDevice().pressBack();
       scrollView.scrollForward();
       
       
       // =============== service of Hotel Overview ================
       UiObject hotelOverview = new UiObject(new UiSelector().
       		resourceId("com.tripadvisor.tripadvisor:id/descriptionAmenitiesLayout"));
       
       hotelOverview.clickAndWaitForNewWindow();
       sleep(3000);
       getUiDevice().pressBack();
       getUiDevice().pressBack();
       
       */
       
        
        /* =============== service of showing map and direction================*/
        
		/*
        //click the map button on the left top
        UiObject mapButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/mapLayout")
				.childSelector(new UiSelector().text("Map")));
        mapButton.clickAndWaitForNewWindow();
        
		//click location button on the left bottom
        UiObject locationButton = new UiObject(new UiSelector().
 				resourceId("com.tripadvisor.tripadvisor:id/myLocationButton"));
         locationButton.click();
        
         //click direction button on the middle bottom        
         UiObject directionButton = new UiObject(new UiSelector().
  				resourceId("com.tripadvisor.tripadvisor:id/directionsButton"));
         directionButton.clickAndWaitForNewWindow();
         
         //click OK button to Open Maps for directions
         UiObject okButton = new UiObject(new UiSelector().
  				resourceId("android:id/button1").text("OK"));
         okButton.clickAndWaitForNewWindow();
         */
        
	}
	
}

   

 
