package Demo.Pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RanjitExcel {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	FileInputStream file= new FileInputStream("C:\\Users\\pravi\\Desktop\\facebook.xlsx");
	Row row = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0);
	String username = row.getCell(0).getStringCellValue();
    String password = row.getCell(1).getStringCellValue();
	System.out.println("Username: "+username);
    System.out.println("Password: "+password);	
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.close();
	
		
		
	}
}
