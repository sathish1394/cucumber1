package org.baseclass;

import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	//public static WebDriver d;
	public static 	JavascriptExecutor js;
	public static Actions a;
	public static Robot r;
	public static Select ss;
	public static FluentWait f;
	public static WebDriverWait wd;
	public static Alert at;
	public static Frame fr;
	
	private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
	
	public static void  setDriver(WebDriver driver) {
		tdriver.set(driver);
	}
		public static WebDriver getDriver() {
			return tdriver.get();
			
		}
		public static void unload() {
			if(tdriver.get() !=null) {
				tdriver.get().quit();
				tdriver.remove();
			}
		}
	
		public static void broswer() {
		   WebDriver d= new ChromeDriver();
		   setDriver(d);
		}
		public static void broswer1() {
		    WebDriver d= new FirefoxDriver();
		    setDriver(d);
		}
		public static void broswer3() {
		   WebDriver d= new EdgeDriver();
		   setDriver(d);
		}
	
//	public static void broswer() {
//	    d= new ChromeDriver();
//	}
//	public static void broswer1() {
//	    d= new FirefoxDriver();
//	}
//	public static void broswer3() {
//	    d= new EdgeDriver();
//	}
	public static void gourl(String url) {
	    getDriver().get(url);
	}
	public static void getLink() {
		String currentUrl = getDriver().getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static String getLinks() {
		String currentUrl = getDriver().getCurrentUrl();
		return currentUrl;
	}
	public static void max() {
		//d.manage().window().maximize();
		getDriver().manage().window().maximize();
	}
	
	public static void min() {
		//d.manage().window().minimize();
		getDriver().manage().window().minimize();
		}
	public static void closecurrentTab() {
		//d.close();
		getDriver().close();
	}
	public static void closeentireTab() {
		//d.quit();
		getDriver().quit();
	}
	public static void enterValue(WebElement username, String values) {
	 username.sendKeys(values);
	}
	public static void passValue(WebElement pass, String values) {
		 pass.sendKeys(values);
    }
	public static void clicks(WebElement inputs) {
		inputs.click();
	}
	public static void visibleindex(WebElement name, int num) {
		ss = new Select(name);
		ss.selectByIndex(num);
	}
	
	public static void Visibletext(WebElement names,  String text) {
		ss = new Select(names);
		ss.selectByVisibleText(text);
	}
	
	public static void auto() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
    }
	
	public static  void script(WebElement input, String firstvalue ) {
		//js= (JavascriptExecutor) d;
		js=(JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].setAttribute('value','firstvalue')", input);
    }
	
	public static void scripts(WebElement inputs, String button) {
		js.executeScript("arguments[0].click()", inputs);
	}
	public static void script1(WebElement input, String secondvalues) {
		js.executeScript("return arguments[0].getAttribute('value')", input);
	}
	public static void scroll(WebElement input,  boolean  name) {
		js.executeScript("arguments[0].scrolldown(name)", input);
	}
	public static void scrollReverse(WebElement input,  boolean names) {
		js.executeScript("arguments[0].scrollup(names)", input);
	}
	
	//public static void sshot(String name, String snap) throws IOException {
	public static void sshot( String path) throws IOException {
		//TakesScreenshot t=(TakesScreenshot)d;
		TakesScreenshot t= (TakesScreenshot)getDriver();
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	//File f= new File("C:\\Users\\Dell\\eclipse-workspace\\SathishMaven\\target"+snap+".png");
		File f= new File(path);
		FileUtils.copyFile(screenshotAs, f);
}
	
	public static void texts(WebElement input, String name) {
	      input.getText();
	}
	
	public static void nameAttribute(WebElement inputss, String name) {
		inputss.getAttribute(name);
	}

	
	public static void dd(WebElement src, WebElement per) {
		a.dragAndDrop(src, per);
	}
	
	public static void me(WebElement move) {
		a.moveToElement(move);
	}
	
	public static void rightClick(WebElement click) {
		a.contextClick(click);
	}
	public static void copy() {
		a.doubleClick();
	}
	
	public static void options() {
		ss.getOptions();
	}
	public static void selectMultiple() {
		ss.isMultiple();
	}
	public static void removeSelectIndex(int value) {
		ss.deselectByIndex(value);
	}
	public static void removeAll() {
		ss.deselectAll();
	}
	public static void removeSelectText(String text) {
		ss.deselectByVisibleText(text);
	}
	public static void time() {
		Date d =new Date();
		System.out.println(d);
	}
	public static String excellread(String name, String sheetname, int num, int numm) throws IOException {
		File f= new File("C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\excel\\"+name+".xlsx");
		FileInputStream ff =new FileInputStream(f);
		Workbook w= new XSSFWorkbook(ff);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(num);
		Cell cell = row.getCell(numm);
		String data;
		if (cell.getCellType()==1) {
			 data = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateValue = cell.getDateCellValue();
			SimpleDateFormat s= new SimpleDateFormat();
			 data= s.format(dateValue);
		} else {
                 double d= cell.getNumericCellValue();
                 long l= (long)d;
                 data = String.valueOf(l);
		}
               return data;
		}
		
		
	public static void implicitTime(int seconds) {
	//	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public static void fluentTime(int seconds, int secondss) {
	// f= new FluentWait<WebDriver> (d).withTimeout(Duration.ofSeconds(seconds)).pollingEvery(Duration.ofSeconds(secondss)).ignoring(Exception.class);
	 f= new FluentWait<WebDriver> (getDriver()).withTimeout(Duration.ofSeconds(seconds)).pollingEvery(Duration.ofSeconds(secondss)).ignoring(Exception.class);
	}
	public static void webTime(int seconds) {
	 //wd = new WebDriverWait(d, Duration.ofSeconds(seconds));
	 wd = new WebDriverWait(getDriver(), Duration.ofSeconds(seconds));
	}
	public static  void alertOk() {
		at.accept();
	}
	public static void alertCancel() {
		at.dismiss();
	}
	public static void alertGet() {
		at.getText();
	}
	public static void alertPassValue(String name) {
		at.sendKeys(name);
	}
	public static void handleAlert() {
	//	at = d.switchTo().alert();
		at = getDriver().switchTo().alert();
	}
	public static void moveFrame(int num) {
		//d.switchTo().frame(num);
		getDriver().switchTo().frame(num);
	}
	public static void frameLink(String name) {
		//d.switchTo().frame(name);
		getDriver().switchTo().frame(name);
	}
	
	public static void handleWindow(String name) {
		//d.switchTo().window(name);
		getDriver().switchTo().window(name);
	}
	public static void handleSingle() {
		//d.getWindowHandle();
		getDriver().getWindowHandle();
	}
	public static void handleMultiple() {
		//d.getWindowHandles();
		getDriver().getWindowHandles();

	}
//	public static void click(WebElement inputs) {
//	inputs.click();
//}
}


