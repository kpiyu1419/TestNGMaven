package com.HG.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HealthGraph {

	 public String url="http://testfire.net/index.jsp";
	 public WebDriver driver;
	 
	 @BeforeTest
	 public void LaunchApplication()
	 {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://testfire.net/index.jsp");
	 }
	
	  @Test
	  public void LoginPage() {
		  
		  WebElement loginlink=driver.findElement(By.id("AccountLink"));
		  loginlink.click();
		  
		  
		  //Invalid credential login
		 /* WebElement username=driver.findElement(By.id("uid"));
		  username.sendKeys("demo_user");
		  WebElement password=driver.findElement(By.id("passw"));
		  password.sendKeys("demo_password");
		//  driver.findElement(By.id("user_password"));
		  WebElement btn=driver.findElement(By.name("btnSubmit"));
		  btn.click();*/
		  
		  //Valid credentials
		  
		  WebElement username=driver.findElement(By.id("uid"));
		  username.sendKeys("admin");
		  WebElement password=driver.findElement(By.id("passw"));
		  password.sendKeys("admin");
		//  driver.findElement(By.id("user_password"));
		  WebElement btn=driver.findElement(By.name("btnSubmit"));
		  btn.click();
		  
		  //Click on ViewAccSummary
		  WebElement viewAccSummary=driver.findElement(By.id("MenuHyperLink1"));
		  viewAccSummary.click();
		  //select 800001 acc in dropdown
		 Select se = new Select(driver.findElement(By.name("listAccounts")));
		se.selectByValue("800001");
		
		WebElement btn1=driver.findElement(By.id("btnGetAccount"));
		  btn1.click();
		  
		  //Assert  for balance??
		  
		  WebElement balanceverify= driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr[4]/td[2]"));
		 System.out.println( balanceverify.getText());
		  
		 String expectedBal = "$108874.00";
		  Assert.assertEquals(expectedBal,balanceverify);
		  
		  System.out.println("Balance verified");
		  
		  //Click on Transfer funds
		  WebElement transferlink=driver.findElement(By.id("MenuHyperLink3"));
		  transferlink.click();
		  
		  Select fa = new Select(driver.findElement(By.name("fromAccount")));
			
			fa.selectByValue("800000");
			
			Select ta = new Select(driver.findElement(By.name("toAccount")));

			ta.selectByValue("800001");
			
			WebElement AmountTotransfer=driver.findElement(By.id("transferAmount"));
			AmountTotransfer.sendKeys("9876");
			
			//Transfer amout button click
			WebElement btn3=driver.findElement(By.id("transfer"));
			  btn3.click();
			  
			  
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  //Validate Trasnsaction Deatil message
			  
			//  WebElement transactionDetailMessage= driver.findElement(By."//span[@id='_ctl0__ctl0_Content_Main_postResp']");
			  
			 /* WebElement transactionDetailMessage=driver.findElement(By.id("_ctl0__ctl0_Content_Main_postResp"));
			  transactionDetailMessage.getText();
			  
			  String expectedText = "9876.0 was successfully transferred from Account 800000 into Account 800001 at 10/13/22 10:12 PM.";
			  Assert.assertEquals(transactionDetailMessage,expectedText);
			  
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  */
			  
			  //Click on View Recent Transactions
			  
			  WebElement veiwRecentTransactions=driver.findElement(By.id("MenuHyperLink2"));
			  veiwRecentTransactions.click();
			  
			  //Validate First Two Transactions??
			  
		  
	  
	  }
		  
		  
			  @AfterTest
			  public void signOff()
			  {
		  
		  
			  WebElement contactUs=driver.findElement(By.id("HyperLink3"));
			  contactUs.click();
			  
			  //Click On Online Form
			  
			  driver.findElement(By.linkText("online form")).click();
			  
			  //WebElement onlineFormlink=driver.findElement(By.id("HyperLink3"));
			// onlineFormlink.click();
			  
			  //Feedback Form Details
			  
			  WebElement yourName=driver.findElement(By.name("name"));
			  yourName.sendKeys("Admin User");
			  
			  WebElement emailid=driver.findElement(By.name("email_addr"));
			  emailid.sendKeys("kpiyu1419@gmail.com");
			  
			  WebElement subject=driver.findElement(By.name("subject"));
			  subject.sendKeys("MyFeedback");
			  
			  
			  WebElement comments=driver.findElement(By.name("comments"));
			  comments.sendKeys("Good experince in using this application");
			  
			  WebElement submitfeedback=driver.findElement(By.name("submit"));
			  submitfeedback.click();
			  
			  //Validate Thank you message
			  WebElement messgeValidation= driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1"));
			  
			  //Verify Thank you message is Displayed
			  if(messgeValidation.isDisplayed())
			  {
				  System.out.println("thank you message is Dispalyed");
			  }
			  
			  else
			  {
				  System.out.println("thank you message is not Dispalyed");
			  }
			 // /html/body/table/tbody/tr[2]/td[2]/div/h1	  
			  
			  WebElement signOff=driver.findElement(By.id("LoginLink"));
				signOff.click();
				
				//Validate user is signed off
				
				 WebElement signOffValidation= driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1"));
				
		  
	  }
	
}
