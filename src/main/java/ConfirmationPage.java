import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
*
* Automation test for George Brown - Deaf Learn Now
* Register Now
*
* Version: Initial Draft
* Purpose: User registration to Deaf Learn now
* Input :
* Output:

*
* Done by: Rachel Beraldo Bittar
* Date:
*
* */

public class ConfirmationPage {

    public static void waitForAlertBanner(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    }

    public static String getAlertBannerText(WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();
    }
}
