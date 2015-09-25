package com.Medec.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage extends Page{
	
	 public ActivityPage(WebDriver driver) {
		 this.driver = driver;
//		 init();
	 }

	 public void init() {

		 	this.switchToTopWindow();
		 
			click(By.id("modalPopupMax0Frame"))  // do this to wait until the frame loads on the page
			.switchToFrame("modalPopupMax0Frame");
			
	        click(By.id("WIH_information"))  // do this to wait until the frame loads on the page
	    	.switchToFrame("WIH_information");
		}
	 
	 // These are for Activity - 1 of BSD Workflow
	 // Generate Electronic Purchase Request in Electronic Purchase Request
	 By optionToComplete_pulldown = By.id("button-1013-btnEl");
	 	By optionToComplete_SubmitRequest = By.id("menuitem-1011-itemEl");
	 	By optionToComplete_CancelRequest = By.id("menuitem-1012-itemEl");
	 By forwardButton = By.id("button-1015-btnEl");
	 	String popupForwardIframe = "modalPopupMax1Frame";
	 	By popupForwardSendButton = By.id("btnSend-btnEl");
	 	By popupForwardToButton = By.id("btnForwardUser");
	 	By popupForwardEnterNameHere = By.id("forwardUserAuto");
	 	By popupForwardComment = By.id("contents");
	 By saveButton = By.id("button-1017-btnEl");
	 By monitorButton = By.id("button-1019-btnEl");
	 By selectParticipantsButton = By.id("button-1021-btnEl");
	 By helpButton = By.id("button-1023-btnEl");
	 
	 public void init_Activity1_BSD() {
	        click(By.id("modalPopupMax0Frame"))  // do this to wait until the frame loads on the page
	    	.switchToFrame("modalPopupMax0Frame");
		}
	  
}
