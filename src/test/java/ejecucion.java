import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ejecucion extends hooks {
    private WebDriverWait wait;

    public ejecucion() {
        wait = new WebDriverWait(driver,150);
    }

    @Test
    public void googleText() throws InterruptedException {


        driver.get("http://localhost:4000/register");
        WebElement txtBuscador = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(txtBuscador));
        txtBuscador.sendKeys("diego@lacafetalab.pe");

        WebElement txtBuscador1 = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(txtBuscador1));
        txtBuscador1.sendKeys("password");

        WebElement btnregister = driver.findElement(By.id("register"));
        wait.until(ExpectedConditions.elementToBeClickable(btnregister));
        btnregister.click();



        Thread.sleep(8000);
    }

    @Test
    public void googleText2() throws InterruptedException {


        driver.get("http://localhost:4000/register");
        WebElement txtBuscador = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(txtBuscador));
        txtBuscador.sendKeys("diego@lacafetalab.pe");

        WebElement txtBuscador1 = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(txtBuscador1));
        txtBuscador1.sendKeys("qedrt");

        WebElement btnregister = driver.findElement(By.id("register"));
        wait.until(ExpectedConditions.elementToBeClickable(btnregister));
        btnregister.click();

        Thread.sleep(8000);
 }
    @Test
    public void googleText1() throws InterruptedException {


        driver.get("http://localhost:4000/register");
        WebElement txtBuscador = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(txtBuscador));
        txtBuscador.sendKeys("");

        WebElement txtBuscador1 = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(txtBuscador1));
        txtBuscador1.sendKeys("");

        WebElement btnregister = driver.findElement(By.id("register"));
        wait.until(ExpectedConditions.elementToBeClickable(btnregister));
        btnregister.click();

        Thread.sleep(8000);
    }
}
