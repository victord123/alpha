package co.uk.zoopla.co.uk.zoopla.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSaleSearchSteps {
    WebDriver driver;
    WebElement searchField;
    @Given("I navigate to zoopla homepage")
    public void i_navigate_to_zoopla_homepage() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.navigate().to("https://www.zoopla.co.uk/");

    }

    @When("I enter a {string} in the search text box")
    public void i_enter_a_in_the_search_text_box(String string) {
        searchField = driver.findElement(By.id("search-input-location"));
        searchField.sendKeys(string);

    }

    @When("I select {string} from Min price dropdown")
    public void i_select_from_Min_price_dropdown(String string) {

    }

    @When("I select {string} from Max price dropdown")
    public void i_select_from_Max_price_dropdown(String string) {

    }

    @When("I select {string} from property type dropdown")
    public void i_select_from_property_type_dropdown(String string) {

    }

    @When("I select {string} from bedrooms dropdown")
    public void i_select_from_bedrooms_dropdown(String string) {

    }

    @When("I click on Search button")
    public void i_click_on_Search_button() {

    }

    @Then("a list of {string} in {string} are displayed")
    public void a_list_of_in_are_displayed(String string, String string2) {

    }

    @Then("an error message is displayed")
    public void an_error_message_is_displayed() {

    }
}
