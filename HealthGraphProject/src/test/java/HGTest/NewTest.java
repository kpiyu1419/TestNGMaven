package HGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver = new ChromeDriver();
	String url="http://testfire.net/index.jsp";
  @Test
  public void f() {
	  
	//public void gmailLogin() {
          // launch the firefox browser and open the application url
      driver.get(url);
           
//maximize the browser window
       driver.manage().window().maximize();
	  System.out.println("Test area");
  }
 //BeforeClass
 //ublic void beforeClass() {
	 //ystem.out.println("Test Pre");
  //

 //AfterClass
 //ublic void afterClass() {
	//System.out.println("Test Post");
  }

//
