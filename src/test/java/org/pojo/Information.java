package org.pojo;

import org.baseclass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information extends BaseClass {
	public Information(){
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(name="first_name")
	private WebElement intialname;
	
	@FindBy(name="last_name")
	private WebElement finalname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement cardnumber;
	
	@FindBy(name="cc_type")
	private WebElement type;
	
	@FindBy(name="cc_exp_month")
	private WebElement month;
	
	@FindBy(name="cc_exp_year")
	private WebElement year;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
	private WebElement book;

	public WebElement getIntialname() {
		return intialname;
	}

	public WebElement getFinalname() {
		return finalname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

}
