package HGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Url = "http://testfire.net/index.jsp";
		System.setProperty("webdriver.chrome.driver","E:\\PritiSelenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get(Url);

	}

}
