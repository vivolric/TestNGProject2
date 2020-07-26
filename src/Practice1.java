import Utils.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class Practice1 extends BaseDriver {

    @Test
    public void test1(){
        POM_Elements elements = new POM_Elements(driver);

        elements.signIn.click();

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        elements.email.sendKeys("group2@gmail.com");
        elements.password.sendKeys("group2");

        elements.signInButton.click();

        elements.myAddressesButton.click();

        elements.addNewAddressButton.click();

        elements.firstName.clear();
        elements.firstName.sendKeys("Group");

        elements.lastName.clear();
        elements.lastName.sendKeys("Two");

        elements.address.sendKeys("123 ABC Lane");

        elements.city.sendKeys("Pittsburgh");

        ReusableMethods.randomDropDown(elements.randomState);

        elements.zipCode.sendKeys("15220");

        elements.homePhone.sendKeys("201-000-0000");

        elements.saveButton.click();

        WebElement verifyAddress = driver.findElement(By.cssSelector("span[class='address_address1']"));
        String ourAddress = verifyAddress.getText();
        Assert.assertEquals(ourAddress,"123 ABC Lane");

        elements.updateButton.click();

        elements.firstName.clear();
        elements.firstName.sendKeys("New Group");

        elements.lastName.clear();
        elements.lastName.sendKeys("New Two");

        elements.saveButton.click();

        WebElement verifyNewFName = driver.findElement(By.xpath("(//span[@class='address_name'])[1]"));
        Assert.assertEquals(verifyNewFName.getText(),"New Group");

        WebElement verifyNewLName = driver.findElement(By.xpath("(//span[@class='address_name'])[2]"));
        Assert.assertEquals(verifyNewLName.getText(),"New Two");

        elements.deleteButton.click();

        driver.switchTo().alert().accept();

        Assert.assertTrue(elements.noAddressMsg.getText().contains("No addresses"));

        // WebDriverWait wait = new WebDriverWait(driver,5);

    }
}

    /*
    NOTE: All TestNG practices should be in the same project and in the different class

    Everybody in the team should create their own account.

    Everybody in the team should upload the project individually.

    And everyone in the team should push the code to github as well.

    One member in the team should send the project to sena or ali but everyone push the code to github.

    After finishing the project create testNG.xml file and in this file run the TestNG Practices 1
    and TestNG Practices 2 run the project as parallel and in the chrome and in the firefox.
    Use the Thread.sleep as less as you can. Use a explicit wait.

    DO NOT DO THIS PROJECT IN THE MAIN METHOD PROJECT SHOULD BE IN THE TESTNG.

    Use a page object model concept. Create a baseDriver class and
    login functionality should be done in this class.

    Use a page object model concept while working on the project.

    Navigate to:  http://automationpractice.com/index.php

    Click on sign in button

    Click on the my addresses

    Click on the add a new address

    Enter all the fields (Choose random items from the dropdown)

    Click on save button

    Verify your address is displayed in the website

    Click on the update button

    Change the first name and last name

    Click on the save button

    Verify first name and last name is updated

    Click on the delete button

    Click on the okay

    Verify address is removed from the website
     */
