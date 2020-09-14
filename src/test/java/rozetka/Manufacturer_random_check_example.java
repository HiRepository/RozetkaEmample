package test.java.rozetka;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import test.java.pages.HomePage;
import test.java.pages.SearchResultPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

@Epic("Random Manufacture")
@Feature("Checkbox Work")

public class Manufacturer_random_check_example extends Properties {


    HomePage homePage;
    SearchResultPage searchResultPage;
    String[] manufacture = {"Acer", "Apple"};
    int randomValue = (int)(Math.random() * manufacture.length);




    @BeforeMethod
    public void pageFactory(){
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Description("Random checkbox iteration")
    @Test
    public void randomManufacturer(){
        homePage.open();
        searchResultPage.searchDevicePageEndDownload();
        homePage.clickFilter(manufacture[randomValue]);
        searchResultPage.searchDevicePageEndDownload();

        List<WebElement> getElText = driver.findElements(elValue);

        for (WebElement webElement : getElText) {
            String name = webElement.getText();
            String resultCheckboxValue = Integer.toString(randomValue);

            assertTrue(name.contains(resultCheckboxValue));
        }

    }
}
