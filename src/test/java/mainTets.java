import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mainTets {
    private static WebDriver driver;
    @BeforeTest
    public static void setUp() {
        // Establecer la propiedad del sistema para indicar la ubicación del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");

        // Crear una instancia del navegador Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navegar a la página de Google
        driver.get("https://www.google.com");
    }
    @Test
    public static void init() {
        // Imprimir el título de la página
        System.out.println("El título de la página es: " + driver.getTitle());
    }
    @AfterTest
    public static  void tearDown(){
        // Cerrar el navegador
        driver.quit();
    }
}