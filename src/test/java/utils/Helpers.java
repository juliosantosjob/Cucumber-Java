package utils;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Helpers extends DriverFactory {

    public static void clickText(String element) {
        driver.findElement(By.xpath("//*[text()='" + element + "']")).click();
    }

    public static void waitForText(String fldText, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='" + fldText + "']")));
    }
}
