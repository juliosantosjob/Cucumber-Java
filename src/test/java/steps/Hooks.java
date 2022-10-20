package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.*;
import utils.DriverFactory;

public class Hooks extends DriverFactory {

    @Before
    public void setup() {
        System.out.println("Start...");
        setDriver();
    }

    @AfterStep
    public void shots(Scenario scenario) throws InterruptedException {
        Thread.sleep(600);
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
    }

    @After
    public void teardown() {
        System.out.println("Close");
        closeDriver();
    }
}
