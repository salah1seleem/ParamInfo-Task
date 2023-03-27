package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
		
	@FindBy(id="country-name")
	public	WebElement countryBtn ; 
	
	@FindBy(id="country-selct")
	WebElement countryCollection ; 
	
	@FindBy(xpath = "(//div[@class='trial-cost'])[1]")
	public WebElement trailCostCurrency ; 
	
	@FindBy(id="name-lite")
	public WebElement lite ; 

	@FindBy(id="name-classic")
	public WebElement classic ; 
	
	@FindBy(id="name-premium")
	public WebElement premium ; 
	
	@FindBy(xpath = "(//i[contains(.,'USD/month')])[1]")
	public WebElement litePrice ; 
	
	@FindBy(xpath = "(//i[contains(.,'USD/month')])[2]")
	public WebElement classicPrice ; 
	
	@FindBy(xpath = "(//i[contains(.,'USD/month')])[3]")
	public WebElement premiumPrice ; 
	
	@FindBy(xpath = "//a[contains(.,'UAE')]")
	WebElement uae ; 
	
	@FindBy(xpath = "//span[contains(.,'Iraq')]")
	WebElement iraq ; 
	
	@FindBy(xpath = "//span[contains(.,'Oman')]")
	WebElement oman ; 
	
	@FindBy(xpath = "(//a[@class='plan-link'][contains(.,'Start Your Trial')])[1]")
	public WebElement startTrailLiteBtn ; 
	
	@FindBy(xpath = "(//a[@class='plan-link'][contains(.,'Start Your Trial')])[2]")
	public WebElement startTrailClassicBtn ; 
	
	@FindBy(xpath = "(//a[@class='plan-link'][contains(.,'Start Your Trial')])[3]")
	public WebElement startTrailPremiumBtn ; 
	
	@FindBy(xpath = "//div[contains(@class,'payment-option')]")
	public WebElement priceFromPaymentMethod ; 
	
	@FindBy(xpath = "(//a[contains(.,'Jawwy TV')])[1]")
	public WebElement jawwyBtn;
	
	public void changeCountryToUAE() throws InterruptedException 
	{
		clickButton(countryBtn);
        Thread.sleep(2000);
		clickButton(uae);
	}
	
	public void changeCountryToOman() throws InterruptedException 
	{
		clickButton(countryBtn);
        Thread.sleep(2000);
		clickButton(oman);
	}
	
	public void changeCountryToIraq() throws InterruptedException 
	{
		clickButton(countryBtn);
        Thread.sleep(2000);
		clickButton(iraq);
	}
	
	
	public void clickOnStartLiteTrail() throws InterruptedException 
	{
		clickButton(startTrailLiteBtn);
        Thread.sleep(2000);
	}

	public void clickOnStartClassicTrail() throws InterruptedException 
	{
		clickButton(startTrailClassicBtn);
        Thread.sleep(2000);
	}

	public void clickOnStartPremiumTrail() throws InterruptedException 
	{
		clickButton(startTrailPremiumBtn);
        Thread.sleep(2000);
	}
	public void clickOnjawwyBtnToBackHomePage() throws InterruptedException 
	{
		clickButton(jawwyBtn);
        Thread.sleep(2000);
	}


}
