import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainTets {
    private static WebDriver driver;
    @BeforeAll
    public static void setUp() {
        // Establecer la propiedad del sistema para indicar la ubicación del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");

        // Crear una instancia del navegador Chrome
        WebDriver driver = new ChromeDriver();

        // Navegar a la página de Google
        driver.get("https://www.google.com");
    }
    @Test
    public static void init() {
        // Imprimir el título de la página
        System.out.println("El título de la página es: " + driver.getTitle());
    }
    @AfterAll
    public static  void tearDown(){
        // Cerrar el navegador
        driver.quit();
    }
}