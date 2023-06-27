//package week8;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindAll;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//import com.testleaf.base.ProjectSpecificMethods;
//
//public class LoginPage extends ProjectSpecificMethods {
//	
//	public LoginPage(ChromeDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(how = How.ID, using = "username") 
//	List<WebElement> eleUsername;
//	//AND Condition
////	@FindBys(
////			{
////				@FindBy(how = How.CLASS_NAME, using = "inputLogin"),
////				@FindBy(how = How.XPATH, using = "//input[@id='username']")
////			}
////			)
//	//OR Condition
////	@FindAll(
////			{
////				@FindBy(how = How.CLASS_NAME, using = "inputLogin"),
////				@FindBy(how = How.XPATH, using = "//input[@id='username']")
////			}
////			)
//	public LoginPage enterUserName(String userName) {
//		eleUsername.get(0).sendKeys(userName);
////		LoginPage lp = new LoginPage();
//		return this;
//	}
//	
//	@FindBy(how = How.ID, using = "password") 
//	WebElement elePassword;
//	public LoginPage enterPassword(String password) {
//		elePassword.sendKeys(password);
//		return this;
//	}
//	
//	public HomePage clickLogin() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//		return new HomePage(driver);
//	}
//}
