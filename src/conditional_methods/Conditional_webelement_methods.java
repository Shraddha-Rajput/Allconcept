package conditional_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_webelement_methods {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//WebDriverManager.chromedriver.setUp();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		//isEnabled(); verify firstname texbox is enable dor not default all emenmnt wil be ebaled

		WebElement firstname= driver.findElement(By.name("firstname")); //wills tore irstname in Wement object so that will access all Webelemnt methods
		boolean value=firstname.isEnabled();
		System.out.println("Check enabledcor not  " + value);  //value variable give true or false

		WebElement lastname= driver.findElement(By.name("lastname")); 
		boolean textbox=lastname.isEnabled();
		System.out.println("Check enabledcor not " + textbox);

		//2.isDisplayed();	//return true if elemnt is display //false element is avaibel but got hidden from dev
          //2.Verify Elemnet is dispalyed or not

		
		WebElement  email= driver.findElement(By.name("reg_email_confirmation__"));
		boolean value2 = email.isDisplayed(); 
		System.out.println("Dispalyed ornot"   +value2);   //false ement is avai but hidden from hiiden from dev

		
		//3.Is Selected //Work only radio and checkbox whtehr they are enmabeld or not
		
		//3.verify radio button of Female is  checked or unchecked		
	  WebElement radio = driver.findElement(By.name("sex"));
	        boolean value3 =radio.isSelected();
	        
	        System.out.println("Check or unchecked" +value3);  //fasle
	        
	        
		
		




	}

}
