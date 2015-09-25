package com.Medec.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        this.driver = driver;   
    }
       
    public void clickInteraction() {
		click(By.id("commandBarForm:interactionButton"));
	}
    
    public void toggleLightDark() {
    	click(By.id("commandBarForm:interactionButton"));
    }

    public MemberSearchPage searchMembers() {
		click(By.id("commandBarForm:searchMenu_button"));
		click(By.xpath("/html/body/div[6]/ul/li[1]/a/span"));
		return new MemberSearchPage(driver);
	}
    
    public ProviderSearchPage searchProviders() {
    	click(By.id("commandBarForm:searchMenu_button"));
    	click(By.xpath("/html/body/div[6]/ul/li[2]/a/span"));
    	return new ProviderSearchPage(driver);
    }
    
    public RequestsSearchPage searchRequests() {
		click(By.id("commandBarForm:searchMenu_button"));
		click(By.xpath("/html/body/div[6]/ul/li[3]/a/span"));
		return new RequestsSearchPage(driver);
	}
    
    public ProgramsSearchPage searchPrograms() {
    	click(By.id("commandBarForm:searchMenu_button"));
    	click(By.xpath("/html/body/div[6]/ul/li[4]/a/span"));
    	return new ProgramsSearchPage(driver);
    }
    
    public void clickNewMember() {
		click(By.id("creatMemberForm:creatMember"));
    }
    
    public void clickCancel() {
		click(By.id("creatMemberForm:cancel"));
    }
    
	/////////////////////////////////////////////////////////
    ////// MEMBER SEARCH ///////////
    /////////////////////////////////////////////////////////
    
    public void searchbyId() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/ul/li[1]/a"));
    }
    
    public void searchbyName() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/ul/li[2]/a"));
    }
    
    public void searchbyPhoneNumber() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/ul/li[3]/a"));
    }
    
    public void subscriberId() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/ul/li[4]/a"));
    }
    
    public void alternateId() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/ul/li[5]/a"));
    }
    
	/////////////////////////////////////////////////////////
	////// SEARCH BY ID ///////////
	/////////////////////////////////////////////////////////
    
    public void clickSearchActiveMembersOnly_ID() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/form/label"));
	}
    
    public void clickMemberId_ID() {
		click(By.id("memberSearchTabView:memberIdSearchForm:memberId"));		
	}
    
    public void clickClient_ID() {
		click(By.id("memberSearchTabView:memberIdSearchForm:clientCode1_label"));
	}
    
    public void setClientText_ID(String text) {
    	click(By.xpath("/html/body/div[8]/div/ul/li[1]"));
    }
    
    public void clickHNEMembership_ID() {
		click(By.xpath("/html/body/div[8]/div/ul/li[2]"));
	}
    
    public void clickBHPMembership_ID() {
		click(By.xpath("/html/body/div[8]/div/ul/li[3]"));
	}
    		
    public void clickSearchHealthPlan_ID() {
    	click(By.id("memberSearchTabView:memberIdSearchForm:memberIdSearchRemoteButton"));
    }
    
    public void clickSearchAerial_ID() {
		click(By.id("memberSearchTabView:memberIdSearchForm:memberIdSearchLocalButton"));
	}
    				
    				
/////////////////////////////////////////////////////////
////// SEARCH BY NAME ///////////
/////////////////////////////////////////////////////////
    
    public void clickSearchActiveMembersOnly_NAME() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/form/label"));
	}
    
    
    
    public void clickSearchHealthPlan_NAME() {
    	click(By.id("memberSearchTabView:memberNameSearchForm:memberNameSearchRemoteButton"));
    }
    
    public void clickSearchAerial_NAME() {
    	click(By.id("memberSearchTabView:memberNameSearchForm:memberNameSearchLocalButton"));
    }

/////////////////////////////////////////////////////////
////// SEARCH BY PHONE NUMBER ///////////
/////////////////////////////////////////////////////////
    
    public void clickSearchActiveMembersOnly_PH() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/form/label"));
	}
    

    
    public void clickSearchAerial_PH() {
    	click(By.id("memberSearchTabView:phoneNumberSearchForm:memberPhoneSearchLocalButton"));
    }

/////////////////////////////////////////////////////////
////// SEARCH BY SUBSCRIBER ID ///////////
/////////////////////////////////////////////////////////
    
    public void clickSearchActiveMembersOnly_SUB() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[4]/form/label"));
	}
    
    
    public void clickSearchHealthPlan_SUB() {
    	click(By.id("memberSearchTabView:subscriberIdSearchForm:memberSubscriberSearchRemoteButton"));
    }
    
    public void clickSearchAerial_SUB() {
		click(By.id("memberSearchTabView:subscriberIdSearchForm:memberSubscriberSearchLocalButton"));
	}
    
/////////////////////////////////////////////////////////
////// SEARCH BY ALTERNATE ID ///////////
/////////////////////////////////////////////////////////
    
    public void clickSearchActiveMembersOnly_ALT() {
		click(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[5]/form/label"));
	}
    
    
    
    public void clickSearchHealthPlan_ALT() {
    	click(By.id("memberSearchTabView:alternateIdSearchForm:memberAltIdSearchRemoteButton"));
    }
    
    public void clickSearchAerial_ALT() {
		click(By.id("memberSearchTabView:alternateIdSearchForm:memberAltIdSearchLocalButton"));
	}
}
