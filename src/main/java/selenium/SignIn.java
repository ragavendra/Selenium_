package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.*;

public final class SignIn extends Base {
	
    public SignIn(WebDriver driver)// : Base(driver)
    {
    	super(driver);
    }

    //public string pageTitle => driver.Title;

    //making it more obvious to find the element
    public WebElement Email_() { return driver.findElement(RelativeLocator.with(By.id("email")).above(By.id("password")));}

    public WebElement Email() { return driver.findElement(By.id("email"));}

    public WebElement Password_() { return driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email")).above(By.className("btn-primary")));}
    public WebElement Password() { return driver.findElement(By.id("password"));}

    //var submitLocator = RelativeBy.WithLocator(By.TagName("button")).Below(By.Id("email")).RightOf(By.Id("cancel"));
    public WebElement signIn_1() { return driver.findElement(RelativeLocator.with(By.className("btn-primary")).below(By.id("password")).below(By.id("email")));}
    public WebElement signIn_() { return driver.findElement(By.className("btn-primary"));}

    //public IWebElement Select => driver.FindElement(By.LinkText("Select"));
    //public IWebElement LoginButton => driver.FindElement(By.CssSelector("#login"));


}
