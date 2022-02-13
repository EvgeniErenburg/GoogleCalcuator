package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Calculator {

    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"N10B9\"]")
    public WebElement one;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"lVjWed\"]")
    public WebElement two;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"KN1kY\"]")
    public WebElement three;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"xAP7E\"]")
    public WebElement four;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"Ax5wH\"]")
    public WebElement five;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"abcgof\"]")
    public WebElement six;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"bkEvMb\"]")
    public WebElement zero;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"j93WEe\"]")
    public WebElement leftsc;
    @FindBy (css = "div [class=\"PaQdxb A2W7l\"] [jsname=\"qCp9A\"]")
    public WebElement rightsc;
    @FindBy (css = "div [class=\"PaQdxb mF5fo\"] [jsname=\"XSr6wc\"]")
    public WebElement plus;
    @FindBy (css = "div [class=\"PaQdxb mF5fo\"] [jsname=\"pPHzQc\"]")
    public WebElement minus;
    @FindBy (css = "div [class=\"PaQdxb mF5fo\"] [jsname=\"YovRWb\"]")
    public WebElement multiplication;
    @FindBy (css = "div [class=\"PaQdxb mF5fo\"] [jsname=\"WxTTNd\"]")
    public WebElement division;
    @FindBy (css = "div [class=\"PaQdxb mF5fo\"] [jsname=\"Pt8tGc\"]")
    public WebElement equals;

    public Calculator(WebDriver driver) {;
    }
}
