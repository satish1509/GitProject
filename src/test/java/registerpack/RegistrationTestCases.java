package registerpack;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTestCases {
    @Test(priority=1)
	 public void registerAccountWithMandatoryFields() {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();//This project is not link with selenium library
     driver.manage().window().maximize();
     driver.get("http://tutorialsninja.com/demo");
     
     WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
     myAccountDropMenu.click();
     
    WebElement registerOption = driver.findElement(By.linkText("Register"));
    registerOption.click();
    
    WebElement firstNameField = driver.findElement(By.id("input-firstname"));
    firstNameField.sendKeys("Satish");
    
    WebElement lastNameField = driver.findElement(By.id("input-lastname"));
    lastNameField.sendKeys("Kumar");
    
    Date date = new Date();
    WebElement eMailField = driver.findElement(By.id("input-email"));
    eMailField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
    
    WebElement telephoneField = driver.findElement(By.id("input-telephone"));
    telephoneField.sendKeys("1234567890");
    
    WebElement passwordField = driver.findElement(By.id("input-password"));
    passwordField.sendKeys("12345");
    
    WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
    passwordConfirmField.sendKeys("12345");
    
    WebElement privacyPolicyField = driver.findElement(By.name("agree"));
    privacyPolicyField.click();
    
    WebElement continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
    continueButton.click();
    
    //checking whether the user successfully logged in or not
    myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
    myAccountDropMenu.click();
    
    WebElement logoutOption = driver.findElement(By.linkText("Logout"));
    Assert.assertTrue(logoutOption.isDisplayed());
    
    String actualURL = driver.getCurrentUrl();
	String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
	Assert.assertEquals(actualURL, expectedURL);
	
	String expectedHeading = "Your Account Has Been Created!";
	WebElement headingElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1"));
	String actualHeading = headingElement.getText();
	Assert.assertEquals(actualHeading, expectedHeading);
	
	WebElement actualCongratulationsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p"));
	 String actualCongratulationsText = actualCongratulationsElement.getText();
	 String expectedCongratulationsText = "Congratulations! Your new account has been successfully created!";
	Assert.assertEquals(actualCongratulationsText, expectedCongratulationsText);
	
	WebElement actualmemberprivilegeElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[2]"));
	 String actualmemberprivilegeText = actualmemberprivilegeElement.getText();
	 String expectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
	 Assert.assertTrue(actualmemberprivilegeText.contains(expectedmemberprivilegeText));
	 
	 WebElement actualQuestionsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[3]"));
	 String actualQuestionsText = actualQuestionsElement.getText();
	 String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
	 Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
	 
	 WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[4]"));
	 String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
	 String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
	 Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
	 
	 WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
	 Assert.assertTrue(contactUsLinkElement.isDisplayed());
	 
	 WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
	 continueButtonElement.click();
	    
	 String actualPageTitle = driver.getTitle();
	 String expectedPageTitle = "My Account";
	 Assert.assertEquals(actualPageTitle, expectedPageTitle);
	
    driver.quit();
	}
   
    @Test(priority=2)
     public void registerAccountWithAllFields() {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/");
    	
    	WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountDropMenu.click();
         
        WebElement registerOption = driver.findElement(By.linkText("Register"));
        registerOption.click();
        
        WebElement firstNameField = driver.findElement(By.id("input-firstname"));
        firstNameField.sendKeys("Satish");
        
        WebElement lastNameField = driver.findElement(By.id("input-lastname"));
        lastNameField.sendKeys("Kumar");
        
        Date date = new Date();
        WebElement eMailField = driver.findElement(By.id("input-email"));
        eMailField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
        
        WebElement telephoneField = driver.findElement(By.id("input-telephone"));
        telephoneField.sendKeys("1234567890");
        
        WebElement passwordField = driver.findElement(By.id("input-password"));
        passwordField.sendKeys("12345");
        
        WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
        passwordConfirmField.sendKeys("12345");
        
        WebElement yesRadioButtonElement = driver.findElement(By.xpath("//input[@name=\"newsletter\"][@value=\"1\"]"));
        yesRadioButtonElement.click();
        
        WebElement privacyPolicyField = driver.findElement(By.name("agree"));
        privacyPolicyField.click();
        
        WebElement continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
        continueButton.click();
        
        //checking whether the user successfully logged in or not
        myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountDropMenu.click();
        
        WebElement logoutOption = driver.findElement(By.linkText("Logout"));
        Assert.assertTrue(logoutOption.isDisplayed());
        
        String actualURL = driver.getCurrentUrl();
    	String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
    	Assert.assertEquals(actualURL, expectedURL);
    	
    	String expectedHeading = "Your Account Has Been Created!";
    	WebElement headingElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1"));
    	String actualHeading = headingElement.getText();
    	Assert.assertEquals(actualHeading, expectedHeading);
    	
    	WebElement actualCongratulationsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p"));
    	String actualCongratulationsText = actualCongratulationsElement.getText();
    	String expectedCongratulationsText = "Congratulations! Your new account has been successfully created!";
    	Assert.assertEquals(actualCongratulationsText, expectedCongratulationsText);
    	
    	WebElement actualmemberprivilegeElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[2]"));
    	String actualmemberprivilegeText = actualmemberprivilegeElement.getText();
    	String expectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
    	Assert.assertTrue(actualmemberprivilegeText.contains(expectedmemberprivilegeText));
    	 
    	WebElement actualQuestionsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[3]"));
    	String actualQuestionsText = actualQuestionsElement.getText();
    	String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
    	Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
    	 
    	WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[4]"));
    	String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
    	String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
    	Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
    	 
    	WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
    	Assert.assertTrue(contactUsLinkElement.isDisplayed());
    	 
    	WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
    	continueButtonElement.click();
    	    
    	String actualPageTitle = driver.getTitle();
    	String expectedPageTitle = "My Account";
    	Assert.assertEquals(actualPageTitle, expectedPageTitle);
    	
        driver.quit();
        
        
	
}
	 @Test(priority=3)
	 
     public void registerWithoutProvidingAnyFields() {
    	WebDriver driver = new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.get("https://tutorialsninja.com/demo/");
     	
     	WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountDropMenu.click();
          
        WebElement registerOption = driver.findElement(By.linkText("Register"));
        registerOption.click(); 
        
        WebElement continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
        continueButton.click();
        
         String actualFirstNameWarningMessage = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
         String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";
         Assert.assertEquals(actualFirstNameWarningMessage, expectedFirstNameWarningMessage);
         
         String actualLastNameWarningMessage = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
         String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";
         Assert.assertEquals(actualLastNameWarningMessage, expectedLastNameWarningMessage);
         
         String actualEmailWarningMessage = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
         String expectedEmailWarningMessage = "E-Mail Address does not appear to be valid!";
         Assert.assertEquals(actualEmailWarningMessage, expectedEmailWarningMessage);
         
         String actualPhoneWarningMessage = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
         String expectedPhoneWarningMessage = "Telephone must be between 3 and 32 characters!";
         Assert.assertEquals(actualPhoneWarningMessage, expectedPhoneWarningMessage);
         
         String actualPasswordWarningMessage = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
         String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";
         Assert.assertEquals(actualPasswordWarningMessage, expectedPasswordWarningMessage);
         
         String actualPrivacyPolicyMessage = driver.findElement(By.xpath("//div[@id=\"account-register\"]/div[1]")).getText();
         String expectedPrivacyPolicyMessage = "Warning: You must agree to the Privacy Policy!";
         Assert.assertTrue(actualPrivacyPolicyMessage.contains(expectedPrivacyPolicyMessage));
         
         driver.quit();
     }
	 @Test(priority=4)
	 public void registerAccountBySelectingYesNewsLetterOption() {
		    WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get("https://tutorialsninja.com/demo/");
	    	
	    	WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
	        myAccountDropMenu.click();
	         
	        WebElement registerOption = driver.findElement(By.linkText("Register"));
	        registerOption.click();
	        
	        WebElement firstNameField = driver.findElement(By.id("input-firstname"));
	        firstNameField.sendKeys("Satish");
	        
	        WebElement lastNameField = driver.findElement(By.id("input-lastname"));
	        lastNameField.sendKeys("Kumar");
	        
	        Date date = new Date();
	        WebElement eMailField = driver.findElement(By.id("input-email"));
	        eMailField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
	        
	        WebElement telephoneField = driver.findElement(By.id("input-telephone"));
	        telephoneField.sendKeys("1234567890");
	        
	        WebElement passwordField = driver.findElement(By.id("input-password"));
	        passwordField.sendKeys("12345");
	        
	        WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
	        passwordConfirmField.sendKeys("12345");
	        
	        WebElement yesRadioButtonElement = driver.findElement(By.xpath("//input[@name=\"newsletter\"][@value=\"1\"]"));
	        yesRadioButtonElement.click();
	        
	        WebElement privacyPolicyField = driver.findElement(By.name("agree"));
	        privacyPolicyField.click();
	        
	        WebElement continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
	        continueButton.click();
	        
	        //checking whether the user successfully logged in or not
	        myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
	        myAccountDropMenu.click();
	        
	        WebElement logoutOption = driver.findElement(By.linkText("Logout"));
	        Assert.assertTrue(logoutOption.isDisplayed());
	        
	        String actualURL = driver.getCurrentUrl();
	    	String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
	    	Assert.assertEquals(actualURL, expectedURL);
	    	
	    	String expectedHeading = "Your Account Has Been Created!";
	    	WebElement headingElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1"));
	    	String actualHeading = headingElement.getText();
	    	Assert.assertEquals(actualHeading, expectedHeading);
	    	
	    	WebElement actualCongratulationsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p"));
	    	String actualCongratulationsText = actualCongratulationsElement.getText();
	    	String expectedCongratulationsText = "Congratulations! Your new account has been successfully created!";
	    	Assert.assertEquals(actualCongratulationsText, expectedCongratulationsText);
	    	
	    	WebElement actualmemberprivilegeElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[2]"));
	    	String actualmemberprivilegeText = actualmemberprivilegeElement.getText();
	    	String expectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
	    	Assert.assertTrue(actualmemberprivilegeText.contains(expectedmemberprivilegeText));
	    	 
	    	WebElement actualQuestionsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[3]"));
	    	String actualQuestionsText = actualQuestionsElement.getText();
	    	String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
	    	Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
	    	 
	    	WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[4]"));
	    	String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
	    	String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
	    	Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
	    	 
	    	WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
	    	Assert.assertTrue(contactUsLinkElement.isDisplayed());
	    	 
	    	WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
	    	continueButtonElement.click();
	    	    
	    	String actualPageTitle = driver.getTitle();
	    	String expectedPageTitle = "My Account";
	    	Assert.assertEquals(actualPageTitle, expectedPageTitle);
	    	
	    	WebElement subscribeUnsubscribeNewsLetterOption = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
	    	subscribeUnsubscribeNewsLetterOption.click();
	    	
	    	boolean YesRadioButtonState = driver.findElement(By.xpath("//input[@name='newsletter'][@value ='1']")).isSelected();
	    	Assert.assertTrue(YesRadioButtonState);
	        driver.quit();
	 }

	@Test(priority=5)
	
	 public void registerAccountBySelectingNoNewsLetterOption() {
		    WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get("https://tutorialsninja.com/demo/");
	    	
	    	WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
	        myAccountDropMenu.click();
	         
	        WebElement registerOption = driver.findElement(By.linkText("Register"));
	        registerOption.click();
	        
	        WebElement firstNameField = driver.findElement(By.id("input-firstname"));
	        firstNameField.sendKeys("Satish");
	        
	        WebElement lastNameField = driver.findElement(By.id("input-lastname"));
	        lastNameField.sendKeys("Kumar");
	        
	        Date date = new Date();
	        WebElement eMailField = driver.findElement(By.id("input-email"));
	        eMailField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
	        
	        WebElement telephoneField = driver.findElement(By.id("input-telephone"));
	        telephoneField.sendKeys("1234567890");
	        
	        WebElement passwordField = driver.findElement(By.id("input-password"));
	        passwordField.sendKeys("12345");
	        
	        WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
	        passwordConfirmField.sendKeys("12345");
	        
	        WebElement yesRadioButtonElement = driver.findElement(By.xpath("//input[@name=\"newsletter\"][@value=\"0\"]"));
	        yesRadioButtonElement.click();
	        
	        WebElement privacyPolicyField = driver.findElement(By.name("agree"));
	        privacyPolicyField.click();
	        
	        WebElement continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
	        continueButton.click();
	        
	        //checking whether the user successfully logged in or not
	        myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
	        myAccountDropMenu.click();
	        
	        WebElement logoutOption = driver.findElement(By.linkText("Logout"));
	        Assert.assertTrue(logoutOption.isDisplayed());
	        
	        String actualURL = driver.getCurrentUrl();
	    	String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
	    	Assert.assertEquals(actualURL, expectedURL);
	    	
	    	String expectedHeading = "Your Account Has Been Created!";
	    	WebElement headingElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1"));
	    	String actualHeading = headingElement.getText();
	    	Assert.assertEquals(actualHeading, expectedHeading);
	    	
	    	WebElement actualCongratulationsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p"));
	    	String actualCongratulationsText = actualCongratulationsElement.getText();
	    	String expectedCongratulationsText = "Congratulations! Your new account has been successfully created!";
	    	Assert.assertEquals(actualCongratulationsText, expectedCongratulationsText);
	    	
	    	WebElement actualmemberprivilegeElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[2]"));
	    	String actualmemberprivilegeText = actualmemberprivilegeElement.getText();
	    	String expectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
	    	Assert.assertTrue(actualmemberprivilegeText.contains(expectedmemberprivilegeText));
	    	 
	    	WebElement actualQuestionsElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[3]"));
	    	String actualQuestionsText = actualQuestionsElement.getText();
	    	String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
	    	Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
	    	 
	    	WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id=\"content\"]/h1/following-sibling::p[4]"));
	    	String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
	    	String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
	    	Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
	    	 
	    	WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
	    	Assert.assertTrue(contactUsLinkElement.isDisplayed());
	    	 
	    	WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
	    	continueButtonElement.click();
	    	    
	    	String actualPageTitle = driver.getTitle();
	    	String expectedPageTitle = "My Account";
	    	Assert.assertEquals(actualPageTitle, expectedPageTitle);
	    	
	    	WebElement subscribeUnsubscribeNewsLetterOption = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
	    	subscribeUnsubscribeNewsLetterOption.click();
	    	
	    	boolean noRadioButtonState = driver.findElement(By.xpath("//input[@name='newsletter'][@value ='0']")).isSelected();
	    	Assert.assertTrue(noRadioButtonState);
	        driver.quit();
	 }
	
	@Test(priority=6)
	 public void registerAccountPageNavigations() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		String expectedTitle = "Register Account";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		WebElement loginOption = driver.findElement(By.linkText("Login"));
		loginOption.click();
		WebElement continueButton = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButton.click();
		String actualResult = driver.getTitle();
		String expectedResult = "Register Account";
		Assert.assertEquals(actualResult, expectedResult);
		
		myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		loginOption = driver.findElement(By.linkText("Login"));
		loginOption.click();
		Thread.sleep(5000);
		WebElement registerOptionButton = driver.findElement(By.xpath("//div[@class=\"list-group\"]/a[text()='Register']"));
		registerOptionButton.click();
		Thread.sleep(5000);
		actualResult = driver.getTitle();
		expectedResult = "Register Account";
		Assert.assertEquals(actualResult, expectedResult);
		driver.quit();
	}
	
	@Test(priority=7)
	 public void registerAccountByProvidingMismatchingPasswords() throws InterruptedException {
   	 WebDriver driver = new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("https://tutorialsninja.com/demo/");
   	 WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
   	 myAccount.click();
   	 WebElement registerOption = driver.findElement(By.linkText("Register"));
   	 registerOption.click();
   	 driver.findElement(By.id("input-firstname")).sendKeys("Arun");
   	 driver.findElement(By.id("input-lastname")).sendKeys("Mooturi");
   	 driver.findElement(By.id("input-email")).sendKeys("Arun@gmail.com");
   	 driver.findElement(By.id("input-telephone")).sendKeys("9701099428");
   	 driver.findElement(By.id("input-password")).sendKeys("12345");
   	 driver.findElement(By.id("input-confirm")).sendKeys("123456");
   	 driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
   	 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
   	 String actualWarningMessage = driver.findElement(By.xpath("//input[@type=\"password\"]/following-sibling::div")).getText();
   	 String expectedWarningMessage = "Password confirmation does not match password!";
   	 Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
   	 Thread.sleep(5000);
   	 driver.quit();
    }
	@Test(priority=8)
	public void registerDuplicateAccountWithSameEmail() {
		 WebDriver driver = new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.get("https://tutorialsninja.com/demo/");
	   	 WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
	   	 myAccount.click();
	   	 WebElement registerOption = driver.findElement(By.linkText("Register"));
	   	 registerOption.click();
	   	 driver.findElement(By.id("input-firstname")).sendKeys("Arun");
	   	 driver.findElement(By.id("input-lastname")).sendKeys("Mooturi");
	   	 driver.findElement(By.id("input-email")).sendKeys("Arun@gmail.com");
	   	driver.findElement(By.id("input-password")).sendKeys("12345");
	   	 driver.findElement(By.id("input-confirm")).sendKeys("123456");
	   	 driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
	   	 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	   	 String expectedWarningMessage ="Warning: E-Mail Address is already registered!";
	   	 String actualWarningMessage = driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
	   	 Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
	}
 } 

     
