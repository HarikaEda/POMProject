package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

public class SauceDemoLogin {
    //java kullanıyor gibi çalışmak için
/*@FindBy, Selenium WebDriver ile yazılan otomasyon testleri sırasında web sayfasındaki öğeleri
(elementleri) bulmak için kullanılan bir Annotasyondur.
@FindBy Annotasyonu, Page Object Model (POM) yaklaşımı ile birlikte kullanılarak,
 web sayfasındaki öğelerin tek bir yerde tanımlanmasını sağlar.
 Bu sayede, aynı öğeye farklı testlerde birden fazla yerde erişmek gerektiğinde, tek bir tanımlama ile işlem yapılabilir.
  Bu da testlerin bakımını kolaylaştırır ve tekrar kullanılabilirliği artırır.
 */

    public SauceDemoLogin() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    WebElement txtUsername;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(id = "login-button")
    WebElement btnLogin;

    public void enterUsername(String username) {
        txtUsername.sendKeys(username);
    }//bu methodlar isteğe baglı

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

}



