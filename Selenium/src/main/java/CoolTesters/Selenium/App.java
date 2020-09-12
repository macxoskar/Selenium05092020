package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //tomando el el Path del sistema
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
        //establecer la propiedad del .exe
        System.setProperty("webdriver.chrome.driver", exePath + "Chromedriver.exe");
        //iniciar el driver
        WebDriver driver = new ChromeDriver ();
        //iniciar navegador y dirigirse a una pagina
        driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
        
        
    }
}
