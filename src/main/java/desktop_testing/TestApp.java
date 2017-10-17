package desktop_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class TestApp {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files\\Notepad++\\Notepad++.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);

        //Notepad++
        driver.findElement(By.className("ToolbarWindow32")).click();
        Thread.sleep(5000);

        driver.findElement(By.className("Scintilla")).clear();
        driver.findElement(By.className("Scintilla")).sendKeys("122333");
        String output = driver.findElement(By.className("Scintilla")).getAttribute("Name");
        driver.findElement(By.className("ToolbarWindow32")).findElement(By.name("Save")).click();
        System.out.println(output);



        //Calculator
       /* driver.findElement(By.name("One")).click();

        driver.findElement(By.name("Plus")).click();

        driver.findElement(By.name("Nine")).click();
        driver.findElement(By.name("Nine")).click();
        driver.findElement(By.name("Nine")).click();
        driver.findElement(By.name("Equals")).click();
        String output = driver.findElement(By.id("1968")).getAttribute("Name");
        System.out.println(output); */


    }
}
