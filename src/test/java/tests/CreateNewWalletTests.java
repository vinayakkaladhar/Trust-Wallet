package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateNewWalletPage;

public class CreateNewWalletTests extends BaseTest {
    CreateNewWalletPage createNewWalletPage;
    Boolean result;

    @Test(description = "verify user is able to create new wallet skipping backup option")
    public void createNewWalletUsingBackupSkipOption() throws InterruptedException {
        createNewWalletPage = new CreateNewWalletPage();
        createNewWalletPage.getStarted();
        createNewWalletPage.createNewWallet();
        createNewWalletPage.skipBackupSetUp();
        createNewWalletPage.setupPassCode();
        result = createNewWalletPage.verifyWelcomeBannerIsDisplayed();
        result = createNewWalletPage.verifyWalletCreationIsSuccessful();
        Assert.assertTrue(result,"Wallet Creation Is Successful");
    }
}