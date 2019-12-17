package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverClass
{
    public String BASE_URL = "https://www.zoopla.co.uk";
    private Select select;

    public void launchUrl()
    {
        driver.navigate().to(BASE_URL);
    }
    public void selectByText(WebElement element, String text)
    {
     select = new Select(element);
     select.selectByVisibleText(text);
    }

    public void selectByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }
    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);

    }
}
