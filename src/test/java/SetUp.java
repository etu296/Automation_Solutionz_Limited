import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SetUp {
    WebDriver driver;
    @BeforeTest
     public void setUp() throws Exception
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ibos\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.zeuz.ai/");
        Thread.sleep(3000);
    }
    @Test (priority = 0, description = "visit the page & click header buttons")
    public void visitWebPage() throws Exception
    {
        driver.findElement(By.className("menu-item-1384")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("ast-custom-button")).click();
        Thread.sleep(3000);
        // enter first name
        List<WebElement> firstName = driver.findElements(By.id("form-field-email"));
        firstName.get(0).sendKeys("Etu Mahmuda ");
        Thread.sleep(1000);
        // enter last name
        List<WebElement> lastName = driver.findElements(By.id("form-field-04fbb9f"));
        lastName.get(0).sendKeys("Era ");
        Thread.sleep(1000);
        // enter mobile number
        List<WebElement> mobileNumber = driver.findElements(By.id("form-field-field_2"));
        mobileNumber.get(0).sendKeys("01315655618 ");
        Thread.sleep(1000);
        // enter website
        List<WebElement> companyWebsite = driver.findElements(By.id("form-field-field_6"));
        companyWebsite.get(0).sendKeys("ibos.io");
        Thread.sleep(1000);
        //select company size
        WebElement dropdownElement = driver.findElement(By.id("form-field-field_3"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("1");
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String selectedText = selectedOption.getText();
        System.out.println("Selected option is: " + selectedText);
        Thread.sleep(1000);
        // select role
        WebElement dropdownElement2 = driver.findElement(By.id("form-field-field_4"));
        Select dropdown2 = new Select(dropdownElement2);
        dropdown2.selectByVisibleText("Manual Tester");
        WebElement selectedOption2 = dropdown.getFirstSelectedOption();
        String selectedText2 = selectedOption.getText();
        System.out.println("Selected option is: " + selectedText2);
        //enter email
        Thread.sleep(1000);
        List<WebElement> email = driver.findElements(By.id("form-field-field_1"));
        email.get(0).sendKeys("etumahmuda@gmail");
        // enter info
        Thread.sleep(1000);
        List<WebElement> howKnow = driver.findElements(By.id("form-field-field_7"));
        howKnow.get(0).sendKeys("linked in");
        //click on check box
        WebElement checkboxElement = driver.findElement(By.id("form-field-field_5-0"));

        if (!checkboxElement.isSelected())
        {
            checkboxElement.click();
            System.out.println("Clicked Check box");

        }else {
            System.out.println("Checkbox is already selected.");
        }
    // click on request button
        Thread.sleep(1000);
        driver.findElement(By.className("elementor-button-text")).click();
        Thread.sleep(1000);


    }
//    @Test(priority = 1,description = "select dropdown")
//    public void selectDropdown() throws Exception
//    {
//        WebElement dropdownElement = driver.findElement(By.id("form-field-field_3"));
//        Select dropdown = new Select(dropdownElement);
//        dropdown.selectByVisibleText("option-1");
//    }

}
