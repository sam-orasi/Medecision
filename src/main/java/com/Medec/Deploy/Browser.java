package com.Medec.Deploy;

public enum Browser {
    CHROME("chrome"),
    FIREFOX("firefox"),
    INTERNET_EXPLORER("ie"),
    SAFARI("safari"), 
    HTMLUNIT("htmlunit");
    
    String moniker;
    
    Browser(String moniker) {
        this.moniker = moniker;
    }
}
