package Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class JenkinsScript {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hi");
        // WebDriver dr = new FirefoxDriver();
        //Adding some syste,setproperty
        //File file=new File("C:\\Program Files\\Drivers");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sc\\Downloads\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.google.com/");
        // dr.navigate().to("https://www.google.com");
        System.out.println("Trying to open the browser");
        Thread.sleep(3000);
        dr.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Ken Trump");
        Thread.sleep(3000);
        dr.findElement(By.xpath("//input[@value='Google Search']")).click();
    }
}
