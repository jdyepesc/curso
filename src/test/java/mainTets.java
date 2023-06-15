import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mainTets {
    private static WebDriver driver;
    private static By register=By.linkText("REGISTER");
    private static By email=By.name("email");
    private static By password=By.name("password");
    private static By confirmPassword=By.name("confirmPassword");
    private static By submit=By.name("submit");
    private static By signIn=By.linkText("sign-in");
    private static By UserName=By.name("userName");
    private static By passwordLog=By.name("password");
    private static By submitLog=By.name("submit");
    private static By LogExi=By.xpath("//h3[contains(text(),'Login Successfully')]");




    @BeforeTest

    // Fernando Sastoque

    public static void setUp() {
        // Establecer la propiedad del sistema para indicar la ubicación del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");

        // Crear una instancia del navegador Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navegar a la página de Google
        driver.get("https://demo.guru99.com/test/newtours/");
    }
    @Test
    public static void paginaGuru() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);

        //Se declara y se da clic en register
        WebElement registerW=driver.findElement(register);
        wait.until(ExpectedConditions.visibilityOf(registerW));
        registerW.click();

        //Ingresar usuario
        WebElement emailW = driver.findElement(email);
        wait.until(ExpectedConditions.elementToBeClickable(emailW));
        emailW.sendKeys("Fernando");
        //Thread.sleep(100000);

        //Ingresar contraseña
        WebElement passwordW = driver.findElement(password);
        wait.until(ExpectedConditions.elementToBeClickable(passwordW));
        passwordW.sendKeys("Colombia123");
        //Thread.sleep(100000);

        //Confirmar contraseña
        WebElement confirmPasswordW = driver.findElement(confirmPassword);
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordW));
        confirmPasswordW.sendKeys("Colombia123");
        //Thread.sleep(10000);

        //Clic botón envíar
        WebElement submitW=driver.findElement(submit);
        wait.until(ExpectedConditions.visibilityOf(submitW));
        submitW.click();

        // clic enlace sign-in
        WebElement signInW=driver.findElement(signIn);
        wait.until(ExpectedConditions.visibilityOf(signInW));
        signInW.click();

        //Ingreso usuario Login
        WebElement UserNameW = driver.findElement(UserName);
        wait.until(ExpectedConditions.elementToBeClickable(UserNameW));
        UserNameW.sendKeys("Fernando");

        //Ingreso contraseña Login
        WebElement passwordLogW = driver.findElement(passwordLog);
        wait.until(ExpectedConditions.elementToBeClickable(passwordLogW));
        passwordLogW.sendKeys("Colombia123");

        //Clic botón envíar login
        WebElement submitLogW=driver.findElement(submitLog);
        wait.until(ExpectedConditions.visibilityOf(submitLogW));
        submitLogW.click();

        //Confirmación texto logueo Exitoso
        WebElement LogExiW=driver.findElement(LogExi);
        wait.until(ExpectedConditions.visibilityOf(LogExiW));



        //Assert.assertEquals();
    }
    @AfterTest
    public static  void tearDown(){
        // Cerrar el navegador
        driver.quit();
    }
}