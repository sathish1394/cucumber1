package org.step;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooksstep extends BaseClass{
	
	    
	     
         @Before(order=1)
         public void lanchurl() {
        	 broswer();
 	    gourl("https://adactinhotelapp.com/");
         }
         
         @After(order=1)
          public void exit(Scenario s) throws IOException {
        	 if (s.isFailed()) {
        		
        		//sshot("C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\screenshot\\"+s.getName()+".png");
        		TakesScreenshot t=(TakesScreenshot)getDriver();
        	  byte[] screenshotAs = t.getScreenshotAs(OutputType.BYTES);
        	  s.attach(screenshotAs, "image/png", s.getName());
        	//File f= new File("C:\\Users\\Dell\\eclipse-workspace\\SathishMaven\\target"+snap+".png");
//        		File f= new File(path);
//        		FileUtils.copyFile(screenshotAs, f);
        	 }
        	//closecurrentTab();
		}
         


}
