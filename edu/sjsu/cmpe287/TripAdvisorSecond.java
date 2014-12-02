package edu.sjsu.cmpe287;

import android.os.RemoteException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TripAdvisorSecond extends UiAutomatorTestCase {
	
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
		UiObject restaurantsItem = new UiObject(new UiSelector().className("android.widget.LinearLayout")
				.childSelector(new UiSelector().className("android.widget.LinearLayout"))
				.childSelector(new UiSelector().text("Restaurants")) );
        
		restaurantsItem.clickAndWaitForNewWindow();
		
		//click "Select a Location"
		UiObject selectLocation = new UiObject(new UiSelector().className("android.widget.RelativeLayout")
				.childSelector(new UiSelector().text("Location")));	
		selectLocation.clickAndWaitForNewWindow();
		
		//set location to search hotel		
		UiObject locaitonInput = new UiObject(new UiSelector().className("android.widget.RelativeLayout")
				.childSelector(new UiSelector().index(1)));		
		String location = "San Jose";		
		locaitonInput.clearTextField();		
		locaitonInput.setText(location);		
		//???? How to clear the history input data  ??????//
		
		
		//select the first one 
		UiObject firstLocaiton = new UiObject(new UiSelector().className("android.widget.ListView")
				.childSelector(new UiSelector().index(2)).childSelector(new UiSelector().text(location)));		
		firstLocaiton.clickAndWaitForNewWindow();
		
		//Click search button		
		UiObject searchButton = new UiObject(new UiSelector().className("android.widget.Button").text("Search"));	
		searchButton.clickAndWaitForNewWindow();
		
		//Click Map to show the search result in the map
		UiObject mapView = new UiObject(new UiSelector().className("android.widget.LinearLayout")
				.childSelector(new UiSelector().className("android.widget.LinearLayout"))
				.childSelector(new UiSelector().text("Map")) );	
		mapView.clickAndWaitForNewWindow();
		
		UiObject rest1 = new UiObject(new UiSelector().className("android.widget.FrameLayout")
				.childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(1))
				.childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(0))
				.childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(2))
				.childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(0))
				.childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(0))
				.childSelector(new UiSelector().index(1)));
		rest1.clickAndWaitForNewWindow();
		
		/*
		//Click Zoom In
		UiObject zoomIn = new UiObject(new UiSelector().resourceId("com.tripadvisor.tripadvisor:id/googleMapView")
				.childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(2))
				.childSelector(new UiSelector().index(1)).childSelector(new UiSelector().index(0)));
		zoomIn.click();
		
		//Click Zoom out
		UiObject zoomOut = new UiObject(new UiSelector().resourceId("com.tripadvisor.tripadvisor:id/googleMapView")
				.childSelector(new UiSelector().index(0)).childSelector(new UiSelector().index(2))
				.childSelector(new UiSelector().index(1)).childSelector(new UiSelector().index(1)));
		zoomOut.click();
		
		//Click one hotel object
		UiObject hotelView = new UiObject(new UiSelector().className("android.view.View")
				.childSelector(new UiSelector().index(34)));
		hotelView.clickAndWaitForNewWindow();
		*/
		//Click in for the select hotel
		getUiDevice().click(426,426);
		
		
		/* =============== service of showing Photo ================*/
		/*
		//Click photo
		UiObject photoView = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/photo"));	
		photoView.clickAndWaitForNewWindow();
		
		//Click one phone in the list
		UiObject photoOne = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/gridview")
				.childSelector(new UiSelector().index(0)));
		photoOne.clickAndWaitForNewWindow();

		
		//Swiping the photo 4 times
		
		UiScrollable scrollPhoto = new UiScrollable(new UiSelector().resourceId("com.tripadvisor.tripadvisor:id/viewpager").scrollable(true));
			   
		// Set the swiping mode to horizontal (the default is vertical)
		scrollPhoto.setAsHorizontalList();
        for (int i=1;i<5; i++){
        	scrollPhoto.scrollForward();        	
        }
		
		//click the button Done, back to main service 
        UiObject doneButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/headerRightButton"));
        doneButton.clickAndWaitForNewWindow();
        doneButton.clickAndWaitForNewWindow();
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
         
         //click start navigation
         UiObject startNav = new UiObject(new UiSelector().className("android.widget.TextView")
        		 .text("Start navigation"));
         startNav.clickAndWaitForNewWindow();
         
         
         try {
        	    Thread.sleep(4000);                 
        	} catch(InterruptedException ex) {
        	    Thread.currentThread().interrupt();
        	}
         
         
         //Back to app
         try {
        	 	 getUiDevice().pressRecentApps();
         	 } catch (RemoteException e) {
         		 e.printStackTrace();
		     }
         
         UiObject backToApp = new UiObject(new UiSelector().className("android.widget.FrameLayout")
        		 .childSelector(new UiSelector().index(0))
        		 .childSelector(new UiSelector().text("TripAdvisor")));
         
         //?? working on
         if(backToApp.click()){
        	 System.out.println(" click back to app");
         } else{
        	 System.out.println(" not back to app");
         }
         backToApp.clickAndWaitForNewWindow();
       */

         
	}
	
}

