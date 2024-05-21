package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */
public class ChromeBrowserTesting {
    public static void main(String[] args) {
        //BaseUrl = https://demo.nopcommerce.com/
        String baseUrl = "https://demo.nopcommerce.com/";
        //1.Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //3. Print the title of the page.
           String title=  driver.getTitle();
        System.out.println("The title of the page is :"+title);

       // 4. Print the current url.
       String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL is :"+currentUrl);

        //5. Print the page source.
        String pageSource = driver.getPageSource();
        System.out.println("The page Source : "+ pageSource);

        //6.Navigate to Url. “https://demo.nopcommerce.com/login?returnUrl=

        String loginUrl = ("https://demo.nopcommerce.com/login?returnUrl= %2F");
        driver.navigate().to(loginUrl);

        //7.Print the current url.

        System.out.println("The current Url :" +driver.getCurrentUrl());

        //8. Navigate back to the home page.
        driver.navigate().back();

        //9. Navigate to the login page.
            driver.findElement(By.className("ico-login")).click();
      // 10. Print the current url.
        System.out.println("Get the Current URL :"+driver.getCurrentUrl());

        //11. Refresh the page.
        driver.navigate().refresh();
       // 12. Enter the email to email field.
        driver.findElement(By.id("Email")).sendKeys("shubhamlohar123@gmail.com");
        //13. Enter the password to password field.
        driver.findElement(By.id("Password")).sendKeys("123Shbubham123");
        //14. Click on Login Button.
       driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        //15. Close the browser.
        driver.quit();









    }
}
