package stepDefinition;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


    import java.io.File;
import java.io.IOException;

    public class CapScreenSht {
        public void capScrSht(WebDriver driver, String screenShotName) {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File abc = ts.getScreenshotAs(OutputType.FILE);

            try {

                FileUtils.copyFile(abc, new File("./Src/test/Screenshots/" + screenShotName + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


