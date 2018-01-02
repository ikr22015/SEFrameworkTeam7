package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
//    @FindBy()
//    WebElement logo;
    @FindBy(xpath = "//input[@id=\"q\"]")
    WebElement searchBox;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    WebElement searchBtn;
//    @FindBy()
//    WebElement lngChange;
//    @FindBy()
//    WebElement login;
//    @FindBy()
//    WebElement accssAcclink;
//    @FindBy()
//    WebElement myUHC;
//    @FindBy()
//    WebElement homeNav;
//    @FindBy()
//    WebElement individualFamiliesNav;
//    @FindBy()
//    WebElement employeesNav;
//    @FindBy()
//    WebElement madicareNav;
//    @FindBy()
//    WebElement findDoctorNav;


    public void search(){
        searchBox.sendKeys("doctor");
        searchBtn.click();
    }
}
