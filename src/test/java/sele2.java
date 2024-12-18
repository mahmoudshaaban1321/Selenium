import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class sele2 {

    public static WebDriver driver = new ChromeDriver();


    public static void main(String[] args) {


        openbrowserusingnavigation("https://practicetestautomation.com/practice-test-login/");
       // openbrowserusingnavigation("https://www.google.com/");
      //  openbrowserusingnavigation("https://www.hp.com/us-en/home.html");
/*
forward();
        back();
        forward();
        maximize ();
        setsizeiphone12pro();
        Full();
        minimize();
 */

        Entertext("student", "Password123");
        Click();
GetTextFromfield();
Clicklogout();
    }

    public static void openbroswer(String Url) {
        driver.get(Url);
    }

    //navigation
    public static void openbrowserusingnavigation(String url) {
        driver.navigate().to(url);
    }



    public static void back() {
        driver.navigate().back();
    }


    public static void forward ()
    {
        driver.navigate().forward();

    }

    public static void maximize (){
        driver.manage().window().maximize();
    }


    public static void setsizeiphone12pro ()
    {
        Dimension dimension = new Dimension(390,844);
        driver.manage().window().setSize(new Dimension(390,844));
    }


    public static void Full ()
    {
        driver.manage().window().fullscreen();
    }


    public static void minimize ()
    {
        driver.manage().window().minimize();
    }

    public static void Entertext (String username, String password)
    {
        By usernamelocator = By.id("username");
        By passwordlocator = By.id("password");
        driver.findElement(usernamelocator).sendKeys(username);
        driver.findElement(passwordlocator).sendKeys(password);
    }
    public static void Click ()
    {
        By loginbutton = By.id("submit");
        driver.findElement(loginbutton).click();
    }
    public static void GetTextFromfield ()
    {
        //*[@id="flash"]
        By flashmesssage = By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong");
        String Msge=driver.findElement(flashmesssage).getText();
        System.out.println(Msge);

//*[@id="loop-container"]/div/article/div[2]/div/div/div/a
    }

    public static void Clicklogout ()
    {
        By logoutbutton = By.xpath("//*[@id='loop-container']/div/article/div[2]/div/div/div/a");

        driver.findElement(logoutbutton).click();
    }


}
