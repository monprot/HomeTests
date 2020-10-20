package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSettings2 {
    WebDriver driver;
    protected String ggrUrl = "http://localhost:4445";

    @BeforeTest
    public void beforeTest() {
        ChromeOptions options = new ChromeOptions();

        DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.setCapability(ChromeOptions.CAPABILITY, options);

        URL hub = null;
        try {
            hub = new URL(ggrUrl + "/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new RemoteWebDriver(hub, dc);
        getDriver().get("https://mail.yandex.ru/");//открываем яндекс
        getDriver().manage().window().maximize();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

}
