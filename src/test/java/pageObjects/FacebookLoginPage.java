package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Boolean.TRUE;

public class FacebookLoginPage {

    @FindBy(xpath = "//a[@title='Go to Facebook home']")
    public static  WebElement FacebookTitle;
    @FindBy(id = "email")
    public static WebElement emailInput;
    @FindBy(id = "pass")
    public static WebElement pwdInput;
    @FindBy(xpath = "//input[@value='Log In']")
    public static WebElement loginButton;
    @FindBy(linkText = "Forgotten account?")
    public static WebElement forgottenAccount;
    @FindBy(xpath ="//input[@name='firstname']")
    public static WebElement firstName;
    @FindBy(xpath="//input[@name='lastname']")
    public static WebElement surName;
    @FindBy(xpath="//input[@name='reg_email__']")
    public static WebElement emailPhone;
    @FindBy(xpath ="//input[@autocomplete='new-password']")
    public static  WebElement newPassword;
    @FindBy(xpath="//select[@id='day']")
    public static WebElement day;
    @FindBy(xpath="//select[@id='month']")
    public static WebElement month;
    @FindBy(xpath="//select[@id='year']")
    public static WebElement year;
    @FindBy(xpath="//input[@value='1']")
    public static WebElement radio1;
    @FindBy(xpath="//input[@value='2']")
    public static WebElement radio2;
    @FindBy(xpath="//input[@value='3']")
    public static WebElement radio3;
    @FindBy(xpath="//button[@type='submit']")
    public static WebElement signUp;
    @FindBy(linkText="Create a Page")
    public  static WebElement creatPage;
    @FindBy(linkText="English (UK)")
    public  static WebElement english;
    @FindBy(linkText="Español")
    public  static WebElement spanish;
    @FindBy(linkText="Polski")
    public  static WebElement polish;
    @FindBy(linkText="Français (France)")
    public static WebElement french;
    @FindBy(linkText="Italiano")
    public static WebElement italian;
    @FindBy(linkText="Lietuvių")
    public static WebElement lithuanian;
    @FindBy(linkText="Română")
    public static WebElement roman;
    @FindBy(linkText="Português (Brasil)")
    public static WebElement portugese;
    @FindBy(linkText="Deutsch")
    public static WebElement deutsch;

    public static boolean isWebElementExists(String element) {
       boolean b = false;
       if (element.equals("email")){
           b= emailInput.isDisplayed();
       } else if (element.equals("Password")) {
           b= pwdInput.isDisplayed();
       } else if (element.equals("FirstName")) {
           b= firstName.isDisplayed();
       } else if (element.equals("SurName")) {
           b= surName.isDisplayed();
       }
       return  b;
   }
   public static void SignUp(String fstName, String surNam,String email, String newpswd,String dob, String gender){
firstName.sendKeys(fstName);
surName.sendKeys(surNam);
emailPhone.sendKeys(email);
newPassword.sendKeys(newpswd);
Select dayNum = new Select(day);
dayNum.deselectByValue(dob.substring(0,2));
Select monNum = new Select(month);
monNum.deselectByValue(dob.substring(2,4));
Select yrNum = new Select(year);
yrNum.deselectByValue(dob.substring(4));

if (gender=="Female"){
     radio1.click();
}else if(gender=="Male"){
    radio2.click();
}else if(gender=="Custom"){
    radio3.click();
}
signUp.click();
   }


}

