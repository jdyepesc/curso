import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class mainTets {
    private static WebDriver driver;
    private static By PQR=By.xpath("//a[@href='/radicacion-pqrs']");
    private static By Nombre=By.xpath("//input[@data-qa-id='sb_pqrs_owner-names']");
    private static By Apellido=By.xpath("//input[@data-qa-id='sb_pqrs_owner_last-names']");
    private static By TipoDoc=By.xpath("//div[@class='mat-form-field-infix ng-tns-c65-5']");
    private static By SelCE=By.xpath("(//span [@class='mat-option-text']) [2]");
    private static By NumDoc=By.xpath("//input[@data-qa-id='sb_pqrs_document-number']");
    private static By BtnCon1=By.xpath("//button[@data-qa-id='sb_pqrs_user-data-form-submit']");
    private static By NumCel=By.xpath("//input[@data-qa-id='sb_pqrs_cellphone']");
    private static By Correo=By.xpath("//input[@data-qa-id='sb_pqrs_email']");
    private static By ConfCorreo=By.xpath("//input[@data-qa-id='sb_pqrs_email-confirmation']");
    private static By BtnCon2=By.xpath("//button[@data-qa-id='sb_pqrs_contact-form-submit-button']");
    private static By TipoSol=By.xpath("//span [@class='mat-select-placeholder mat-select-min-line ng-tns-c71-12 ng-star-inserted']");
    private static By SelFelicitaciones=By.xpath("(//span [@class='mat-option-text'])[2]");
    private static By Categoria=By.xpath("//div[@class='mat-form-field-infix ng-tns-c65-13']");
    private static By SelSoat=By.xpath("(//span [@class='mat-option-text'])[5]");
    private static By Descripcion=By.xpath("//textarea[@data-qa-id='sb_pqrs_reason']");
    private static By BtnCon3=By.xpath("//button[@data-qa-id='sb_pqrs_form-reason-submit-button']");
    private static By RadEx=By.xpath("//H1[@data-qa-id='sb_pqrs_title']");



    @BeforeTest

    // Fernando Sastoque

    public static void setUp() {
        // Establecer la propiedad del sistema para indicar la ubicación del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");

        // Crear una instancia del navegador Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navegar a la página de Google
        driver.get("https://pre.segurosbolivar.com/");
    }
    @Test
    public static void paginaSegurosBolivar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);



        //Se declara y se da clic en la opción Quejas y reclamos
        WebElement PQRW=driver.findElement(PQR);
        wait.until(ExpectedConditions.visibilityOf(PQRW));
        PQRW.click();
        Thread.sleep(7000);

        //Administrar las pestañas
        String mainTab = driver.getWindowHandle(); //id pestaña actual

        Set<String> handles = driver.getWindowHandles(); //captura el id de todas las pestañas
        for (String actualTab : handles) {
            if (!(actualTab.equalsIgnoreCase(mainTab))) {
                //cambiando  foco de pestaña
                driver.switchTo().window(actualTab);

            }

        }
        //Hacer Scroll
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(7000);*/

        //Ingresar Nombre
        WebElement NombreW=driver.findElement(Nombre);
        wait.until(ExpectedConditions.visibilityOf(NombreW));
        NombreW.sendKeys("Fernando");
        Thread.sleep(3000);

        //Ingresar Apellido
        WebElement ApellidoW=driver.findElement(Apellido);
        wait.until(ExpectedConditions.visibilityOf(ApellidoW));
        ApellidoW.sendKeys("Sastoque");
        Thread.sleep(3000);

        //Abrir lista Tipo documento
        WebElement TipoDocW=driver.findElement(TipoDoc);
        wait.until(ExpectedConditions.visibilityOf(TipoDocW));
        TipoDocW.click();
        Thread.sleep(3000);

        //Seleccionar CE
        WebElement SelCEW=driver.findElement(SelCE);
        wait.until(ExpectedConditions.visibilityOf(SelCEW));
        SelCEW.click();
        Thread.sleep(3000);

        //Ingresar Número de documento
        WebElement NumDocW=driver.findElement(NumDoc);
        wait.until(ExpectedConditions.visibilityOf(NumDocW));
        NumDocW.sendKeys("123456789");
        Thread.sleep(3000);

        //Clic Botón 1 continuar
        WebElement BtnCon1W=driver.findElement(BtnCon1);
        wait.until(ExpectedConditions.visibilityOf(BtnCon1W));
        BtnCon1W.click();
        Thread.sleep(7000);

        //Ingresar Número de celular
        WebElement NumCelW=driver.findElement(NumCel);
        wait.until(ExpectedConditions.visibilityOf(NumCelW));
        NumCelW.sendKeys("3107892345");
        Thread.sleep(3000);

        //Ingresar correo
        WebElement CorreoW=driver.findElement(Correo);
        wait.until(ExpectedConditions.visibilityOf(CorreoW));
        CorreoW.sendKeys("fsastoque@qvision.us");
        Thread.sleep(3000);

        //Ingresar Confirmar correo
        WebElement ConfCorreoW=driver.findElement(ConfCorreo);
        wait.until(ExpectedConditions.visibilityOf(ConfCorreoW));
        ConfCorreoW.sendKeys("fsastoque@qvision.us");
        Thread.sleep(3000);

        //Clic Botón 2 continuar
        WebElement BtnCon2W=driver.findElement(BtnCon2);
        wait.until(ExpectedConditions.visibilityOf(BtnCon2W));
        BtnCon2W.click();
        Thread.sleep(7000);

        //Abrir lista Tipo Solicitud
        WebElement TipoSolW=driver.findElement(TipoSol);
        wait.until(ExpectedConditions.visibilityOf(TipoSolW));
        TipoSolW.click();
        Thread.sleep(3000);


        //Seleccionar Felicitaciones
        WebElement SelFelicitacionesW=driver.findElement(SelFelicitaciones);
        wait.until(ExpectedConditions.visibilityOf(SelFelicitacionesW));
        SelFelicitacionesW.click();
        Thread.sleep(3000);

        //Abrir lista Categoria
        WebElement CategoriaW=driver.findElement(Categoria);
        wait.until(ExpectedConditions.visibilityOf(CategoriaW));
        CategoriaW.click();
        Thread.sleep(3000);

        //Seleccionar SOAT
        WebElement SelSoatW=driver.findElement(SelSoat);
        wait.until(ExpectedConditions.visibilityOf(SelSoatW));
        SelSoatW.click();
        Thread.sleep(3000);

        //Dejar descripción
        WebElement DescripcionW=driver.findElement(Descripcion);
        wait.until(ExpectedConditions.visibilityOf(DescripcionW));
        DescripcionW.sendKeys("El SOAT de Seguros Bolívar es el mejor");
        Thread.sleep(3000);

        //Clic Botón 3 continuar
        WebElement BtnCon3W=driver.findElement(BtnCon3);
        wait.until(ExpectedConditions.visibilityOf(BtnCon3W));
        BtnCon3W.click();
        Thread.sleep(50000);

        //Confirmación texto Radicación Exitosa
        WebElement RadExW=driver.findElement(RadEx);
        wait.until(ExpectedConditions.visibilityOf(RadExW));


        //Assert.assertFalse(RadExW.isDisplayed(),"Su PQR no fue registrada con exito");
        //Thread.sleep(10000);





    }
    @AfterTest
    public static  void tearDown(){
        // Cerrar el navegador
        driver.quit();
    }
}