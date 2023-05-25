package org.utililty;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
		public static WebDriver driver ;
		//public static Actions ac;
		public static Alert al ;
		//public static Select sc ;
		public static JavascriptExecutor js;
		public static TakesScreenshot ss ;
		public static WebDriverWait wait ;
		public static Robot rb ;
	//BrowserLaunch
	public static void getDriver(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("invalid browser name");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	//Launch url
	public void searchUrl(String url) {   //1
		driver.get(url);
	}

	// method for send keys
	public void typeText(WebElement element, String data) { //2
		element.sendKeys(data);
	}

	//btn Click
	public void btnClick(WebElement element) {  //3
		element.click();
	}

	// get text
	public String getText(WebElement element) {  //4
		String text = element.getText();
		System.out.println(text);
		return text;
	}

	//getAttribute
	public String getAttribute(WebElement element,String data) {  //5
		String attribute = element.getAttribute(data);
		System.out.println(attribute);
		return attribute;
	}

	//close
	public void close() { //6
		driver.close();
	}

	//quit
	public static void quit() {  //7
		driver.quit();
	}

	public void clear(WebElement element) {
		element.clear();

	}

	//actions 
	//public void actions() {   //8
	//	
//		ac = new Actions(driver);
	//}

	// right click with ref
	public void rightClickRef(WebElement rightclick) {  //9
		Actions ac = new Actions(driver);
		ac.contextClick(rightclick).perform();
	}

	//right click
	public void rightClick() {  //9
	     Actions ac = new Actions(driver);
		 ac.contextClick().perform();
	}

	//mouse hover 
	public void mouseHover(WebElement element) {   //10
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	//double click with ref
	public void doubleClickRef(WebElement doubleClick) {   //11
		Actions ac = new Actions(driver);
		ac.doubleClick(doubleClick).perform();
	}

	//double click
	public void doubleClick(WebElement doubleClick) {   //12
		Actions ac = new Actions(driver);
		ac.doubleClick(doubleClick).perform();
	}

	//drag and drop
	public void dragAndDrop(WebElement drag,WebElement drop) { //13
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();
	}

	// alert
	public void alert() {  //14
		//Alert al= driver.switchTo().alert();
	}

	//accept
	public void alerAccept() {  //15
		Alert	 al= driver.switchTo().alert();
		al.accept();
	}

	//dismiss
	public void alertDismiss() {  //16
		Alert	 al= driver.switchTo().alert();
		al.dismiss();
	}

	//sendkeys
	public void alertSendKeys(String alertText) {  //17
		al.sendKeys(alertText);
	}

	//gettext
	public String alertGetText() {  //18
		String alertText1 = al.getText();
		System.out.println(alertText1);
		return alertText1;
	}
	//windows handles
	//public void windowHandles() {
//		//driver.switchTo().window(String url1);
//		Set<String> handles = driver.getWindowHandles();
	//}


	//Select
	//public void select(WebElement selectRef) { // 19
//		sc = new Select(selectRef);
	//}

	//selectByValue
	public void selectByValue(WebElement ele,String value) { //20
		Select sc = new Select(ele);
		sc.selectByValue(value);
	}

	//selectByIndex
	public void selectByIndex(WebElement ele,int index) { //21
		Select sc = new Select(ele);
		sc.selectByIndex(index);
	}

	//selectByVissibleText
	public void selectByVissibleText(WebElement ele,String text) {  //22
		Select sc = new Select(ele);
		sc.selectByVisibleText(text);
	}

	//getOptions
	public List<WebElement> getOptions(WebElement ele) {  //23
		Select sc = new Select(ele);
		List<WebElement> options = sc.getOptions();
		return options;
	}

	//isMultiple
	public boolean isMultiple(WebElement ele) { //24
		Select sc = new Select(ele);
		boolean multiple = sc.isMultiple();
		return multiple;
	}

	//getFirstSelectedOption
	public WebElement getFirstSelectedOption(WebElement ele) {  //25
		Select sc = new Select(ele);
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		return firstSelectedOption;
	}

	//getAllSelectedOptions
	public List<WebElement> getAllSelectedOptions(WebElement ele) {  //26
		Select sc = new Select(ele);
		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		return allSelectedOptions;
	}

	//deSelectByIndex
	public void deSelectByIndex(WebElement ele,int index) {  //27
		Select sc = new Select(ele);
		sc.deselectByIndex(index);
	}

	//deSelectByValue
	public void deSelectByValue(WebElement ele,String value) { //28
		Select sc = new Select(ele);
		sc.deselectByValue(value);
	}

	//deSelectByVissibleText
	public void deSelectByVissibleText(WebElement ele,String text) {  //29
		Select sc = new Select(ele);
		sc.deselectByVisibleText(text);
	}

	//deSelectAll
	public void deSelectAll(WebElement ele) {  // 30
		Select sc = new Select(ele);
		sc.deselectAll();
	}


	//JavaScript
	public void javaScript() { // 31
		js = (JavascriptExecutor) driver;
	}

	//javaScriptSetAttribute
	public void javaScriptSetAttribute(String text, Object args) {  // 32
		JavascriptExecutor js;	js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '" + text + "')", args);
		
		
	}

	//javaScriptGetAttribute
	public void javaScriptGetAttribute(WebElement ele,String script, Object args) { // 33
		Select sc = new Select(ele);
		  String value = (String) js.executeScript(script, args);
		  System.out.println(value);
		 
	}

	//javaScriptClick
	public void javaScriptClick(String script, Object args) { //34
		js.executeScript(script, args);
	}

	//scrollDown
	public void scrollDown(Object element) {  // 35
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollUp(Object element) {  //36
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}


	//screenShot
	public void screenShot() {  // 37
		ss = (TakesScreenshot) driver;
	}

	//screenShotNormal
	public void screenShotNormal(OutputType<Object> target) {  //38
		ss.getScreenshotAs(target);
	}

	//screenShotElement
	public void screenShotElement(WebElement element,OutputType<Object> target) {   // 39
		ss.getScreenshotAs(target);
	}

	//getEnteredUrl
	public void getEnteredUrl() {  // 40
		driver.getCurrentUrl();
	}

	//Navigate
	//NavigateUsingUrl
	public void navigateUsingUrl(String url) {  //41
		driver.navigate().to(url);
	}

	//Navigate BackWord
	public void toNavigateBackward() {   //42
		driver.navigate().back();
	}

	//Navigate Forword
	public void toNavigateForward() {  //43
		driver.navigate().forward();
	}

	//Navigate RefreshPage
	public void toRefreshWebpage() {  //44
		driver.navigate().refresh();
	}


	//Frame

	//Frame by index
	public void switchToFrameIndex(int index) {  //45
		driver.switchTo().frame(index);
	}

	//frame by name
	public void switchToFrameName(String name) {  //46
		driver.switchTo().frame(name);
	}

	// switch to parent frame
	public void switchToParentFrame() {  //48
		driver.switchTo().parentFrame();
	}


	//waits
	//public void waits() {  //49
//		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//}

	//waitVisibilityElement
	public void waitVisibilityElement(String name,String name1) {  //50
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		until.sendKeys(name1);
	}


	// Robot Class
	public void robotClass() throws AWTException {  //51
		new Robot();
		
	}

	//DataDriven
	//getCellValue
	public String getCellValue(String pathname, String sheetName, int rownum, int cellnum) throws IOException {
		String ref = "0";
		File file = new File(pathname);
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		//cell.setCellType(CellType.STRING);
		//return ref;
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			ref=cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dformet = new SimpleDateFormat("MM-yy-dd");
				String format = dformet.format(dateCellValue);
				System.out.println(format);
				ref=dformet.format(dateCellValue);
	          } else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (round == numericCellValue) {
					System.out.println(round);
					ref=String.valueOf(numericCellValue);
					} else {
					ref=String.valueOf(round);
					System.out.println(numericCellValue);

				}
			}
			break;
		default:
			break;
			
		}
		return ref;
	}

	//modifyCellValue
	//public long modifyCellValue(String pathname, String sheetName, int rownum, int cellnum) throws IOException {
//		File file = new File(pathname);
//		FileInputStream stream = new FileInputStream(file);
//		Workbook book = new XSSFWorkbook(stream);
//		Sheet sheet = book.getSheet(sheetName);
//		Row row = sheet.getRow(rownum);
//		Cell cell = row.getCell(cellnum);
////		cell.setCellType(CellType.STRING);
////		String stringCellValue = cell.getStringCellValue();
////		return stringCellValue;
	//	
//		cell.setCellType(CellType.NUMERIC);
//		double numericCellValue = cell.getNumericCellValue();
//		long round = Math.round(numericCellValue);
//		if (round==numericCellValue) {
//			return round;
//			
//		}else {
//			return (long) numericCellValue;
//		}
	//}
	public void createCellValue(WebElement element,String pathname,  String sheetName,int rowIndex, int cellIndex) throws IOException {
		File file = new File(pathname);
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet createSheet = book.createSheet(sheetName);
		Row createRow = createSheet.createRow(rowIndex);
		Cell createCell = createRow.createCell(cellIndex);
		String text = element.getText();
		createCell.setCellValue(text);
		//createCell.setCellValue(value);
		FileOutputStream st = new FileOutputStream(file);
		book.write(st);
		System.out.println("====Done=====");
	}
}
