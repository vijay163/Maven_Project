package Com.Actitime.Generics;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FWUtills extends BaseClass implements IAutoConstant
{
	/**
	 * this method is used to read the data from ExcelSheet
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 */
	public static String read_XL_Data(String path,String sheet,int row,int cell)
	{
		String data="";
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	    data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return data;
		
	}
	/**
	 * this method is used to read the number of rows 
	 * @param path
	 * @param sheet
	 * @return
	 */
	public static int read_XL_RowCount(String path,String sheet)
	{
		int rowCount=0;
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	    rowCount = wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return rowCount;
		
	}
	/**
	 * this method is write the reports into XL_Sheet
	 * @param path
	 * @param sheet
	 * @param row
	 * @param col
	 * @param cellValue
	 */
	public static void write_Xl_DATA(String path,String sheet,int row,int col,String cellValue)
	{
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		    wb.getSheet(sheet).createRow(row).createCell(col).setCellValue(cellValue);
		    
		    wb.write(new FileOutputStream(path));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
	}
	/**
	 * this method is used TakeScreenShot
	 * @param driver
	 * @param path
	 */
	public static void takeScreenShot(WebDriver driver,String path)
	{
		try
		{
		 TakesScreenshot ts = (TakesScreenshot)driver;
		// ts.getScreenshotAs(OutputType.FILE).new File("./ScreenShot/").
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	    }
		catch (Exception e) 
		{
			e.printStackTrace();
		}

   }
	/**
	 * this Method is Used to Verifie the Page Title
	 * @param driver
	 * @param expTitle
	 */
	 public static void verifyTitleOfHomePage(WebDriver driver,String expTitle)
	   {
		    
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   wait.until(ExpectedConditions.titleContains(expTitle));
		   String acutTitle = driver.getTitle();
		   Assert.assertEquals(acutTitle, expTitle);
		   System.out.println("the EXpected Title page is Displayed===="+expTitle);
	   }
	 /**
	  * this method is used to Call ExplicitWait
	  * @param driver
	  * @return
	  */
	 public static WebDriverWait explcitlyWait(WebDriver driver)
	 {
		 return new WebDriverWait(driver,ETO);
	 }
	 /**
	  * this method is Used to perform Actoinsclass
	  * @param driver
	  * @return
	  */
	 public static Actions actions(WebDriver driver)
	 {
		 return new Actions(driver);
	 }
	 /**
	  * this Method is used To perform SelectActions
	  * @param element
	  * @return
	  */
	 public static Select select(WebElement element)
	 {
		 return new Select(element);
	 }
	 /**
	  * this Method is used to Perform RobotClassActions
	  * @return
	  */
	 public static Robot robot()
	 {
		 Robot r=null;
		 try 
		 {
			 return new Robot();
			
		} 
		 catch (Exception e) 
		 {
			e.printStackTrace();
		}
		 return r;
	 }
	 public static JavascriptExecutor javaScriptScroll(WebDriver driver)
	 {
		  return (JavascriptExecutor)driver;
	     
	   
	 }
	 
}