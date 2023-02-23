// Q #11) Write a Java Program to demonstrate an explicit wait condition check.

package interviewQuesJava;

import java.util.concurrent.TimeUnit;

public class Q11_ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-arguments");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("Testing");
         element.submit();
         WebDriverWait wait = new WebDriverWait(driver, 20);

          WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Software testing - Wikipedia")));
element2.click();
}}
		

	}

}
