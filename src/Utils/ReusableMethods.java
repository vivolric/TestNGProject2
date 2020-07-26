package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class ReusableMethods extends BaseDriver{

    public static void randomDropDown(WebElement randomState){

        Select s1 = new Select(randomState);
        List<WebElement> choices = s1.getOptions();
        Random rand = new Random();
        int allChoices = rand.nextInt(choices.size());
        s1.selectByIndex(allChoices);

    }
}