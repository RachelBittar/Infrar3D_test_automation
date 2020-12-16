/*
*
* Automation test for George Brown - Deaf Learn Now
* Register Now
*
* Version: Initial Draft
* Purpose: User registration to Deaf Learn now
* Input :
    [First Name]
    [Last Name]
    [Birthday]
    [Address]
    [Email]
    [Username]
    [Create Password]
    [Password confirm]
    [Are you deaf or hard of hearing?]
    [Would you like to see a counsellor?]

* Output:

*
* Done by: Rachel Beraldo Bittar
* Date:
*
* */



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class RegistrationPage extends ConfirmationPage {

    public static void submitForm(WebDriver driver) throws InterruptedException {


        Long ts = System.currentTimeMillis();

        driver.findElement(By.id("firstname")).sendKeys("FistName");
        driver.findElement(By.id("lastname")).sendKeys("LastName");

        driver.findElement(By.id("date")).sendKeys("20140-05-10");
        driver.findElement(By.id("date")).sendKeys(Keys.RETURN);

        driver.findElement(By.id("address")).sendKeys("123 abc street");

        driver.findElement(By.id("email")).sendKeys("test" +ts+ "@test.com");
        driver.findElement(By.id("username")).sendKeys("username"+ts);

        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("passwordconfirm")).sendKeys("123456");

        driver.findElement(By.name("hearing")).click();
        driver.findElement(By.name("counsellor")).click();

        //Thread.sleep(1000000000);
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
    }
}
