package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{
    Actions actions = new Actions(driver);

    //************************* Header Locators ************************
    @FindBy(css = "#header .logo")
    WebElement logo;

    @FindBy(xpath = "//*[@id=\"header\"]//div[6]/a[1]/span")
    WebElement memberLogin;

    @FindBy(xpath = "//*[@id=\"header\"]//div[6]/a[2]/span")
    WebElement providerLogIn;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1)")
    WebElement langChange;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    WebElement langSanish;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)")
    WebElement langChinese;

    @FindBy(css = "input.display.search_box_upd")
    WebElement searchBox;

    @FindBy(xpath = "//input[@name = 'sa']")
    WebElement goBtn;

    @FindBy(xpath = "//*[@id=\"menu-item-424\"]/a")
    WebElement getHealthInsuNav;

    @FindBy(xpath = "//*[@id=\"menu-item-8903\"]/a")
    WebElement manageLongTPlan;





    //************************* Header methods ************************
    public void search(){
        searchBox.sendKeys("doctor");
        goBtn.click();
    }

    public void langChangeEnglishToChinese(){
        actions.moveToElement(langChange).moveToElement(langChinese).click().build().perform();
    }

    public void goToMemberLogin(){

    }

    public void gotoProviderLogin(){

    }

    public void gotoInfoForBrokers(){

    }

    public void gotoInfoForEmployers(){

    }



}
