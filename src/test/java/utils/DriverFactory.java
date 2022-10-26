package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class DriverFactory {
    protected static WebDriver driver;
    String Browser = System.getProperty("Browser");

    public void setDriver() {
        switch (Browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "chrome-headless":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "firefox-headless":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions optionsFox = new FirefoxOptions();
                optionsFox.setHeadless(true);
                driver = new FirefoxDriver(optionsFox);
                break;
            default:
                System.out.println("Non-existent browser");
        }
        String BaseUrl = "https://www.estrelalojas.com.br";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(BaseUrl);
    }

    public void closeDriver() {
        driver.quit();
    }
}
