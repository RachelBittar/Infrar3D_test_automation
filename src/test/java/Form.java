import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rachelbittar/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://tester.bigoals.net/HTML/DNL/register-now.html");

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        TrainingPrograms trainingPrograms = new TrainingPrograms();
        trainingPrograms.submitPrograms(driver);



        driver.quit();
    }
}
