import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainTets {
    public static void main(String[] args) {
        // Establecer la propiedad del sistema para indicar la ubicación del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");

        // Crear una instancia del navegador Chrome
        WebDriver driver = new ChromeDriver();

        // Navegar a la página de Google
        driver.get("https://www.google.com");

        // Imprimir el título de la página
        System.out.println("El título de la página es: " + driver.getTitle());

        // Cerrar el navegador
        driver.quit();
    }
}