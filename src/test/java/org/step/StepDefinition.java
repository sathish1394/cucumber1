package org.step;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.pojo.*;

//import org.Design.Search;
import org.baseclass.BaseClass;
//import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pojo.MaintainPojo;
import org.pojo.Search;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
//	@Given("User have to lanch the Adactin url through chrome browser")
//	public void user_have_to_lanch_the_adactin_url_through_chrome_browser() {
//	    broswer();
//	    gourl("https://adactinhotelapp.com/");
//	}
//	
//	@When("User have to  pass the valid login and valid password and click login in Adactin")
//	public void user_have_to_pass_the_valid_login_and_valid_password_and_click_login_in_adactin() throws IOException {
//		MaintainPojo m = new MaintainPojo();
//		String id = excellread("Book1", "employee details", 1, 1);
//		String pass = excellread("Book1", "employee details", 1, 2);
//		m.getUserName(id);
//		m.getPassword(pass);
//		m.getClick().click();
//		
//		if (id.contains("sathishzab94")) {
//			System.out.println("valid login");
//		} if (m.getLinks().equals("SearchHotel.php")) {
//			System.out.println("valid login success");
//		} else {
//              System.out.println("invalid login");
//		}
//	}
//	
//	@When("select hotel location, room number for adult and child and submit")
//	public void select_hotel_location_room_number_for_adult_and_child_and_submit() {
//		Search s= new Search();
//    	WebElement location = s.getLocation();
//		visibleindex(location, 1);
//		WebElement hotels = s.getHotels();
//    	visibleindex(hotels, 3);
//    	WebElement rooms = s.getRooms();
//    	visibleindex(rooms, 2);
//    	WebElement roomssnumber = s.getRoomssnumber();
//    	visibleindex(roomssnumber, 3);
//    	WebElement datein = s.getDatein();
//    	passValue(datein, "12/09/2026");
//    	WebElement dateout = s.getDateout();
//    	passValue(dateout, "12/09/2026");
//    	WebElement adultroom = s.getAdultroom();
//    	visibleindex(adultroom, 3);
//    	WebElement childroom = s.getChildroom();
//    	visibleindex(childroom, 3);
//    //	Assert.assertTrue("able to login", location.isDisplayed());
//    	WebElement login = s.getLogin();
//    	clicks(login);
//    	System.out.println("completed 2");
//	}
//	@When("click radio button")
//	public void click_radio_button() {
//        Radio r= new Radio();
//    	WebElement button = r.getbutton();
//    	clicks(button);
//    	WebElement submit = r.getSubmit();
//    	clicks(submit);
//    	System.out.println("completed 3");
//	}
//	@When("enter the username {string} and {string}, card details and click submit button")
//	public void enter_the_username_and_card_details_and_click_submit_button(String string, String string2) {
//		Information i= new Information();
//    	WebElement intialname = i.getIntialname();
//    	passValue(intialname, string);
//    	WebElement finalname = i.getFinalname();
//    	passValue(finalname, string2);
//    	WebElement address = i.getAddress();
//    	implicitTime(10);
//    	passValue(address, "anna nagar, chennai");
//    	WebElement cardnumber = i.getCardnumber();
//    	passValue(cardnumber, "1234567898765432");
//    	fluentTime(10, 9);
//    	WebElement type = i.getType();
//    	visibleindex(type, 2);
//    	WebElement month = i.getMonth();
//    	visibleindex(month, 3);
//    	WebElement year = i.getYear();
//    	visibleindex(year, 5);
//    	WebElement cvv = i.getCvv();
//    	passValue(cvv, "234");
//    	WebElement book = i.getBook();
//    	clicks(book);
//    	System.out.println("completed 4");
//	}
//    
//	@When("User have to  pass the Invalid login and valid password and click login in Adactin")
//	public void user_have_to_pass_the_invalid_login_and_valid_password_and_click_login_in_adactin() throws IOException {
//		MaintainPojo m = new MaintainPojo();
//		String id = excellread("Book1", "employee details", 2, 1);
//		String pass = excellread("Book1", "employee details", 2, 2);
//		m.getUserName(id);
//		m.getPassword(pass);
//		m.getClick().click();
//		if(id.endsWith("zab94")) {
//			System.out.println("valid login");
//		}
//		else {
//			System.out.println("invalid login");
//		}
//	}
//	
//	@When("User have to  pass the valid login and Invalid password and click login in Adactin")
//	public void user_have_to_pass_the_valid_login_and_invalid_password_and_click_login_in_adactin() throws IOException {
//		MaintainPojo m = new MaintainPojo();
//		String id = excellread("Book1", "employee details", 3, 1);
//		String pass = excellread("Book1", "employee details", 3, 2);
//		m.getUserName(id);
//		m.getPassword(pass);
//		m.getClick().click();
//		if(pass.endsWith("IP5")) {
//			System.out.println("valid login");
//		}
//		else {
//			System.out.println("invalid login");
//		}
//	}
//	
//	@When("User have to  pass the Invalid login and Invalid password and click login in Adactin")
//	public void user_have_to_pass_the_invalid_login_and_invalid_password_and_click_login_in_adactin() throws IOException {
//		MaintainPojo m = new MaintainPojo();
//		String id = excellread("Book1", "employee details", 3, 1);
//		String pass = excellread("Book1", "employee details", 3, 2);
//		m.getUserName(id);
//		m.getPassword(pass);
//		m.getClick().click();
//		if(pass.endsWith("IP5")) {
//			System.out.println("valid login");
//		}
//		else {
//			System.out.println("invalid login");
//		}
//	}
//
//	@Then("user can close the broswer")
//	public void user_can_close_the_broswer() {
//	   //closecurrentTab();
//	}
	
	@Given("User have to lanch the Adactin url through chrome browser")
	public void user_have_to_lanch_the_adactin_url_through_chrome_browser() {
//		broswer();
//	    gourl("https://adactinhotelapp.com/");
	}
	@When("User have to  pass the valid login and valid password and click login in Adactin")
	public void user_have_to_pass_the_valid_login_and_valid_password_and_click_login_in_adactin(io.cucumber.datatable.DataTable d) {
		List<String> asList = d.asList();
		MaintainPojo m = new MaintainPojo();
		m.getUserName(asList.get(0));
		m.getPassword(asList.get(1));
		m.getClick().click();
	}
	@When("select hotel location, room number for adult and child and submit")
	public void select_hotel_location_room_number_for_adult_and_child_and_submit() {
		Search s= new Search();
    	WebElement location = s.getLocation();
		visibleindex(location, 1);
		WebElement hotels = s.getHotels();
    	visibleindex(hotels, 3);
    	WebElement rooms = s.getRooms();
    	visibleindex(rooms, 2);
    	WebElement roomssnumber = s.getRoomssnumber();
    	visibleindex(roomssnumber, 3);
    	WebElement datein = s.getDatein();
    	passValue(datein, "12/09/2026");
    	WebElement dateout = s.getDateout();
    	passValue(dateout, "12/09/2026");
    	WebElement adultroom = s.getAdultroom();
    	visibleindex(adultroom, 3);
    	WebElement childroom = s.getChildroom();
    	visibleindex(childroom, 3);
    //	Assert.assertTrue("able to login", location.isDisplayed());
    	WebElement login = s.getLogin();
    	clicks(login);
    	System.out.println("completed 2");
    	
    	 Radio r= new Radio();
     	WebElement button = r.getbutton();
     	clicks(button);
     	WebElement submit = r.getSubmit();
     	clicks(submit);
     	System.out.println("completed 3");
     	
     	Information i= new Information();
    	WebElement intialname = i.getIntialname();
    	passValue(intialname, "sathish");
    	WebElement finalname = i.getFinalname();
    	passValue(finalname, "kumar");
    	WebElement address = i.getAddress();
    	implicitTime(10);
    	passValue(address, "anna nagar, chennai");
    	WebElement cardnumber = i.getCardnumber();
    	passValue(cardnumber, "1234567898765432");
    	fluentTime(10, 9);
    	WebElement type = i.getType();
    	visibleindex(type, 2);
    	WebElement month = i.getMonth();
    	visibleindex(month, 3);
    	WebElement year = i.getYear();
    	visibleindex(year, 5);
    	WebElement cvv = i.getCvv();
    	passValue(cvv, "234");
    //	Assert.assertEquals(123, 234);
    	WebElement book = i.getBook();
    	clicks(book);
    	System.out.println("completed 4");
	}
	
	
	
	@When("User have to  pass the valid login and Invalid password and click login in Adactin")
	public void user_have_to_pass_the_valid_login_and_invalid_password_and_click_login_in_adactin(io.cucumber.datatable.DataTable d) {
		Map<String,String> asMap = d.asMap();
	    MaintainPojo m= new MaintainPojo();
	    m.getUserName(asMap.get("username"));
	    m.getPassword(asMap.get("password"));
	}
	
	@When("User have to  pass the Invalid login and Invalid password and click login in Adactin")
	public void user_have_to_pass_the_invalid_login_and_invalid_password_and_click_login_in_adactin(io.cucumber.datatable.DataTable d) {
	         List<Map<String,String>> asMaps = d.asMaps();
	         Map<String, String> map = asMaps.get(0);
	         MaintainPojo m= new MaintainPojo();
	 	    m.getUserName(map.get("username"));
	 	    m.getPassword(map.get("password"));
	 	    m.getClick().click();
	}
	
	@When("User have to  pass the Invalid login and valid password and click login in Adactin")
	public void user_have_to_pass_the_invalid_login_and_valid_password_and_click_login_in_adactin(io.cucumber.datatable.DataTable d) {
		List<List<String>> asLists = d.asLists();
	    List<String> list = asLists.get(0);
	    MaintainPojo m= new MaintainPojo();
	    m.getUserName(list.get(0));
	    m.getPassword(list.get(1));
	    m.getClick().click();
	}
	
	@Then("user can close the broswer")
	public void user_can_close_the_broswer() {
		//closecurrentTab();
	}
	

}
