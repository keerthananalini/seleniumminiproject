package seleniumniniproject;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	public static void main(String[] args) {                                            
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317303\\eclipse-javaworkspace\\selinium\\browser\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under 30000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebDriverWait wait =  new WebDriverWait(driver,30);
		WebElement searchMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small'][1]")));
		String searchMessageText = searchMessage.getText()	;
		//validating the search message 
		if(searchMessageText.contains("mobile smartphones under 30000")) {
			System.out.println("Search message text is correct:"+searchMessage);
		}
		else {
			System.out.println("Search message text is Incorrect:"+searchMessage);
		}
		String[] part = searchMessageText.split(" ");
		String pages = part[0];
		String itemText = part[3].replace(",","");
		String[] pagess = part[0].split("-");
		int totalPages =Integer.parseInt(pagess[1]);
		//validating the search pages count
		if(totalPages>0) {
			System.out.println("Page range validated successfully:"+pages);
		}
		else {
			System.out.println("Page range validation failed:"+pages);
		}
		//validating the search item count
		int itemCount = Integer.parseInt(itemText);
		if(itemCount > 0) {
			System.out.println("Items Count validated successfully:"+itemText);
		}
		else {
			System.out.println("Item Count validation failed:"+itemText);
		}
		driver.findElement(By.className("a-dropdown-label")).click();
		
		List<WebElement> sort=  driver.findElements(By.xpath("//div[@class='a-popover-inner']//li[@class='a-dropdown-item']"));
		//System.out.println(sort.size());		
		for(int i=0;i<sort.size();i++)
		{
			
			System.out.println("Options Available in Sort list are: "+sort.get(i).getText());
		}
		System.out.println("Number of List in Sort option"+sort.size());
		driver.findElement(By.id("s-result-sort-select_4")).click();
		WebElement selectedOption = driver.findElement(By.cssSelector("#s-result-sort-select option:checked"));
		String selectedOptionText = selectedOption.getText();
		if(selectedOptionText.equals("Newest Arrivals")) {
			System.out.println("Newest Arrivals option selected correctly");
		}
		else {
			System.out.println("Newest Arrivals option not selected ");
		}
		driver.quit();
	}
}

