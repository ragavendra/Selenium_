package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Base {

	public WebDriver driver;// {get; set;}

	//menus go on this class
	protected Base(WebDriver driver)
	{
		this.driver = driver;
	}

	//public string pageTitle1 = driver.Title;

	//public string pageTitle() { return driver.Title; }
	public String pageTitle() { return driver.getTitle(); }

	public WebElement plans() { return driver.findElement(By.linkText("Plans")); }

	public WebElement products() { return driver.findElement(By.linkText("Products")); }

	public WebElement signIn() { return driver.findElement(By.linkText("Sign In"));}

}


