package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class Iraq_Packages_Prices_Currency extends TestBase{
	
HomePage homeObject ; 
	
	@Test(priority=1)
	public void UserCanChangeCountriesAndCurrency() throws InterruptedException 
	{
		homeObject = new HomePage(driver); 
		homeObject.changeCountryToIraq();
		Assert.assertTrue(homeObject.trailCostCurrency.getText().contains("IQ/week"));
	}
	
	@Test(priority=2)
	public void Verify_Lite_Package_for_Iraq() throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.clickOnStartLiteTrail();
		Assert.assertTrue(homeObject.priceFromPaymentMethod.getText().contains("2.4"));
		homeObject.clickOnjawwyBtnToBackHomePage();
	}
	
	@Test(priority=3)
	public void Verify_Classic_Package_for_Iraq() throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.clickOnStartClassicTrail();
		Assert.assertTrue(homeObject.priceFromPaymentMethod.getText().contains("4.1"));
		homeObject.clickOnjawwyBtnToBackHomePage();
	}
	
	@Test(priority=4)
	public void Verify_Premium_Package_for_Iraq() throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.clickOnStartPremiumTrail();
		Assert.assertTrue(homeObject.priceFromPaymentMethod.getText().contains("6.2"));
	}
	 
}


