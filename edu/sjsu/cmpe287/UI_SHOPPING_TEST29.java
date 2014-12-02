package edu.sjsu.cmpe287;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UI_SHOPPING_TEST29 extends UiAutomatorTestCase {
	
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
		
		//click "Nearme now"
		UiObject nearmeItem = new UiObject(new UiSelector().className("android.widget.LinearLayout")
				.childSelector(new UiSelector().className("android.widget.LinearLayout"))
				.childSelector(new UiSelector().text("Near Me Now")) );		
		
		nearmeItem.clickAndWaitForNewWindow();
		
		//click "shopping"
		UiObject shoppingItem = new UiObject(new UiSelector().resourceId("com.tripadvisor.tripadvisor:id/item")
				.childSelector(new UiSelector().index(0))
				.childSelector(new UiSelector().index(1))
				.childSelector(new UiSelector().text("Shopping")));	
		shoppingItem.clickAndWaitForNewWindow();
		
		
		//Click Map to show the search result in the map
		UiObject mapView = new UiObject(new UiSelector().className("android.widget.TextView").text("Map"));	
		mapView.clickAndWaitForNewWindow();
				
		//Click one shopping object
		UiObject shoppingView = new UiObject(new UiSelector().className("android.view.View")
				.childSelector(new UiSelector().index(10)));
		shoppingView.click();
				
		//Click in for the select shopping
		getUiDevice().click(358,436);
		sleep(5000);
		
        //click the map button on the left top
        UiObject mapButton = new UiObject(new UiSelector().
				resourceId("com.tripadvisor.tripadvisor:id/mapLayout")
				.childSelector(new UiSelector().text("Map")));
        mapButton.clickAndWaitForNewWindow();
        sleep(5000);
        
		//click location button on the right bottom
        UiObject overlayButton = new UiObject(new UiSelector().
 				resourceId("com.tripadvisor.tripadvisor:id/mapOverlayButton"));
         overlayButton.click();
         sleep(5000);
         
         
        //check the button of hotel
        UiObject hotelradioButton = new UiObject(new UiSelector().
  				resourceId("com.tripadvisor.tripadvisor:id/hotelsLayout"));    
        hotelradioButton.click();       
        sleep(5000);
        //click OK
        UiObject okButton = new UiObject(new UiSelector().
  				resourceId("android:id/button3").text("OK"));    
        okButton.click();
              
        
				
         
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

		
		//=============== service of showing Photo ================
	
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
        
        
        // =============== service of Call================
        sleep(2000);
        UiObject callButton = new UiObject(new UiSelector().
        		resourceId("com.tripadvisor.tripadvisor:id/toolbarCallLayout"));
        callButton.clickAndWaitForNewWindow();
        
   
        //to back to app
        sleep(2000);
        getUiDevice().pressBack();
        getUiDevice().pressBack();  
		
        
        // =============== service of Shopping website ================
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
       
       
       // =============== service of shopping Overview ================
       UiObject hotelOverview = new UiObject(new UiSelector().
       		resourceId("com.tripadvisor.tripadvisor:id/descriptionAmenitiesLayout"));
       
       hotelOverview.clickAndWaitForNewWindow();
       sleep(3000);
       getUiDevice().pressBack();
       getUiDevice().pressBack();
       

             
        // =============== service of showing map and direction================
               
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
         
         
         getUiDevice().pressBack();
         sleep(2000);

         getUiDevice().pressBack();
         getUiDevice().pressBack();
         getUiDevice().pressBack();
         getUiDevice().pressBack();
         getUiDevice().pressBack();
         
       */  
         
	}
	
}

   

 
