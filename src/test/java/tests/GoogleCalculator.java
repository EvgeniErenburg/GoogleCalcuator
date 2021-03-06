package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeOptions;
import page.CalcGooglePage;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GoogleCalculator {

    private static WebDriver driver;
    private static CalcGooglePage CalcGooglePage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        CalcGooglePage = new CalcGooglePage(driver);

    }

    @BeforeEach
    public void setup() {

        driver.get("https://www.google.ru/");
    }

    @Test
    @DisplayName("Кейс 1. Проверка операций с целыми числами")
    public void test1() {
        CalcGooglePage.search("Калькулятор");
        CalcGooglePage.openBracket.click();
        CalcGooglePage.one.click();
        CalcGooglePage.plus.click();
        CalcGooglePage.two.click();
        CalcGooglePage.closingBracket.click();
        CalcGooglePage.multiply.click();
        CalcGooglePage.three.click();
        CalcGooglePage.minus.click();
        CalcGooglePage.four.click();
        CalcGooglePage.zero.click();
        CalcGooglePage.division.click();
        CalcGooglePage.five.click();
        CalcGooglePage.equally.click();

        assertAll(
                () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.cssSelector("div [jsname=\"VkJw6\"] span")).getText()),
                () -> assertEquals("1", driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] span")).getText())
        );


    }

    @Test
    @DisplayName("Кейс 2. Проверка деления на ноль")
    public void test2() {
        CalcGooglePage.search("Калькулятор");
        CalcGooglePage.six.click();
        CalcGooglePage.division.click();
        CalcGooglePage.zero.click();
        CalcGooglePage.equally.click();
        assertAll(
                () -> assertEquals("6 ÷ 0 =", driver.findElement(By.cssSelector("div [jsname=\"VkJw6\"] span")).getText()),
                () -> assertEquals("Infinity", driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] span")).getText())
        );


    }

    @Test
    @DisplayName("Кейс 3. Проверка ошибки при отсутствии значения")
    public void test3() {
        CalcGooglePage.search("Калькулятор");
        CalcGooglePage.sin.click();
        CalcGooglePage.equally.click();
        assertAll(
                () -> assertEquals("sin() =", driver.findElement(By.cssSelector("div [jsname=\"VkJw6\"] span")).getText()),
                () -> assertEquals("Error", driver.findElement(By.cssSelector("div [jsname=\"zLiRgc\"] span")).getText())
        );


    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }

}
