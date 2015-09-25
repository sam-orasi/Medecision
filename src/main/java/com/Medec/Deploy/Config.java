package com.Medec.Deploy;

//import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//@Inherited
public @interface Config {
    public String url();
    public Browser browser() default Browser.INTERNET_EXPLORER;
    public String user();
    public String password();
}

