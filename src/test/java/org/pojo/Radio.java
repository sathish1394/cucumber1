package org.pojo;

import org.baseclass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio extends BaseClass {
	public Radio(){
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(name="radiobutton_0")
	private WebElement button;

    @FindBy(xpath="//input[@type='submit']")
    private WebElement submit;

	public WebElement getbutton() {
		return button;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
