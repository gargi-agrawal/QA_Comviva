package test.java.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Scorecard {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-1st-test-1387603/full-scorecard");

        WebElement table = driver.findElement(By.className(("ci-scorecard-table")));
        WebElement tbody = table.findElement(By.tagName("tbody"));
        List<WebElement> rows = tbody.findElements(By.tagName("tr"));

        int totalRows = rows.size();

        for(int i = 0; i < totalRows; i += 2) {
            WebElement cRow = rows.get(i);
            System.out.println(cRow.getText());
        }
    }
}
