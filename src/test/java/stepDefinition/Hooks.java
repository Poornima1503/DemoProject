package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigFileReader;
import utilities.Log;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void beforeScenario(Scenario scenario) {
        ConfigFileReader cfr = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
        driver = new ChromeDriver();
        Log.startTestCase(scenario.getName()+scenario.getId());
    }

    @After
    public void afterScenario(Scenario scenario) {
        new CapScreenSht().capScrSht(driver,scenario.getName()+scenario.getId());


       // driver.quit();
      Log.endTestCase(scenario.getName()+scenario.getId());
    }
}



