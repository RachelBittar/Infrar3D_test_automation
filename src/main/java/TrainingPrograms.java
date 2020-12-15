import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrainingPrograms {

    public static void submitPrograms(WebDriver driver) throws InterruptedException {

        driver.findElement(By.cssSelector("/html/body/main/div/div[1]/section/div/a")).click();
    }


}
