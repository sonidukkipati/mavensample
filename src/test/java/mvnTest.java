import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mvnTest {
    public static void main(String[] args){
        System.out.println("Hi");
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.google.com/");
        System.out.println("Trying to open the browser");
        dr.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Ken Trump");
        dr.findElement(By.xpath("//input[@name='btnK']")).click();
    }
}
