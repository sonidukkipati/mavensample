import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class FirstMvnScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver cd = new ChromeDriver();
        cd.get("C:\\Users\\sc\\Downloads\\Elements.html");
        Select sDList = new Select(cd.findElement(By.name("dpdownsingle")));
        List<WebElement> optionList = sDList.getOptions();

        for(WebElement w: optionList){
            System.out.println("Options:"  + w.getText());

        }

        sDList.selectByVisibleText("Audi");
        System.out.println("Is Multiple or not:"  + sDList.isMultiple());

        Select multiSelect = new Select(cd.findElement(By.name("dpdwn")));
        System.out.println("Is Multiple select or not: " + multiSelect.isMultiple());

        multiSelect.selectByVisibleText("Opel");

        Thread.sleep(3000);

        multiSelect.selectByValue("volvo");

        Thread.sleep(2000);

        multiSelect.deselectAll();

        multiSelect.deselectByVisibleText("Opel");

        Thread.sleep(2000);

        multiSelect.selectByIndex(0);
        multiSelect.selectByIndex(3);
        Thread.sleep(2000);

        List<WebElement> selected = multiSelect.getAllSelectedOptions();

        for(WebElement w: selected){
            System.out.println("Option selected: " + w.getText());
        }
        WebElement radio1 = cd.findElement(By.xpath("//input[@value='female']"));
        radio1.click();
        Thread.sleep(1000);
        WebElement radio2 = cd.findElement(By.xpath("//input[@id='female']"));
        radio2.click();
        WebElement lastnemechange = cd.findElement(By.xpath("//input[@name='lastname']"));
        lastnemechange.clear();
        lastnemechange.sendKeys("Minni");
        cd.close();
    }
}



