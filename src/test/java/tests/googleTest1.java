package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Calculator;
import pages.SearchPage;

public class googleTest1 {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static Calculator calculator;

    @BeforeAll
    public static void init (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        calculator = new Calculator(driver);
    }

    @Test
    public void test1(){
        driver.get("http://google.com");
        searchPage.search("калькулятор");
        calculator.leftsc.click();
        calculator.one.click();
        calculator.plus.click();
        calculator.two.click();
        calculator.rightsc.click();
        calculator.multiplication.click();
        calculator.three.click();
        calculator.minus.click();
        calculator.four.click();
        calculator.zero.click();
        calculator.division.click();
        calculator.five.click();
        calculator.equals.click();
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }

}
