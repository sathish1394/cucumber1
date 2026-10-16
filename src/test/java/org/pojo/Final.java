package org.pojo;

import java.net.http.WebSocket;

import org.baseclass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final extends BaseClass {
	public Final() {
		PageFactory.initElements(getDriver(), this);
	}
    @FindBy(xpath = "(//input[@type='text'])[16]")
    private WebElement outputtext;
    
	public WebElement getOutputtext() {
		return outputtext;
	}
	
 
}
