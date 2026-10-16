package org.pojo;

import org.baseclass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseClass {
	public Search(){
		PageFactory.initElements(getDriver(), this);
	}
//	@FindBy(id="hotels")
//	private WebElement ;

	@FindBys({
		@FindBy(xpath="//select[@id='location']"),
		@FindBy(xpath="//select[@name='location']")
	})
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindAll({
		@FindBy (name="room_type"),
		@FindBy(xpath="//select[@class='search_combobox']")})
	private WebElement rooms;
	
	@FindBy(id="room_nos")
	private WebElement roomssnumber;
	
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement dateout;
	
	@FindBy(name="adult_room")
	private WebElement adult;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRooms() {
		return rooms;
	}
	
	public WebElement getRoomssnumber() {
		return roomssnumber;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	@FindBy(name="adult_room")
	private WebElement adultroom;

	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement login;
	
	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getLogin() {
		return login;
	}
}
