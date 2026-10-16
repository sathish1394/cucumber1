package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class MaintainPojo extends BaseClass{
		public MaintainPojo(){
			PageFactory.initElements(getDriver(), this);
		}
		 @FindBy(name= "username")
		 private WebElement userName;
		 
		 @FindBy(xpath="//input[@type='password']")
		 private WebElement password;
		 
		 @FindBy(xpath="//input[@name='login']")
		 private WebElement  click;

		 public WebElement getUserName(String name) {
			enterValue(userName, name);
			 return userName;
		 }
		 public WebElement getPassword(String pass) {
			 enterValue(password, pass);
			 return password;
		 }
		 public WebElement getClick() {
			 return click;
		 }


}
