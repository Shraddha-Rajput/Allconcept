package conditional_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_checkbox
{ //writing Code for counting checkbox and print name of all and wether active/onactiv

	public static void main(String[] args) throws Throwable
	{

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/princ/OneDrive/Documents/RPA/AUTOMATION/ONLINE%20RANGA%20REDDY/HTML_page/checkbox_1.html");
		Thread.sleep(2000);
		
		
		//get collection of all checkbox elemnt identify common in all
		
		List<WebElement> allcheckbox= driver.findElements(By.xpath("//input[@ type= 'checkbox' ]"));  //manally type szpth chose which is common amon all tag
		Thread.sleep(2000);
		System.out.println("No of checkbox"  +allcheckbox.size()); //no of check box through six emthod
		
		
		//check which check boc is elected /unselcted in the entire colelction not single elemntn so will  use for
		for (WebElement value: allcheckbox) //psotion is  holding all checkbox inex pistion
		{
			//1. verify which checcbox is checked/unchecked
			boolean checked= value.isSelected();
			Thread.sleep(2000);
			System.out.println("Checkbox is  Selected/unselected "  + checked);
			  //check holding treu or false
			
			
			//2.Return run type property value  use  getAttribute method
			//get each checkbox name 
			String checkboxname=value.getAttribute("value");   
			System.out.println("allCheckbox name and whtheter selected /unselceted  "  + checkboxname +  "   "  +checked );  //first print name and the true or flase
			Thread.sleep(3000);
			
			//check or uncheck(slecting or unselecting) each checbox
			//will use click method for radio and checkbox button
			Thread.sleep(2000);

			 value.click();   
			 
			 
			
     	}
		
	   Thread.sleep(2000);
		
		//Getting  all checkbox value name as JAVa.Selneium using Getattribute method
		//gettign true or false using Isselcted method
//		/"//input[@ type= 'checkbox'   input -tagname , type is proeprtyattributename .proeprty value= checkbox
	
	  // hadoop ame checkbox ni aaa  satring mae retun false using Iselcetd method  after click uncheck
	}

}
