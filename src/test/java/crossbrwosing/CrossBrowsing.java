package crossbrwosing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsing {

    public static void main(String[] args) {

// open browser in Edge browser
        EdgeDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String title=driver.getTitle();
        System.out.println(title);
        System.out.println("test passed");

        driver.quit();


    }
}
