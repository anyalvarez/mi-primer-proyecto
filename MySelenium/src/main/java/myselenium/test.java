package myselenium;

import java.io.File;
import java.nio.file.Paths;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;




public class test {

	public static void main (String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;	// Traer el path del proyecto y el separator es el '/' y con esto seteamos el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); 	// Identificando el ejecutable para el driver
		WebDriver driver = new ChromeDriver();	//Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("http://www.google.com/");
	}
}
