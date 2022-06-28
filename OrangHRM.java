package learning;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		WebElement username = driver.findElementById("txtUsername");
		username.sendKeys("Admin");
		
		WebElement password =driver.findElementById("txtPassword");
		password.sendKeys("admin123");
		
		WebElement login = driver.findElementById("btnLogin");
		login.click();
		
		WebElement admin = driver.findElementById("menu_admin_viewAdminModule");
		admin.click();
		
		WebElement addusename = driver.findElementById("btnAdd");
		addusename.click(); 
		
		WebElement selectrole = driver.findElementById("systemUser_userType");
		Select role = new Select(selectrole);
		
		role.selectByVisibleText("Admin");
		
		WebElement employeename = driver.findElementById("systemUser_employeeName_empName");
		employeename.sendKeys("Ananya Dash");
		
		WebElement username1 = driver.findElementById("systemUser_userName");
		username1.sendKeys("Shweta_124");
		
		WebElement status = driver.findElementById("systemUser_status");
		Select enabled = new Select (status);
		enabled.selectByVisibleText("Enabled");
		
		WebElement password1 = driver.findElementById("systemUser_password");
		password1.sendKeys("shweta123");
		
		WebElement confirmpassword = driver.findElementById("systemUser_confirmPassword");
		confirmpassword.sendKeys("shweta123");
		
		Thread.sleep(4000);
		
		WebElement save = driver.findElementById("btnSave");
		save.click();

		WebElement search =driver.findElementById("searchSystemUser_userName");
		search.sendKeys("Shweta_124");
		
	
		
		
		
		
	    
		
		
	
		
		
		
		
		

	}

}
 