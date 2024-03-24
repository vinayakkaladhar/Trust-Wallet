package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class CreateNewWalletPage {
  DriverUtils utils = new DriverUtils();
  public AppiumDriver driver;
  public CreateNewWalletPage() {
    this.driver = DriverUtils.getDriver();
    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
  }
  @AndroidFindBy(xpath="//android.widget.TextView[@text='Get Started']")
  private WebElement getStarted;

  @AndroidFindBy(xpath="//android.widget.TextView[@text='Create new wallet']")
  private WebElement createNewWallet;

  @AndroidFindBy(xpath="//android.widget.TextView[@text='SKIP']")
  private WebElement skipBackUpSetup;

  @AndroidFindBy(xpath="//android.widget.TextView[@text='Those passwords didn’t match!']")
  private WebElement passcodeError;
  @AndroidFindBy(xpath="//android.widget.TextView[@text='1']")
  private WebElement setUpPassCodeWith1;

  @AndroidFindBy(xpath="//android.widget.TextView[@text='2']")
  private WebElement setUpPassCodeWith2;
  @AndroidFindBy(xpath="//android.widget.TextView[@text='Start using Trust Wallet']")
  private WebElement welcomeBanner;
  @AndroidFindBy(xpath="//android.widget.Button[@text='Allow']")
  private WebElement allowNotification;

  @AndroidFindBy(xpath="//android.widget.TextView[@text='Main Wallet 1']")
  private WebElement wallet;
  public void getStarted(){
    utils.waitForWebElement(getStarted);
    getStarted.click();
  }

  public void createNewWallet(){
    createNewWallet.click();
  }
  public void skipBackupSetUp(){
    skipBackUpSetup.click();
  }
  public boolean verifyPasscodeMismatchError() throws InterruptedException {
    for(int i=0;i<6;i++){
      setUpPassCodeWith1.click();
    }
    Thread.sleep(2000);
    for(int i=0;i<6;i++){
      setUpPassCodeWith2.click();
    }
    return passcodeError.isDisplayed();
  }
  public void setupPassCode() throws InterruptedException {
    for(int i=0;i<6;i++){
      setUpPassCodeWith1.click();
    }
    Thread.sleep(2000);
    for(int i=0;i<6;i++){
      setUpPassCodeWith1.click();
    }
  }
  public boolean verifyWelcomeBannerIsDisplayed(){
    utils.waitForWebElement(welcomeBanner);
    boolean result = welcomeBanner.isDisplayed();
    welcomeBanner.click();
    utils.waitForWebElement(allowNotification);
    allowNotification.click();
    return result;
  }

  public boolean verifyWalletCreationIsSuccessful(){
    return wallet.isDisplayed();
  }
}

