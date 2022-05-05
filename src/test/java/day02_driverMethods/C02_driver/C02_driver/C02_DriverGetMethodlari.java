package day02_driverMethods.C02_driver.C02_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
         WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

    }
}
