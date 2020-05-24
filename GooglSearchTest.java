import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class GooglSearchTest {


    /*
        1.Open the google.com web page
        2.In search query type string and submit the search
        3.Verify that result page is showing up
        4.Verify that amount of results is more than 100
     */



    @Test
    public void test0001() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String queryString = "programming";
        System.out.println("Opening google page");

        driver.get("https://www.google.com/");
        WebElement textInput = driver.findElement(By.cssSelector(".gLFyf"));

        textInput.sendKeys(queryString);
        textInput.submit();

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = numberStatGenerator(driver);

        Assert.assertTrue(100 < result);
        driver.close();     //close browser
    }

        public int numberStatGenerator(WebDriver driver) {

            WebElement resultsNumber = driver.findElement(By.id("result-stats"));

            String resultsStatsTextValue = resultsNumber.getText();

            String[] stringsArray = resultsStatsTextValue.split(" ");

            String amountOfResults = stringsArray[1].replace(",", "");

            return Integer.parseInt(amountOfResults);
            //the end1


        }






    }

