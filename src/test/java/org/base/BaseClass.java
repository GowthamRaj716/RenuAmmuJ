package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	static Robot r;
	static Actions a;

	public static void openChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openEdgeBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void maxWindow() {

		driver.manage().window().maximize();
	}

	public static void minWindow() {

		driver.manage().window().minimize();
	}

	public static void closeBrowser() {

		driver.quit();
	}

	public static void closeCurrentTab() {

		driver.close();
	}

	public static void reloadPage() {

		driver.navigate().refresh();
	}

	public static void applyImplicitWait(int time) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static void getDateAndTime() {

		Date d = new Date();
		System.out.println(d);
	}

	public static String fetchTitle() {

		String titleName = driver.getTitle();
		return titleName;
	}

	public static String fetchCurrentUrl() {

		String url = driver.getCurrentUrl();
		return url;
	}

	public static void launchUrl(String pgUrl) {

		driver.get(pgUrl);
	}

	public static void holdExecution(int time) throws InterruptedException {

		Thread.sleep(time);
	}

	public static void fillTextBox(WebElement element, String input) {

		element.sendKeys(input);
	}

	public static void toClickButton(WebElement ele) {

		ele.click();
	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void mouseHovering(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragDrop(WebElement e1, WebElement e2) {

		a = new Actions(driver);
		a.dragAndDrop(e1, e2).perform();
	}

	public void tablesCount() {

		List<WebElement> allTables = driver.findElements(By.tagName("table"));
		int noOfTables = allTables.size();
		System.out.println("No of tables : " + noOfTables);
	}

	public static void takeSnap(String picName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File sr = tk.getScreenshotAs(OutputType.FILE);
		File de = new File(
				"C:\\Users\\Amirtha\\eclipse-workspace\\FrameworkOffline10Am\\Pictures\\" + picName + ".png");
		FileUtils.copyFile(sr, de);
	}

	public static String readDataFromExcel(int rowNo, int cellNo, String sheetName) throws IOException {

		File f = new File(
				"C:\\Users\\Amirtha\\eclipse-workspace\\FrameworkOffline10Am\\ExcelSheets\\EmployeeDetails.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook b = new XSSFWorkbook(fin);

		Sheet sh = b.getSheet(sheetName);

		Row r = sh.getRow(rowNo);

		Cell c = r.getCell(cellNo);

		int type = c.getCellType();

		String input;
		if (type == 1) {

			input = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/yyyy");
			input = sim.format(da);
		}

		else {

			double d = c.getNumericCellValue();
			long l = (long) d;
			input = String.valueOf(l);
		}

		return input;
	}

}
