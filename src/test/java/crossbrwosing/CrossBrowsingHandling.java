package crossbrwosing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class CrossBrowsingHandling {

    public static void main(String[] args) {

        //  Find a way to ask user where to run >how to run/test the app in different browser one by one


       Scanner scanner = new Scanner(System.in);
       System.out.println("ch0ose browser chrome, firefox and edge");
       String browserType= scanner.next();
       WebDriver driver;



        if (browserType.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equals("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserType.equals("edge")) {
            driver = new EdgeDriver();


        } else {
            throw new RuntimeException("wrong driver");

        }
      driver.get( "https://google.com");


    }

}



